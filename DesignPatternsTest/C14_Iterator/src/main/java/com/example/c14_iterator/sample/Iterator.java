package com.example.c14_iterator.sample;

/**
 * @author ggz
 * @date 2020/7/8
 *
 * 迭代器接口
 * 负责定义、访问、遍历元素的接口
 */
public interface Iterator<T> {

    /**
     * 是否还有下一个元素
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素并将位置移至下一位
     */
    T next();
}
