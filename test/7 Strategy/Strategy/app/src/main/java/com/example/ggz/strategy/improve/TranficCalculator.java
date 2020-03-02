package com.example.ggz.strategy.improve;

public class TranficCalculator {
    public CalculateStrategy mStrategy = null;

    public void setStrategy(CalculateStrategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public int calculatePrice(int km) {
        if (mStrategy == null) {
            return 0;
        }
        return mStrategy.calculatePrice(km);
    }
}
