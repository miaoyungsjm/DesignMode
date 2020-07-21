package com.example.c2_singleton.sample;

/**
 * @author ggz
 * @date 2020/7/21
 * <p>
 * 静态内部类（推荐）
 * 第一次调用 getInstance 方法会导致虚拟机加载 SingletonHolder 类
 * 不仅确保线程安全，也保证对象唯一，同时延迟了单例的实例化
 */
public class Singleton4 {

    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
