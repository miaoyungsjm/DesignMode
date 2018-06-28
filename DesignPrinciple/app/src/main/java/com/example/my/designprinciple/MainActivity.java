package com.example.my.designprinciple;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.my.designprinciple.imageloader.DiskCache;
import com.example.my.designprinciple.imageloader.DoubleCache;
import com.example.my.designprinciple.imageloader.ImageCache;
import com.example.my.designprinciple.imageloader.ImageLoader;
import com.example.my.designprinciple.imageloader.MemoryCache;

/**
 * MainActivity
 *
 * @author my
 * @date 2018/6/27
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // ToDo 需要修改为单例模式
        ImageLoader imageLoader = new ImageLoader();
        // 使用内存缓存
        imageLoader.setImageCache(new MemoryCache());
        // 使用 SD 卡缓存
        imageLoader.setImageCache(new DiskCache());
        // 使用双缓存
        imageLoader.setImageCache(new DoubleCache());
        // 自定义缓存
        imageLoader.setImageCache(new ImageCache() {
            @Override
            public Bitmap get(String url) {
                return null;
            }

            @Override
            public void put(String url, Bitmap bmp) {

            }
        });

    }
}
