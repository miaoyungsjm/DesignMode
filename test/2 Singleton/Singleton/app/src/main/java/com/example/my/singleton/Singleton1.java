package com.example.my.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉模式（不建议）
 * 第一次加载需要及时实例化
 * 每次调用 getInstance() 都需要进行同步，浪费资源
 *
 * @author my
 * @date 2018/6/29
 */
public class Singleton1 implements Serializable {

    private static final long serialVersionUID = 0L;

    private static Singleton1 instance;

    private Singleton1() {

    }

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
