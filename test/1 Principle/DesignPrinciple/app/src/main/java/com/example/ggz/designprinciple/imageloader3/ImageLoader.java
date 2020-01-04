package com.example.ggz.designprinciple.imageloader3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Open Close Principle
 *
 * 对于扩展是开放的
 * 对于修改是封闭的
 *
 * 问题点：
 * 每当新加一种缓存策略，
 * 都得在 ImageLoader 做判断和修改
 *
 * 手段：抽象
 */
public class ImageLoader {
//    // 内存缓存
//    MemoryCache mMemoryCache = new MemoryCache();
//    // SD 卡缓存
//    DiskCache mDiskCache = new DiskCache();
//    // 双缓存
//    DoubleCache mDoubleCache = new DoubleCache();
//    // 选择缓存策略
//    boolean isUseDiskCache = false;
//    boolean isUseDoubleCache = false;

    // 图片缓存
    ImageCache mImageCache = new MemoryCache();

    // 线程池,线程数量为 CPU 的数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors());
    // UI Handler
    Handler mUiHandler = new Handler(Looper.getMainLooper());

    /*
    * Dependence Inversion Principle
    *
    * */
    // 注入缓存实现
    public void setmImageCache(ImageCache cache) {
        mImageCache = cache;
    }

    // 加载图片
    public void displayImage(final String url, final ImageView imageView) {
//        Bitmap bitmap = null;
//        if (isUseDoubleCache) {
//            bitmap = mDoubleCache.get(url);
//        } else if (isUseDiskCache) {
//            bitmap = mDiskCache.get(url);
//        } else {
//            bitmap = mMemoryCache.get(url);
//        }

        Bitmap bitmap = mImageCache.get(url);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }

        // 图片没有缓存，提交到线程池下载图片
        submitLoadRequest(url, imageView);
    }

    private void submitLoadRequest(final String imageUrl, final ImageView imageView) {
        imageView.setTag(imageUrl);
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(imageUrl);
                if (bitmap == null) {
                    return;
                }
                if (imageView.getTag().equals(imageUrl)) {
                    updateImageView(imageView, bitmap);
                }
                mImageCache.put(imageUrl, bitmap);
            }
        });
    }

    public Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(conn.getInputStream());
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    private void updateImageView(final ImageView imageView, final Bitmap bmp) {
        mUiHandler.post(new Runnable() {
            @Override
            public void run() {
                imageView.setImageBitmap(bmp);
            }
        });
    }

//    public void useDoubleCache(boolean useDoubleCache) {
//        isUseDoubleCache = useDoubleCache;
//    }
//
//    public void useDiskCache(boolean useDiskCache) {
//        isUseDiskCache = useDiskCache;
//    }
}
