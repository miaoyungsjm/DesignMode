package com.example.c23_facade.sample;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class PhoneImp implements Phone {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }
}
