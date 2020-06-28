package com.example.c5_factory.sample3;

import com.example.c5_factory.sample.ConcreteProductA;
import com.example.c5_factory.sample.Factory;
import com.example.c5_factory.sample.Product;

/**
 * @author ggz
 * @date 2020/6/28
 */
public class ConcreteFactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
