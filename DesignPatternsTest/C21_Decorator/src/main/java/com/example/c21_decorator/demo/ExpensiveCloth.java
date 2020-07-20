package com.example.c21_decorator.demo;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class ExpensiveCloth extends PersonCloth {

    public ExpensiveCloth(Person person) {
        super(person);
    }

    private void dressShirt() {
        System.out.println("穿件短袖");
    }

    private void dressJean() {
        System.out.println("穿条牛仔裤");
    }

    private void dressLeather() {
        System.out.println("穿件皮衣");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressJean();
        dressLeather();
    }
}
