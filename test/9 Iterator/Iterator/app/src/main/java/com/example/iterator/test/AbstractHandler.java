package com.example.iterator.test;

import android.util.Log;

public abstract class AbstractHandler {
    private final String TAG = AbstractHandler.class.getSimpleName();
    public static final int HANDLER_LEVEL_ONE = 1;
    public static final int HANDLER_LEVEL_TWO = 2;
    public static final int HANDLER_LEVEL_THREE = 3;

    /**
     * 下一处理对象
     */
    public AbstractHandler nextHandler;

    /**
     * 处理请求
     */
    public final void handleRequest(AbstractRequest request) {
        // 处理条件判断
        if (getHandleLevel() == request.getRequestLevel()) {
            handle(request);
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                Log.e(TAG, "All of handler can not handle the request");
            }
        }
    }

    /**
     * 获取处理对象级别（处理限制）
     */
    protected abstract int getHandleLevel();

    /**
     * 处理对象的具体处理方式
     */
    protected abstract void handle(AbstractRequest request);
}
