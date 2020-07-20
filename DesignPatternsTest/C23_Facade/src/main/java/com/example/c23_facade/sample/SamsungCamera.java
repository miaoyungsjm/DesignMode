package com.example.c23_facade.sample;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class SamsungCamera implements Camera {
    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }
}
