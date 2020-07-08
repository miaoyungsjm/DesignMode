package com.example.c14_iterator.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ggz
 * @date 2020/7/8
 * 
 * 具体容器
 * 具体迭代器与该容器关联
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(list);
    }
}
