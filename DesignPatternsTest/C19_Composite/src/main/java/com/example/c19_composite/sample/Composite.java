package com.example.c19_composite.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ggz
 * @date 2020/7/16
 */
public class Composite extends Component {
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        for (Component c : components) {
            c.doSomething();
        }
    }

    @Override
    public void addChild(Component child) {
        components.add(child);
    }

    @Override
    public void removeChild(Component child) {
        components.remove(child);
    }

    @Override
    public Component getChildren(int index) {
        return components.get(index);
    }
}
