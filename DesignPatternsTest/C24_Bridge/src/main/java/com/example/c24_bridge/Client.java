package com.example.c24_bridge;

import com.example.c24_bridge.demo.LargeCoffee;
import com.example.c24_bridge.demo.Ordinary;
import com.example.c24_bridge.demo.SmallCoffee;
import com.example.c24_bridge.demo.Sugar;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class Client {
    public static void main(String[] args) {
        Ordinary ordinary = new Ordinary();
        Sugar sugar = new Sugar();

        LargeCoffee largeCoffeeOrdinary = new LargeCoffee(ordinary);
        largeCoffeeOrdinary.makeCoffee();

        SmallCoffee smallCoffeeOrdinary = new SmallCoffee(ordinary);
        smallCoffeeOrdinary.makeCoffee();

        LargeCoffee largeCoffeeSugar = new LargeCoffee(sugar);
        largeCoffeeSugar.makeCoffee();

        SmallCoffee smallCoffeeSugar = new SmallCoffee(sugar);
        smallCoffeeSugar.makeCoffee();
    }
}
