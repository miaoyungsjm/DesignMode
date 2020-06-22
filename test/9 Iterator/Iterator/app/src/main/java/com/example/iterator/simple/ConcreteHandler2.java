package com.example.iterator.simple;

import android.util.Log;

/**
 * @author miaoyun
 */
public class ConcreteHandler2 extends Handler {
    private final String TAG = ConcreteHandler2.class.getSimpleName();

    @Override
    public void handleRequest(String condition) {
        if (condition.equals(TAG)) {
            Log.e(TAG, "handleRequest: " + TAG);
            return;
        } else {
            successor.handleRequest(condition);
        }
    }
}
