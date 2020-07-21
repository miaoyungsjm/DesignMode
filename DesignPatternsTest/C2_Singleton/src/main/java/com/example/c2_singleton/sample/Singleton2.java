package com.example.c2_singleton.sample;

/**
 * @author ggz
 * @date 2020/7/21
 * <p>
 * 懒汉模式（不建议）
 * 第一次加载需要及时进行实例化,反应稍慢
 * 最大问题是每次调用 getInstance() 都需要进行同步，浪费资源
 */
public class Singleton2 {

    private static Singleton2 sInstance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (sInstance == null) {
            sInstance = new Singleton2();
        }
        return sInstance;
    }
}
