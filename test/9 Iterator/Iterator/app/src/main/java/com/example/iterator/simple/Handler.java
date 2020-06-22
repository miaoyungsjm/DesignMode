package com.example.iterator.simple;

public abstract class Handler {
    /**
     * 下一节点的处理者
     * */
    public Handler successor;

    /**
     * 请求处理
     * */
    public abstract void handleRequest(String condition);
}
