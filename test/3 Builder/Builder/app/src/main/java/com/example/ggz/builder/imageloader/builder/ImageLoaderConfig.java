package com.example.ggz.builder.imageloader.builder;

import com.example.ggz.builder.imageloader.cache.ImageCache;
import com.example.ggz.builder.imageloader.cache.MemoryCache;

public class ImageLoaderConfig {
    private ImageCache imageCache = new MemoryCache();
    private DisplayConfig displayConfig = new DisplayConfig();
    private LoaderPolicy loaderPolicy = new LoaderPolicy();
    private int threadCount = Runtime.getRuntime().availableProcessors() + 1;

    private ImageLoaderConfig() {
    }

    public ImageCache getImageCache() {
        return imageCache;
    }

    public DisplayConfig getDisplayConfig() {
        return displayConfig;
    }

    public LoaderPolicy getLoaderPolicy() {
        return loaderPolicy;
    }

    public int getThreadCount() {
        return threadCount;
    }

    /**
     * 配置类的 Builder
     */
    public static class Builder {
        ImageCache imageCache = new MemoryCache();
        DisplayConfig displayConfig = new DisplayConfig();
        LoaderPolicy loaderPolicy = new LoaderPolicy();
        int threadCount = Runtime.getRuntime().availableProcessors() + 1;

        public Builder setThreadCount(int count) {
            threadCount = Math.max(1, count);
            return this;
        }

        public Builder setCache(ImageCache cache) {
            imageCache = cache;
            return this;
        }

        public Builder setLoadingPlaceholder(int resId) {
            displayConfig.setLoadingResId(resId);
            return this;
        }

        public Builder setNotFoundPlaceholder(int resId) {
            displayConfig.setFailedResId(resId);
            return this;
        }

        public Builder setLoadPolicy(LoaderPolicy policy) {
            if (policy != null) {
                loaderPolicy = policy;
            }
            return this;
        }

        private void applyConfig(ImageLoaderConfig config) {
            config.imageCache = this.imageCache;
            config.displayConfig = this.displayConfig;
            config.loaderPolicy = this.loaderPolicy;
            config.threadCount = this.threadCount;
        }

        public ImageLoaderConfig create() {
            ImageLoaderConfig config = new ImageLoaderConfig();
            applyConfig(config);
            return config;
        }
    }
}
