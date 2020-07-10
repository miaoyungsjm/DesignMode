package com.example.c17_mediator.demo;

/**
 * @author ggz
 * @date 2020/7/10
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void audioPlay(String data) {
        System.out.println("音频: " + data);
    }
}
