package com.example.c8_state;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class Client {
    public static void main(String[] args) {
        // ----------------------
        TvController tvController = new TvController();
        tvController.powerOn();
        tvController.nextChannel();
        tvController.turnUp();

        tvController.powerOff();
        tvController.prevChannel();
        tvController.turnUp();
    }
}
