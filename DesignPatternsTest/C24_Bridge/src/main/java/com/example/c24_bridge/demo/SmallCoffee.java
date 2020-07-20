package com.example.c24_bridge.demo;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Small " + impl.addSomething() + " Coffee");
    }
}
