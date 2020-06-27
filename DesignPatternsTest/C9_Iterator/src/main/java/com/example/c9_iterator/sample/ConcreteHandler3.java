package com.example.c9_iterator.sample;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class ConcreteHandler3 extends Handler {
    private final String TAG = ConcreteHandler3.class.getSimpleName();

    @Override
    public void handleRequest(String condition) {
        if (condition.equals(TAG)) {
            System.out.println("handleRequest: " + TAG);
        } else {
            System.out.println("successor: " + TAG);
            successor.handleRequest(condition);
        }
    }
}
