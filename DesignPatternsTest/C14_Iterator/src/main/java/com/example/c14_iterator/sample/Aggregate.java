package com.example.c14_iterator.sample;

/**
 * @author ggz
 * @date 2020/7/8
 *
 * 容器接口
 * 负责提供创建具体迭代器角色的接口
 */
public interface Aggregate<T> {

    void add(T obj);

    void remove(T obj);

    Iterator<T> iterator();
}
