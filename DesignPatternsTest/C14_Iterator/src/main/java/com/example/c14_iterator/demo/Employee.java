package com.example.c14_iterator.demo;

import androidx.annotation.NonNull;

/**
 * @author ggz
 * @date 2020/7/8
 */
public class Employee {
    private String name;
    private int age;
    private String sex;
    private String position;

    public Employee(String name, int age, String sex, String position) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.position = position;
    }

    @NonNull
    @Override
    public String toString() {
        return "Employee { " +
                "name = \"" + name + "\", " +
                "age = " + age + ", " +
                "sex = \"" + sex + "\", " +
                "position = \"" + position + "\" }";
    }
}
