package com.example.iterator.test;

import android.util.Log;

public class Handler2 extends AbstractHandler {
    private final String TAG = Handler2.class.getSimpleName();

    @Override
    protected int getHandleLevel() {
        return HANDLER_LEVEL_TWO;
    }

    @Override
    protected void handle(AbstractRequest request) {
        Log.e(TAG, TAG + "handle request: " + request.getRequestLevel());
    }
}
