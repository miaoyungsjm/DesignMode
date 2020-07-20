package com.example.c20_adapter;

import com.example.c20_adapter.sample.Volt220;
import com.example.c20_adapter.sample.VoltAdapter1;
import com.example.c20_adapter.sample.VoltAdapter2;

/**
 * @author ggz
 * @date 2020/7/16
 */
public class Client {
    public static void main(String[] args) {
        // ------------------
        VoltAdapter1 voltAdapter1 = new VoltAdapter1();
        VoltAdapter2 voltAdapter2 = new VoltAdapter2(new Volt220());
        System.out.println("类适配器，输出电压: " + voltAdapter1.getVolt5());
        System.out.println("对象适配器，输出电压: " + voltAdapter2.getVolt5());
    }
}
