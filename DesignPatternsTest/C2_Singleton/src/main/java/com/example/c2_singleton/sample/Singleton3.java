package com.example.c2_singleton.sample;

/**
 * @author ggz
 * @date 2020/7/21
 * <p>
 * Double Check Lock
 * 第一次加载反应稍慢，也由于 Java 内存模型的原因偶尔会失败
 * 在高并发环境有一定的缺陷
 */
public class Singleton3 {

    private volatile static Singleton3 sInstance = null;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (sInstance == null) {
            synchronized (Singleton3.class) {
                if (sInstance == null) {
                    sInstance = new Singleton3();
                }
            }
        }
        return sInstance;
    }
}
