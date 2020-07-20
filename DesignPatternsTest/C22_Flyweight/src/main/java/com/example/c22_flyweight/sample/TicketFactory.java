package com.example.c22_flyweight.sample;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class TicketFactory {
    static Map<String, Ticket> sTicketMap = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (sTicketMap.containsKey(key)) {
            System.out.println("get  cache: " + key);
            return sTicketMap.get(key);
        } else {
            System.out.println("new object: " + key);
            Ticket ticket = new TrainTicket(from, to);
            sTicketMap.put(key, ticket);
            return ticket;
        }
    }
}
