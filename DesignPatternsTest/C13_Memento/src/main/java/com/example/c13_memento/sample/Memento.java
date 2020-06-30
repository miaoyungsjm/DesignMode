package com.example.c13_memento.sample;

import androidx.annotation.NonNull;

/**
 * @author ggz
 * @date 2020/6/30
 */
public class Memento {
    public int checkpoint;
    public int lifeValue;
    public String weapon;

    @NonNull
    @Override
    public String toString() {
        return "Memento [checkpoint = " + checkpoint +
                ", lifeValue = " + lifeValue +
                ", weapon = " + weapon + "]";
    }
}
