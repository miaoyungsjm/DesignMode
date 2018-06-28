package com.example.my.designprinciple.imageloader;

import android.graphics.Bitmap;

/**
 * 双缓存
 *
 * @author my
 * @date 2018/6/28
 */
public class DoubleCache implements ImageCache {
    ImageCache mMemoryCache = new MemoryCache();
    ImageCache mDiskCache = new DiskCache();

    public DoubleCache() {
        super();
    }

    @Override
    public Bitmap get(String url) {
        // 先从内存缓存中获取图片，如果没有，再从SD卡中获取
        Bitmap bitmap = mMemoryCache.get(url);
        if (bitmap == null) {
            bitmap = mDiskCache.get(url);
        }
        return bitmap;
    }

    @Override
    public void put(String url, Bitmap bmp) {
        // 将图片缓存到内存和 SD 卡中
        mMemoryCache.put(url, bmp);
        mDiskCache.put(url, bmp);
    }
}
