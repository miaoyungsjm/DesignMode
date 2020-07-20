package com.example.c21_decorator.sample;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("ConcreteComponent operate");
    }
}
