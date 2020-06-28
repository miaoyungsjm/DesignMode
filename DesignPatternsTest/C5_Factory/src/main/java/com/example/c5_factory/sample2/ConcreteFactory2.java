package com.example.c5_factory.sample2;

import com.example.c5_factory.sample.Product;

/**
 * @author ggz
 * @date 2020/6/28
 */
public class ConcreteFactory2 extends Factory2 {
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
