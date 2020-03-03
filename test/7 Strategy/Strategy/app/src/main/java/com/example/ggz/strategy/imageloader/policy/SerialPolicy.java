package com.example.ggz.strategy.imageloader.policy;

import com.example.ggz.strategy.imageloader.BitmapRequest;

public class SerialPolicy implements LoaderPolicy {
    @Override
    public int compare(BitmapRequest request1, BitmapRequest request2) {
        return request1.serialNum - request2.serialNum;
    }
}
