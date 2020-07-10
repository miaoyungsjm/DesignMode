package com.example.c17_mediator.demo;

/**
 * @author ggz
 * @date 2020/7/10
 */
public class CDDevice extends Colleague {
    private String data;

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String read() {
        return data;
    }

    public void load(String data) {
        this.data = data;

        mediator.changed(this);
    }
}
