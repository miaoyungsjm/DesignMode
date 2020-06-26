package com.example.c12_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author ggz
 * @date 2020/6/26
 */
public class ConcreteObserver implements Observer {
    public String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + ", Observable update: " + arg);
    }
}
