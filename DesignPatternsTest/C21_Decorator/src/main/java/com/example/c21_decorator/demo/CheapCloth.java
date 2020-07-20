package com.example.c21_decorator.demo;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class CheapCloth extends PersonCloth {

    public CheapCloth(Person person) {
        super(person);
    }

    private void dressVest() {
        System.out.println("穿件背心");
    }

    private void dressShorts() {
        System.out.println("穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressVest();
        dressShorts();
    }
}
