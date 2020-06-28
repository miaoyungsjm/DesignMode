package com.example.c5_factory.sample;

/**
 * @author ggz
 * @date 2020/6/28
 */
public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct() {
        // 切换产品
        return new ConcreteProductA();
//        return new ConcreteProductB();
    }
}
