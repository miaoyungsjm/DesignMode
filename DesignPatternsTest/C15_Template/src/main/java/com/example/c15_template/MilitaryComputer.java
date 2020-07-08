package com.example.c15_template;

/**
 * @author ggz
 * @date 2020/7/8
 */
public class MilitaryComputer extends AbstractComputer {

    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("检查硬件防火墙");
    }

    @Override
    protected void login() {
        System.out.println("人脸识别");
    }
}
