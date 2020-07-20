package com.example.c21_decorator.sample;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();
        super.operate();
        operateB();
    }

    public void operateA() {
        System.out.println("operateA");
    }

    public void operateB() {
        System.out.println("operateB");
    }
}
