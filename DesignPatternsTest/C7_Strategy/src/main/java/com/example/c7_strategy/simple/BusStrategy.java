package com.example.c7_strategy.simple;

/**
 * @author ggz
 * @date 2020/6/28
 */
public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor;
        return fraction > 0 ? ++price : price;
    }
}
