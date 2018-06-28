package com.example.my.designprinciple.imageloader;

import android.graphics.Bitmap;

/**
 * @author my
 * @date 2018/6/28
 */
public interface ImageCache {
    public Bitmap get(String url);

    public void put(String url, Bitmap bmp);
}
