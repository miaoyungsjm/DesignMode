package com.example.c14_iterator;

import com.example.c14_iterator.demo.CompanyHui;
import com.example.c14_iterator.demo.CompanyMin;
import com.example.c14_iterator.demo.Employee;
import com.example.c14_iterator.sample.Aggregate;
import com.example.c14_iterator.sample.ConcreteAggregate;
import com.example.c14_iterator.sample.Iterator;

import java.util.List;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class Client {
    public static void main(String[] args) {
        // ----------------------
        Aggregate<String> a = new ConcreteAggregate<>();
        a.add("A");
        a.add("B");
        a.add("C");
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ----------------------
        CompanyMin min = new CompanyMin();
//        List<Employee> minList = min.getEmployees();
//        for (int i = 0; i < minList.size(); i++) {
//            System.out.println(minList.get(i).toString());
//        }
        check(min.iterator());


        CompanyHui hui = new CompanyHui();
//        Employee[] huiArray = hui.getEmployees();
//        for (Employee employee : huiArray) {
//            System.out.println(employee.toString());
//        }
        check(hui.iterator());
    }

    public static void check(com.example.c14_iterator.demo.Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
