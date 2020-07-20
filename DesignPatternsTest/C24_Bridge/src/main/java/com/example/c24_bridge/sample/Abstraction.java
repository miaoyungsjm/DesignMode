package com.example.c24_bridge.sample;

/**
 * @author ggz
 * @date 2020/7/20
 */
public abstract class Abstraction {
    private Implementor mImplementor;

    public Abstraction(Implementor implementor) {
        mImplementor = implementor;
    }

    public void operation() {
        mImplementor.operationImpl();
    }
}
