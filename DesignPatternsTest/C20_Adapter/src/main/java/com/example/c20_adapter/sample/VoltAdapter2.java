package com.example.c20_adapter.sample;

/**
 * @author ggz
 * @date 2020/7/20
 * <p>
 * Adapter
 */
public class VoltAdapter2 implements FiveVolt {

    private Volt220 mVolt220;

    public VoltAdapter2(Volt220 volt220) {
        mVolt220 = volt220;
    }

    public int getVolt220() {
        return mVolt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        // 电压转换: 220 -> 5
        int outputVolt = getVolt220() / 44;
        return outputVolt;
    }
}
