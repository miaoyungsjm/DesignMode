package com.example.c17_mediator.demo;

/**
 * @author ggz
 * @date 2020/7/10
 */
public class CPU extends Colleague {
    private String videoData;
    private String audioData;

    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getVideoData() {
        return videoData;
    }

    public String getAudioData() {
        return audioData;
    }

    public void decodeData(String data) {
        String[] tmp = data.split(",");
        videoData = tmp[0];
        audioData = tmp[1];

        mediator.changed(this);
    }
}
