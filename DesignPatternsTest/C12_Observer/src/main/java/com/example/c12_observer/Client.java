package com.example.c12_observer;

/**
 * @author ggz
 * @date 2020/6/26
 */
public class Client {
    public static void main(String[] args) {
        ConcreteObservable observable = new ConcreteObservable();

        ConcreteObserver observer1 = new ConcreteObserver("o1");
        ConcreteObserver observer2 = new ConcreteObserver("o2");
        ConcreteObserver observer3 = new ConcreteObserver("o3");

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        observable.postNewPublication("新公告！");
        
    }
}
