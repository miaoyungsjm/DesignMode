package com.example.ggz.strategy.imageloader.builder;

public class DisplayConfig {
    public int loadingResId;
    public int failedResId;

    public int getLoadingResId() {
        return loadingResId;
    }

    public void setLoadingResId(int loadingResId) {
        this.loadingResId = loadingResId;
    }

    public int getFailedResId() {
        return failedResId;
    }

    public void setFailedResId(int failedResId) {
        this.failedResId = failedResId;
    }
}
