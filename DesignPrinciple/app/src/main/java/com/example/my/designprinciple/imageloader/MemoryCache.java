package com.example.my.designprinciple.imageloader;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * 内存缓存
 *
 * @author my
 * @date 2018/6/27
 */
public class MemoryCache implements ImageCache {

    private LruCache<String, Bitmap> mMemoryCache;

    public MemoryCache() {
        initCache();
    }

    private void initCache() {
        // 计算可使用的最大内存
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);

        // 取 1/4 的可以内存作为缓存
        int cacheSize = maxMemory / 4;

        mMemoryCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024;
            }
        };
    }


    @Override
    public Bitmap get(String url) {
        return mMemoryCache.get(url);
    }

    @Override
    public void put(String url, Bitmap bmp) {
        mMemoryCache.put(url, bmp);
    }
}
