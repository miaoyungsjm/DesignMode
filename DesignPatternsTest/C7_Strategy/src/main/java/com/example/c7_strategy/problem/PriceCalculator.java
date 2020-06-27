package com.example.c7_strategy.problem;

public class PriceCalculator {
    public static final int BUS = 1;
    public static final int SUBWAY = 2;

    private int mType = 0;

    private int busPrice(int km) {
        // 10 公里内 1 元，超过 10 公里后每加 1 元可乘 5 公里
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor;
        return fraction > 0 ? ++price : price;
    }

    private int subwayPrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km <= 12) {
            return 4;
        } else if (km > 12 && km <= 22) {
            return 5;
        } else if (km > 22 && km < 32) {
            return 6;
        }
        return 7;
    }

    // 问题点：
    // 增加出行方式，就得继续加 if-else 判断，而且也得新加计算方法，违反开闭原则
    // 类的功能不再单一(判断+计算)，违反单一职责原则
    // 代码臃肿，不利于拓展维护
    public int calculatePrice(int km, int type) {
        if (type == BUS) {
            mType = BUS;
            return busPrice(km);
        } else if (type == SUBWAY) {
            mType = SUBWAY;
            return subwayPrice(km);
        }
        return 0;
    }

    public int getType() {
        return mType;
    }
}
