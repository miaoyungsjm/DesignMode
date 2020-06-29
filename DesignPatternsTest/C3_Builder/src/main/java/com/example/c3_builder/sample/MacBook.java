package com.example.c3_builder.sample;

/**
 * @author ggz
 * @date 2020/6/29
 */
public class MacBook extends Computer {
    protected MacBook() {
    }

    @Override
    public void setOS() {
        mOS = "Mac OS 10.15 Catalina";
    }
}
