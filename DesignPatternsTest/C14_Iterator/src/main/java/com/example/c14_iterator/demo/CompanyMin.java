package com.example.c14_iterator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ggz
 * @date 2020/7/8
 */
public class CompanyMin implements Company {
    private List<Employee> list = new ArrayList<>();

    public CompanyMin() {
        list.add(new Employee("小明", 25, "男", "程序员"));
        list.add(new Employee("小可", 22, "女", "测试"));
        list.add(new Employee("小爱", 24, "女", "设计"));
    }

    public List<Employee> getEmployees() {
        return list;
    }

    @Override
    public Iterator iterator() {
        return new MinIterator(list);
    }
}
