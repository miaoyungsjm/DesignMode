package com.example.c24_bridge.demo;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class LargeCoffee extends Coffee {
    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Large " + impl.addSomething() + " Coffee");
    }
}
