package com.example.ggz.factory.demo2;

public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
