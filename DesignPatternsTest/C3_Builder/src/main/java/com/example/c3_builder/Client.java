package com.example.c3_builder;

import com.example.c3_builder.sample.Builder;
import com.example.c3_builder.sample.Computer;
import com.example.c3_builder.sample.Director;
import com.example.c3_builder.sample.MacBookBuilder;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class Client {
    public static void main(String[] args) {
        // ----------------------
        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("英特尔", "Retina 显示器");
        Computer computer = builder.create();

        System.out.println(computer.toString());
    }
}
