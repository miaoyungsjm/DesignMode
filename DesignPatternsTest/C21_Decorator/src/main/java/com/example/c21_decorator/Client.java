package com.example.c21_decorator;

import com.example.c21_decorator.demo.Boy;
import com.example.c21_decorator.demo.CheapCloth;
import com.example.c21_decorator.demo.ExpensiveCloth;
import com.example.c21_decorator.demo.Person;
import com.example.c21_decorator.demo.PersonCloth;
import com.example.c21_decorator.sample.Component;
import com.example.c21_decorator.sample.ConcreteComponent;
import com.example.c21_decorator.sample.ConcreteDecorator;
import com.example.c21_decorator.sample.Decorator;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operate();

        Person person = new Boy();
        PersonCloth clothCheap = new CheapCloth(person);
        clothCheap.dressed();
        PersonCloth clothExpensive = new ExpensiveCloth(person);
        clothExpensive.dressed();
    }
}
