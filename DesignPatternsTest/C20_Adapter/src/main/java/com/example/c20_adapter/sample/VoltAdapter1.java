package com.example.c20_adapter.sample;

/**
 * @author ggz
 * @date 2020/7/20
 *
 * Adapter
 */
public class VoltAdapter1 extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        // 电压转换: 220 -> 5
        int outputVolt = getVolt220() / 44;
        return outputVolt;
    }
}
