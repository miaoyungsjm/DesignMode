package com.example.prototype.demo2;

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

    void setLoginUser(User user) {
        mLoginUser = user;
    }

    public User getLoginUser() {
        return mLoginUser;
    }
}
