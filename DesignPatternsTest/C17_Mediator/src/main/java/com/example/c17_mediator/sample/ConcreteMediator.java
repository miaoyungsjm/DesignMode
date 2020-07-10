package com.example.c17_mediator.sample;

/**
 * @author ggz
 * @date 2020/7/10
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void method() {
        colleagueA.action();

        colleagueB.action();
    }
}
