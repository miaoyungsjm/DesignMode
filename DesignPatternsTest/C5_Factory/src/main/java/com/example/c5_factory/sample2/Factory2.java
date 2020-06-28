package com.example.c5_factory.sample2;

import com.example.c5_factory.sample.Product;

/**
 * @author ggz
 * @date 2020/6/28
 */
public abstract class Factory2 {
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
