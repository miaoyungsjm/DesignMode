package com.example.c22_flyweight.sample;

import java.util.Random;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class TrainTicket implements Ticket {
    public String from;
    public String to;
    public String bunk;
    public int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        this.bunk = bunk;
        System.out.println("From: " + from + ", To: " + to +
                ", bunk: " + this.bunk + ", price: " + price);
    }
}
