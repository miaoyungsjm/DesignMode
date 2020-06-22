package com.example.iterator.test;

import android.util.Log;

public class Handler1 extends AbstractHandler {
    private final String TAG = Handler1.class.getSimpleName();

    @Override
    protected int getHandleLevel() {
        return HANDLER_LEVEL_ONE;
    }

    
    @Override
    protected void handle(AbstractRequest request) {
        Log.e(TAG, TAG + "handle request: " + request.getRequestLevel());
    }
}
