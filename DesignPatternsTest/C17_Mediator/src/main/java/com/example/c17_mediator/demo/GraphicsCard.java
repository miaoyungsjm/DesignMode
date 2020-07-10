package com.example.c17_mediator.demo;

/**
 * @author ggz
 * @date 2020/7/10
 */
public class GraphicsCard extends Colleague {

    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public void videoPlay(String data) {
        System.out.println("视频: " + data);
    }
}
