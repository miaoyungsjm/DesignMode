package com.example.c17_mediator.sample;

/**
 * @author ggz
 * @date 2020/7/10
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ConcreteColleagueA 将信息递交给中介者处理");
    }
}
