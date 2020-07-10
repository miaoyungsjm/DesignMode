package com.example.c17_mediator.sample;

/**
 * @author ggz
 * @date 2020/7/10
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void action();
}
