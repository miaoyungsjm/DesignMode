package com.example.c14_iterator.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ggz
 * @date 2020/7/8
 *
 * 具体迭代器
 * 目的主要是实现迭代器接口，
 * 并记录遍历的当期位置
 */
public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
