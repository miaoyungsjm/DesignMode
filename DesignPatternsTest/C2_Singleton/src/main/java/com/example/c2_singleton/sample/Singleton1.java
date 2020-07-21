package com.example.c2_singleton.sample;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author ggz
 * @date 2020/7/21
 * <p>
 * 饿汉模式
 * 外加反序列化
 */
public class Singleton1 implements Serializable {

    private static final long serialVersionUID = 0L;
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
