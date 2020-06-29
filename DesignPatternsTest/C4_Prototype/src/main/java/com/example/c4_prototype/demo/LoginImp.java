package com.example.c4_prototype.demo;

import com.example.c4_prototype.demo.bean.Address;
import com.example.c4_prototype.demo.bean.User;

/**
 * @author ggz
 * @date 2020/6/29
 */
public class LoginImp implements Login {
    @Override
    public void login() {
        // 登录服务器，网络请求
        // ...
        // 获取到用户信息
        User loginUser = new User();
        // 将服务器返回的完整信息设置给 loginUser 对象
        loginUser.age = 25;
        loginUser.name = "小明";
        loginUser.address = new Address("珠海市", "金湾区", "永达路");
        // 登录完之后将用户信息设置到 Session 中 LoginSession.getLoginSession() 里
        LoginSession.getInstance().setLoginUser(loginUser);
    }
}
