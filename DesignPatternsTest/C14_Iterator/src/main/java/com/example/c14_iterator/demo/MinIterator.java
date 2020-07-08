package com.example.c14_iterator.demo;

import java.util.List;

/**
 * @author ggz
 * @date 2020/7/8
 */
public class MinIterator implements Iterator {
    private List<Employee> list;
    private int position = 0;

    public MinIterator(List<Employee> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !(position > list.size() - 1 || list.get(position) == null);
    }

    @Override
    public Object next() {
        Employee e = list.get(position);
        position++;
        return e;
    }
}
