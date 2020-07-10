package com.example.c17_mediator;


import com.example.c17_mediator.demo.CDDevice;
import com.example.c17_mediator.demo.CPU;
import com.example.c17_mediator.demo.GraphicsCard;
import com.example.c17_mediator.demo.MainBoard;
import com.example.c17_mediator.demo.Mediator;
import com.example.c17_mediator.demo.SoundCard;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class Client {
    public static void main(String[] args) {
        // ----------------------
        MainBoard mainBoard = new MainBoard();

        CPU cpu = new CPU(mainBoard);
        GraphicsCard graphicsCard = new GraphicsCard(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);
        CDDevice cdDevice = new CDDevice(mainBoard);

        mainBoard.setCpu(cpu);
        mainBoard.setGraphicsCard(graphicsCard);
        mainBoard.setSoundCard(soundCard);
        mainBoard.setCdDevice(cdDevice);

        cdDevice.load("视频数据,音频数据");
    }
}
