package com.example.c8_state;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("do nothing");
    }

    @Override
    public void prevChannel() {
        System.out.println("do nothing");
    }

    @Override
    public void turnUp() {
        System.out.println("do nothing");
    }

    @Override
    public void turnDown() {
        System.out.println("do nothing");
    }
}
