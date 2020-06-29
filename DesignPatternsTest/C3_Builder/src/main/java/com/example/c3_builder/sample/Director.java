package com.example.c3_builder.sample;

/**
 * @author ggz
 * @date 2020/6/29
 */
public class Director {
    private Builder mBuilder = null;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public void construct(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
