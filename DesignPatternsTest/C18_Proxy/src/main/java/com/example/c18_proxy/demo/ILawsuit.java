package com.example.c18_proxy.demo;

public interface ILawsuit {
    /**
     * 提交申请
     */
    void submit();

    /**
     * 进行举证
     */
    void burden();

    /**
     * 开始辩护
     */
    void defend();

    /**
     * 诉讼完成
     */
    void finish();
}
