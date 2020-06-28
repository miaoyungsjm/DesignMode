package com.example.c5_factory;


import com.example.c5_factory.sample.ConcreteFactory;
import com.example.c5_factory.sample.ConcreteProductA;
import com.example.c5_factory.sample.Factory;
import com.example.c5_factory.sample.Product;
import com.example.c5_factory.sample2.ConcreteFactory2;
import com.example.c5_factory.sample2.Factory2;
import com.example.c5_factory.sample3.ConcreteFactoryA;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class Client {
    public static void main(String[] args) {
        // ----------------------   单工厂
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        product.method();
        // ----------------------   单工厂优化
        Factory2 factory2 = new ConcreteFactory2();
        Product product2 = factory2.createProduct(ConcreteProductA.class);
        product2.method();
        // ----------------------   多工厂
        Factory factory3 = new ConcreteFactoryA();
        Product product3 = factory3.createProduct();
        product3.method();
    }
}
