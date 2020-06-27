package com.example.c9_iterator.demo;

/**
 * @author ggz
 * @date 2020/6/27
 */
public abstract class AbstractHandler {
    public static final int HANDLER_LEVEL_ONE = 1;
    public static final int HANDLER_LEVEL_TWO = 2;
    public static final int HANDLER_LEVEL_THREE = 3;

    public AbstractHandler nextHandler;

    public final void handleRequest(AbstractRequest request) {
        // 处理条件判断
        if (getHandleLevel() == request.getRequestLevel()) {
            handle(request);
        } else {
            if (nextHandler != null) {
                // 传递
                nextHandler.handleRequest(request);
            } else {
                System.out.println("All of handler can not handle the request");
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
