package com.example.c23_facade;

import com.example.c23_facade.sample.MobilePhone;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class Client {
    public static void main(String[] args) {
        MobilePhone nexus4 = new MobilePhone();
        nexus4.takePicture();
        nexus4.closeCamera();

        nexus4.videoChat();
        nexus4.hangup();
        nexus4.closeCamera();
    }
}
