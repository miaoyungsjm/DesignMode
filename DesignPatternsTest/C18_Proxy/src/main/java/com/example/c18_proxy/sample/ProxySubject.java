package com.example.c18_proxy.sample;

public class ProxySubject extends Subject {
    private RealSubject mSubject;

    public ProxySubject(RealSubject subject) {
        this.mSubject = subject;
    }

    @Override
    public void visit() {
        mSubject.visit();
    }
}
