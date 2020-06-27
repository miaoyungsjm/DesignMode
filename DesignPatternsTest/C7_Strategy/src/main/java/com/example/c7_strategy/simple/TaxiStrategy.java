package com.example.c7_strategy.simple;

/**
 * @author ggz
 * @date 2020/6/28
 */
public class TaxiStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return km * 2;
    }
}
