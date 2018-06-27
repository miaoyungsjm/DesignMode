package com.example.my.designprinciple;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * 图片缓存
 *
 * @author my
 * @date 2018/6/27
 */
public class ImageCache {
    /**
     * 图片缓存
     */
    LruCache<String, Bitmap> mLruCache;

    public ImageCache() {
        initImageCache();
    }

    private void initImageCache() {
        // 计算可使用的最大内存
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);

        // 取 1/4 的可以内存作为缓存
        int cacheSize = maxMemory / 4;

        mLruCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024;
            }
        };
    }

    public void put(String url, Bitmap bitmap) {
        mLruCache.put(url, bitmap);
    }

    public Bitmap get(String url) {
        return mLruCache.get(url);
    }
}
