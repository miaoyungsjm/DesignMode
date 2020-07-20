package com.example.c24_bridge.demo;

/**
 * @author ggz
 * @date 2020/7/20
 */
public abstract class Coffee {
    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    public abstract void makeCoffee();
}
