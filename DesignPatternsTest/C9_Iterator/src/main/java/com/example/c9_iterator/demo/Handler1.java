package com.example.c9_iterator.demo;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class Handler1 extends AbstractHandler {
    private final String TAG = Handler1.class.getSimpleName();

    @Override
    protected int getHandleLevel() {
        return HANDLER_LEVEL_ONE;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println(TAG + " handle: request level " + request.getRequestLevel());
        System.out.println(TAG + " content: " + request.getContent());
    }
}
