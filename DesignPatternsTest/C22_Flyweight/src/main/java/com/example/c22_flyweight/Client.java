package com.example.c22_flyweight;

import com.example.c22_flyweight.sample.Ticket;
import com.example.c22_flyweight.sample.TicketFactory;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class Client {
    public static void main(String[] args) {
        Ticket ticket1 = TicketFactory.getTicket("珠海", "广州");
        ticket1.showTicketInfo("坐票");
        Ticket ticket2 = TicketFactory.getTicket("珠海", "广州");
        ticket2.showTicketInfo("站票");
        Ticket ticket3 = TicketFactory.getTicket("广州", "珠海");
        ticket3.showTicketInfo("坐票");
    }
}
