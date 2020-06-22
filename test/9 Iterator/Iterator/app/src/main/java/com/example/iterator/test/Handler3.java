package com.example.iterator.test;

import android.util.Log;

public class Handler3 extends AbstractHandler {
    private final String TAG = Handler3.class.getSimpleName();

    @Override
    protected int getHandleLevel() {
        return HANDLER_LEVEL_THREE;
    }

    @Override
    protected void handle(AbstractRequest request) {
        Log.e(TAG, TAG + "handle request: " + request.getRequestLevel());
    }
}
