package com.example.ggz.strategy;

import android.app.Application;

import com.example.ggz.strategy.imageloader.ImageLoader;
import com.example.ggz.strategy.imageloader.builder.ImageLoaderConfig;
import com.example.ggz.strategy.imageloader.cache.DoubleCache;
import com.example.ggz.strategy.imageloader.policy.ReversePolicy;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Builder
        ImageLoaderConfig config = new ImageLoaderConfig.Builder()
                .setCache(new DoubleCache())
                .setLoadingPlaceholder(R.drawable.ic_launcher_foreground)
                .setNotFoundPlaceholder(R.drawable.ic_launcher_background)
                .setLoadPolicy(new ReversePolicy())
                .setThreadCount(4)
                .create();

        ImageLoader.getInstance().init(config);
    }
}
