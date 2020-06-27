package com.example.c7_strategy;

import com.example.c7_strategy.problem.PriceCalculator;
import com.example.c7_strategy.simple.BusStrategy;
import com.example.c7_strategy.simple.SubwayStrategy;
import com.example.c7_strategy.simple.TranficCalculator;

import static com.example.c7_strategy.problem.PriceCalculator.BUS;
import static com.example.c7_strategy.problem.PriceCalculator.SUBWAY;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class Client {
    public static void main(String[] args) {
        // ----------------------
        int cost = 0;
        PriceCalculator priceCalculator = new PriceCalculator();
        cost = priceCalculator.calculatePrice(6, BUS);
        System.out.println("type: " + priceCalculator.getType() + ", cost: " + cost);
        
        cost = priceCalculator.calculatePrice(6, SUBWAY);
        System.out.println("type: " + priceCalculator.getType() + ", cost: " + cost);

        // ----------------------
        TranficCalculator tranficCalculator = new TranficCalculator();
        tranficCalculator.setStrategy(new BusStrategy());
        cost = tranficCalculator.calculatePrice(6);
        System.out.println("type: bus, " + "cost: " + cost);

        tranficCalculator.setStrategy(new SubwayStrategy());
        cost = tranficCalculator.calculatePrice(6);
        System.out.println("type: subway, " + "cost: " + cost);
    }
}
