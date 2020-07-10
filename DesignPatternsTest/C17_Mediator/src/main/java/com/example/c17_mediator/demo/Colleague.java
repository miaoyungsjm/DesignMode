package com.example.c17_mediator.demo;

/**
 * @author ggz
 * @date 2020/7/10
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}
