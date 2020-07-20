package com.example.c21_decorator.sample;

/**
 * @author ggz
 * @date 2020/7/20
 */
public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
