package com.example.ggz.strategy.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import com.example.ggz.strategy.imageloader.builder.DisplayConfig;
import com.example.ggz.strategy.imageloader.builder.ImageLoaderConfig;
import com.example.ggz.strategy.imageloader.policy.LoaderPolicy;
import com.example.ggz.strategy.imageloader.cache.ImageCache;
import com.example.ggz.strategy.imageloader.cache.MemoryCache;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImageLoader {
    private volatile static ImageLoader sInstance = null;

    // 图片加载配置对象
    private ImageLoaderConfig mConfig;

    // 图片缓存
    ImageCache mImageCache = new MemoryCache();
    int mLoadingImageId;
    int mLoadingFailedImageId;
    // 图片加载策略
    LoaderPolicy mLoaderPolicy;
    int mThreadCount;
    // 线程池,线程数量为 CPU 的数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors());
    // UI Handler
    Handler mUiHandler = new Handler(Looper.getMainLooper());

    private ImageLoader() {
    }

    // DCL 单例
    public static ImageLoader getInstance() {
        if (sInstance == null) {
            synchronized (ImageLoader.class) {
                if (sInstance == null) {
                    sInstance = new ImageLoader();
                }
            }
        }
        return sInstance;
    }

    public void init(ImageLoaderConfig config) {
        mConfig = config;
        // 检查配置合法性，内部根据配置做初始化
        checkConfig();
    }

    private void checkConfig() {
        // 注入缓存实现
        mImageCache = mConfig.getImageCache();
        mLoadingImageId = mConfig.getDisplayConfig().getLoadingResId();
        mLoadingFailedImageId = mConfig.getDisplayConfig().getFailedResId();
        mLoaderPolicy = mConfig.getLoaderPolicy();
        mThreadCount = mConfig.getThreadCount();
        if (mThreadCount != 0) {
            setThreadCount(mThreadCount);
        }
    }

    private void setThreadCount(int count) {
        mExecutorService.shutdown();
        mExecutorService = null;
        mExecutorService = Executors.newFixedThreadPool(count);
    }

    public void displayImage(final String url, final ImageView imageView,
                             final DisplayConfig config, BitmapRequest.MyRequestListener listener) {
        BitmapRequest request = new BitmapRequest(url, imageView, config, listener);
        // 客户自定义 DisplayConfig
        request.displayConfig =
                request.displayConfig != null ? request.displayConfig : mConfig.getDisplayConfig();
        // 设置加载策略
        request.setLoaderPolicy(mConfig.getLoaderPolicy());
        // 添加到队列中
//        mImageQueue.addRequest(request);
    }

    // 加载图片
    public void displayImage(final String url, final ImageView imageView) {
        Bitmap bitmap = mImageCache.get(url);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        // 图片没有缓存，提交到线程池下载图片
        submitLoadRequest(url, imageView);
    }

    private void submitLoadRequest(final String imageUrl, final ImageView imageView) {
        imageView.setImageResource(mLoadingImageId);
        imageView.setTag(imageUrl);
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(imageUrl);
                if (bitmap == null) {
                    imageView.setImageResource(mLoadingFailedImageId);
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
}
