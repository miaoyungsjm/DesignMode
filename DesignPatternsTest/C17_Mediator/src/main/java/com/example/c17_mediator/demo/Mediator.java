package com.example.c17_mediator.demo;

import com.example.c17_mediator.sample.ConcreteColleagueA;
import com.example.c17_mediator.sample.ConcreteColleagueB;

/**
 * @author ggz
 * @date 2020/7/10
 */
public abstract class Mediator {

    public abstract void changed(Colleague colleague);

}
