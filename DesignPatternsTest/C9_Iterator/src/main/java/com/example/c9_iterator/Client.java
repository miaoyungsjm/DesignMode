package com.example.c9_iterator;

import com.example.c9_iterator.demo.AbstractHandler;
import com.example.c9_iterator.demo.AbstractRequest;
import com.example.c9_iterator.demo.Handler1;
import com.example.c9_iterator.demo.Handler2;
import com.example.c9_iterator.demo.Handler3;
import com.example.c9_iterator.demo.Request;
import com.example.c9_iterator.sample.ConcreteHandler1;
import com.example.c9_iterator.sample.ConcreteHandler2;
import com.example.c9_iterator.sample.ConcreteHandler3;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class Client {
    public static void main(String[] args) {
        // ----------------------
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        ConcreteHandler3 concreteHandler3 = new ConcreteHandler3();
        concreteHandler1.successor = concreteHandler2;
        concreteHandler2.successor = concreteHandler3;
        concreteHandler1.handleRequest(ConcreteHandler3.class.getSimpleName());


        // ----------------------
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();
        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;

        AbstractRequest request3 = new Request("request3");

        handler1.handleRequest(request3);
    }
}
