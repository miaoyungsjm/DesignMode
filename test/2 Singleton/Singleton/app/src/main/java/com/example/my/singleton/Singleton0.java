package com.example.my.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 饿汉模式
 *
 * 外加反序列化
 *
 * @author my
 * @date 2018/6/29
 */
public class Singleton0 implements Serializable {
    private static final long serialVersionUID = 0L;

    private static final Singleton0 INSTANCE = new Singleton0();

    private Singleton0() {

    }

    public static Singleton0 getInstance() {
        return INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
