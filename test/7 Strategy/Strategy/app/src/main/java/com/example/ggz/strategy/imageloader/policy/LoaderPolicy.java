package com.example.ggz.strategy.imageloader.policy;

import com.example.ggz.strategy.imageloader.BitmapRequest;

public interface LoaderPolicy {
    public int compare(BitmapRequest request1, BitmapRequest request2);
}
