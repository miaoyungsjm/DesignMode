package com.example.c15_template;


/**
 * @author ggz
 * @date 2020/6/27
 */
public class Client {
    public static void main(String[] args) {
        // ----------------------
        AbstractComputer computer = new CoderComputer();
        computer.startUp();

        AbstractComputer computer1 = new MilitaryComputer();
        computer1.startUp();
    }
}
