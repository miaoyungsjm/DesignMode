package com.example.c3_builder.sample;

/**
 * @author ggz
 * @date 2020/6/29
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer() {
    }

    public void setBoard(String board) {
        mBoard = board;
    }

    public void setDisplay(String display) {
        mDisplay = display;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer :\nmBoard = " + mBoard + "\nmDisplay = " + mDisplay + "\nmOS = " + mOS;
    }
}
