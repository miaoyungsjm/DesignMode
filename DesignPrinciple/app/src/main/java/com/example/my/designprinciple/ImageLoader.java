package com.example.my.designprinciple;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 图片加载类
 *
 * @author my
 * @date 2018/6/27
 */
public class ImageLoader {

    /**
     * 图片缓存
     */
    ImageCache mImageCache = new ImageCache();

    /**
     * 定长线程池:
     * 1、可控制线程最大并发数
     * 2、超出的线程会在队列中等待
     */
    ExecutorService mExecutorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors());

    Handler mHandler = new Handler(Looper.getMainLooper());

    /**
     * 构造函数
     */
    public ImageLoader() {
        super();
    }


    /**
     * 加载图片
     */
    public void displayImage(final String url, final ImageView imageView) {
        // 从缓存读取 bitmap 数据
        Bitmap bitmap = mImageCache.get(url);
        if (bitmap != null){
            imageView.setImageBitmap(bitmap);
            return;
        }

        // 没有缓存，进行网络请求，并存入缓存
        imageView.setTag(url);
        // 向线程池提交任务
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(url);
                if (bitmap == null) {
                    return;
                }
                if (imageView.getTag().equals(url)) {
                    updateImageView(imageView, bitmap);
                }
                // 将 bitmap 数据存入缓存
                mImageCache.put(url, bitmap);
            }
        });
    }

    public Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(conn.getInputStream());
//            //允许输入流，即允许下载
//            conn.setDoInput(true);
//            //不使用缓冲
//            conn.setUseCaches(false);
//            //使用get请求
//            conn.setRequestMethod("GET");
//            //获取输入流，此时才真正建立链接
//            InputStream is = conn.getInputStream();
//            bitmap = BitmapFactory.decodeStream(is);
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    public void updateImageView(final ImageView imageView, final Bitmap bmp) {
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                imageView.setImageBitmap(bmp);
            }
        });
    }
}
