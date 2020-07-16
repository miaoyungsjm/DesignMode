package com.example.c18_proxy;

import com.example.c18_proxy.demo.DynamicProxy;
import com.example.c18_proxy.demo.ILawsuit;
import com.example.c18_proxy.demo.Lawyer;
import com.example.c18_proxy.demo.XiaoMin;
import com.example.c18_proxy.sample.ProxySubject;
import com.example.c18_proxy.sample.RealSubject;

import java.lang.reflect.Proxy;

/**
 * @author ggz
 * @date 2020/7/13
 */
public class Client {
    public static void main(String[] args) {
        // ----------------------
        RealSubject real = new RealSubject();

        ProxySubject proxy = new ProxySubject(real);
        proxy.visit();

        // ----------------------
        ILawsuit xiaomin = new XiaoMin();

        ILawsuit lawyer = new Lawyer(xiaomin);
        // 律师提交诉讼申请
        lawyer.submit();
        // 律师进行举证
        lawyer.burden();
        // 律师代替小民进行辩护
        lawyer.defend();
        // 完成诉讼
        lawyer.finish();

        // ----------------------
        DynamicProxy dynamicProxy = new DynamicProxy(xiaomin);
        ClassLoader loader = xiaomin.getClass().getClassLoader();
        ILawsuit lawyer2 = (ILawsuit) Proxy.newProxyInstance(loader,
                new Class[]{ILawsuit.class}, dynamicProxy);
        lawyer2.submit();
        lawyer2.burden();
        lawyer2.defend();
        lawyer2.finish();
    }
}
