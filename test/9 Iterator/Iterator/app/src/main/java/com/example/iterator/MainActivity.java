package com.example.iterator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.iterator.simple.ConcreteHandler1;
import com.example.iterator.simple.ConcreteHandler2;
import com.example.iterator.test.AbstractHandler;
import com.example.iterator.test.AbstractRequest;
import com.example.iterator.test.Handler1;
import com.example.iterator.test.Handler2;
import com.example.iterator.test.Handler3;
import com.example.iterator.test.Request1;
import com.example.iterator.test.Request2;
import com.example.iterator.test.Request3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // simple
//        ConcreteHandler1 handler1 = new ConcreteHandler1();
//        ConcreteHandler2 handler2 = new ConcreteHandler2();
//        handler1.successor = handler2;
//        handler2.successor = handler1;
//        handler1.handleRequest(ConcreteHandler2.class.getSimpleName());

        // test
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();
        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;

        AbstractRequest request1 = new Request1(Request1.class.getSimpleName());
        AbstractRequest request2 = new Request1(1);
        AbstractRequest request3 = new Request1(0.1);

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}