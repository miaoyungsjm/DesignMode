package com.example.c17_mediator.sample;

/**
 * @author ggz
 * @date 2020/7/10
 */
public abstract class Mediator {
    protected ConcreteColleagueA colleagueA;
    protected ConcreteColleagueB colleagueB;

    public abstract void method();

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
