package com.example.c4_prototype.demo;

import com.example.c4_prototype.demo.bean.User;

/**
 * @author ggz
 * @date 2020/6/29
 */
public class LoginSession {
    volatile static LoginSession sLoginSession = null;
    private User mLoginUser;

    private LoginSession() {
    }

    public static LoginSession getInstance() {
        if (sLoginSession == null) {
            synchronized (LoginSession.class) {
                if (sLoginSession == null) {
                    sLoginSession = new LoginSession();
                }
            }
        }
        return sLoginSession;
    }

    /**
     * 限制只能通过网络更新成功后，调用 setLoginUser 更新用户数据
     */
    protected void setLoginUser(User user) {
        mLoginUser = user;
    }

    /**
     * 返回 clone 对象
     * 无法直接修改本体
     */
    public User getLoginUser() {
        // 未优化
//        return mLoginUser;
        // 原型模式
        return mLoginUser.clone();
    }
}
