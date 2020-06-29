package com.example.c3_builder.sample;

/**
 * @author ggz
 * @date 2020/6/29
 */
public abstract class Builder {
    public abstract void buildBoard(String board);

    public abstract void buildDisplay(String display);

    public abstract void buildOS();

    public abstract Computer create();
}
