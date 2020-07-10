package com.example.c16_visitor;

import java.util.Random;

/**
 * @author ggz
 * @date 2020/7/10
 */
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLine() {
        return new Random().nextInt(10 * 10000);
    }
}
