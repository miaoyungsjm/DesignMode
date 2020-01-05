package com.example.my.singleton;

/**
 * Double Check Lock
 * 第一次加载反应稍慢
 * 在高并发环境有一定的缺陷
 *
 * @author my
 * @date 2018/6/29
 */
public class Singleton2 {

    private volatile static Singleton2 instance = null;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
