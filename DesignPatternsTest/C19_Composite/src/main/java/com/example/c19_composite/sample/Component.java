package com.example.c19_composite.sample;

/**
 * @author ggz
 * @date 2020/7/16
 */
public abstract class Component {
    /**
     * 节点名
     */
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void doSomething();

    public abstract void addChild(Component child);

    public abstract void removeChild(Component child);

    public abstract Component getChildren(int index);
}
