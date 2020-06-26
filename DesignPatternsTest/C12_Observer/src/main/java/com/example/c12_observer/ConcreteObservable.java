package com.example.c12_observer;

import java.util.Observable;

/**
 * @author ggz
 * @date 2020/6/26
 */
public class ConcreteObservable extends Observable {

    public void postNewPublication(String content) {
        // 标识状态/内容改变
        setChanged();
        // 通知所有观察者
        notifyObservers(content);
    }
}
