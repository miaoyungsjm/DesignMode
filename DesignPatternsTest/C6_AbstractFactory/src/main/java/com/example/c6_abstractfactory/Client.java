package com.example.c6_abstractfactory;

import com.example.c6_abstractfactory.sample.AbstractFactory;
import com.example.c6_abstractfactory.sample.ConcreteFactory1;
import com.example.c6_abstractfactory.sample.ConcreteFactory2;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class Client {
    public static void main(String[] args) {
        // ----------------------
        AbstractFactory factory1 = new ConcreteFactory1();
        factory1.createProductA().method();
        factory1.createProductB().method();
        System.out.println("----------------------");
        AbstractFactory factory2 = new ConcreteFactory2();
        factory2.createProductA().method();
        factory2.createProductB().method();
    }
}
