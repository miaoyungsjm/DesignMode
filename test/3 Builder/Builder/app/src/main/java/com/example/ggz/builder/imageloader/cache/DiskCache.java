package com.example.ggz.builder.imageloader.cache;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.ggz.builder.imageloader.util.CloseUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DiskCache implements ImageCache {
    static String cacheDir = "sdcard/cache";

    // 从缓存中获取图片
    @Override
    public Bitmap get(String url) {
        return BitmapFactory.decodeFile(cacheDir + url);
    }

    // 将图片缓存到内存中
    @Override
    public void put(String url, Bitmap bmp) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(cacheDir + url);
            bmp.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
//            if (fileOutputStream != null) {
//                try {
//                    fileOutputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            /*
             * InterfaceSegregation Principle
             * */
            CloseUtils.closeQuietly(fileOutputStream);
        }
    }
}
