package com.example.iterator.test;

public abstract class AbstractRequest {

    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    /**
     * 获取处理的内容对象
     */
    public Object getContent() {
        return obj;
    }

    /**
     * 获取请求级别
     */
    public abstract int getRequestLevel();
}
