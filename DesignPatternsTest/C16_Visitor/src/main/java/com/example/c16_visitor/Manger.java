package com.example.c16_visitor;

import java.util.Random;

/**
 * @author ggz
 * @date 2020/7/10
 */
public class Manger extends Staff {
    private int products;

    public Manger(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return products;
    }
}
