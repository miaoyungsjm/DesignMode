package com.example.my.singleton;

/**
 * 静态内部类（推荐）
 *
 * @author my
 * @date 2018/6/29
 */
public class Singleton3 {

    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
