package com.example.c17_mediator.sample;

/**
 * @author ggz
 * @date 2020/7/10
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ConcreteColleagueB 将信息递交给中介者处理");
    }
}
