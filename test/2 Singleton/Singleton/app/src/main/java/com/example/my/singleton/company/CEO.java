package com.example.my.singleton.company;

/**
 * 最高执行官（CEO）
 * 饿汉模式
 *
 * @author my
 * @date 2018/6/29
 */
public class CEO extends Staff {
    /**
     * 单例对象
     */
    private static final CEO mCeo = new CEO();

    /**
     * 私有构造函数
     */
    private CEO() {
    }

    /**
     * 共有静态函数，获取单例对象的接口
     */
    public static CEO getCeo() {
        return mCeo;
    }

    @Override
    public void word() {
        super.word();
        // 管理 VP
    }
}
