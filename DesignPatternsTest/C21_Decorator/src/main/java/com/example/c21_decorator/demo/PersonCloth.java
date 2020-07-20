package com.example.c21_decorator.demo;

/**
 * @author ggz
 * @date 2020/7/20
 */
public abstract class PersonCloth extends Person {
    private Person person;

    public PersonCloth(Person person) {
        this.person = person;
    }

    @Override
    public void dressed() {
        person.dressed();
    }
}
