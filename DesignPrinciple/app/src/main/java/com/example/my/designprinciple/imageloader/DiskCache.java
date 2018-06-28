package com.example.my.designprinciple.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 本地缓存
 *
 * @author my
 * @date 2018/6/27
 */
public class DiskCache implements ImageCache {
    private static String cacheDir = "sdcard/cache";

    public DiskCache() {
        super();
    }

    @Override
    public Bitmap get(String url) {
        // 从本地文件中获取 bitmap
        return BitmapFactory.decodeFile(cacheDir + url);
    }

    @Override
    public void put(String url, Bitmap bmp) {
        // 将 bitmap 写入文件
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(cacheDir + url);
            bmp.compress(Bitmap.CompressFormat.PNG, 100, fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
