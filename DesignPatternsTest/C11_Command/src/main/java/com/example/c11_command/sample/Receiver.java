package com.example.c11_command.sample;

/**
 * @author ggz
 * @date 2020/6/26
 */
public class Receiver {
    /**
     * 执行相关命令的具体逻辑
     * 行动方法
     */
    public void saveData() {
        System.out.println("Receiver: saveData");
    }

    public void shutdown() {
        System.out.println("Receiver: shutdown");
    }

    public void reboot() {
        System.out.println("Receiver: reboot");
    }

    public void standby() {
        System.out.println("Receiver: standby");
    }
}
