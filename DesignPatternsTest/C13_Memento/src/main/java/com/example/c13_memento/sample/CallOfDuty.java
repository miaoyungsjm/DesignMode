package com.example.c13_memento.sample;

import androidx.annotation.NonNull;

/**
 * @author ggz
 * @date 2020/6/30
 */
public class CallOfDuty {
    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "Desert Eagle";

    public void play() {
        System.out.println("--------------");
        System.out.println("play game: " + String.format("fighting in level %d", mCheckpoint));
        mLifeValue -= 10;
        System.out.println("victory !");
        mCheckpoint++;
        System.out.println(String.format("reached level %d", mCheckpoint));
    }

    public void quit() {
        System.out.println("--------------");
        System.out.println("quit game: " + this.toString());
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.checkpoint = mCheckpoint;
        memento.lifeValue = mLifeValue;
        memento.weapon = mWeapon;
        return memento;
    }

    public void restore(Memento memento) {
        mCheckpoint = memento.checkpoint;
        mLifeValue = memento.lifeValue;
        mWeapon = memento.weapon;
        System.out.println("--------------");
        System.out.println("recover: " + this.toString());
    }

    public int getCheckpoint() {
        return mCheckpoint;
    }

    public void setCheckpoint(int mCheckpoint) {
        this.mCheckpoint = mCheckpoint;
    }

    public int getLifeValue() {
        return mLifeValue;
    }

    public void setLifeValue(int mLifeValue) {
        this.mLifeValue = mLifeValue;
    }

    public String getWeapon() {
        return mWeapon;
    }

    public void setWeapon(String mWeapon) {
        this.mWeapon = mWeapon;
    }

    @NonNull
    @Override
    public String toString() {
        return "CallOfDuty [mCheckpoint = " + mCheckpoint +
                ", mLifeValue = " + mLifeValue +
                ", mWeapon = " + mWeapon + "]";
    }
}
