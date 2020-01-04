package com.example.ggz.designprinciple.imageloader3;

import android.graphics.Bitmap;

/**
 *
 * */
public interface ImageCache {
    public Bitmap get(String url);

    public void put(String url, Bitmap bmp);
}
