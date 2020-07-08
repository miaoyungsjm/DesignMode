package com.example.c14_iterator.demo;

/**
 * @author ggz
 * @date 2020/7/8
 */
public class HuiIterator implements Iterator {
    private Employee[] array;
    private int position = 0;

    public HuiIterator(Employee[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return !(position > array.length - 1 || array[position] == null);
    }

    @Override
    public Object next() {
        Employee e = array[position];
        position++;
        return e;
    }
}
