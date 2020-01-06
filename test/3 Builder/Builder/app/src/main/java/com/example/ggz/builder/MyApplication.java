package com.example.ggz.builder;

import android.app.Application;

import com.example.ggz.builder.imageloader.ImageLoader;
import com.example.ggz.builder.imageloader.builder.ImageLoaderConfig;
import com.example.ggz.builder.imageloader.cache.DoubleCache;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Builder
        ImageLoaderConfig config = new ImageLoaderConfig.Builder()
                .setCache(new DoubleCache())
                .setLoadingPlaceholder(R.drawable.ic_launcher_foreground)
                .setNotFoundPlaceholder(R.drawable.ic_launcher_background)
                .setThreadCount(4)
                .setLoadPolicy(null)
                .create();

        ImageLoader.getInstance().init(config);
    }
}
