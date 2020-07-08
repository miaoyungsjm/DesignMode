package com.example.c14_iterator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ggz
 * @date 2020/7/8
 */
public class CompanyHui implements Company {
    private Employee[] array = new Employee[3];

    public CompanyHui() {
        array[0] = new Employee("小辉", 25, "男", "程序员");
        array[1] = new Employee("小黄", 25, "男", "程序员");
        array[2] = new Employee("小红", 25, "男", "程序员");
    }

    public Employee[] getEmployees() {
        return array;
    }

    @Override
    public Iterator iterator() {
        return new HuiIterator(array);
    }
}
