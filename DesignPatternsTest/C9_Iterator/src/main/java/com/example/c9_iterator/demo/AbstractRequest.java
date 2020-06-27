package com.example.c9_iterator.demo;

/**
 * @author ggz
 * @date 2020/6/27
 */
public abstract class AbstractRequest {

    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    public Object getContent() {
        return obj;
    }

    /**
     * 获取请求级别
     */
    public abstract int getRequestLevel();
}
