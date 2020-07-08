package com.example.c15_template;

/**
 * @author ggz
 * @date 2020/7/8
 */
public class AbstractComputer {
    protected void powerOn() {
        System.out.println("开启电源");
    }

    protected void checkHardware() {
        System.out.println("硬件检测");
    }

    protected void loadOs() {
        System.out.println("载入操作系统");
    }

    protected void login() {
        System.out.println("小白的计算机");
    }

    public final void startUp() {
        System.out.println("--- 开机 start ----");
        powerOn();
        checkHardware();
        loadOs();
        login();
        System.out.println("--- 关机  end  ----");
    }
}
