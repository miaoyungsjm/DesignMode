package com.example.c18_proxy.sample;

public class RealSubject extends Subject {
    @Override
    public void visit() {
        // RealSubject 中 visit 的具体逻辑
        System.out.println("Real subject!");
    }
}
