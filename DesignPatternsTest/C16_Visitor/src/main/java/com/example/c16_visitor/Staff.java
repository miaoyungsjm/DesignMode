package com.example.c16_visitor;

import java.util.Random;

/**
 * @author ggz
 * @date 2020/7/9
 */
public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    /**
     * 接收 Visitor 访问
     */
    public abstract void accept(Visitor visitor);
}
