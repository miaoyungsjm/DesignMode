package com.example.ggz.factory.demo1;

public class ConcreteFactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
