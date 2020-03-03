package com.example.ggz.state.state;

import android.content.Context;

public class LoginContext {

    private volatile static LoginContext sInstance;

    private UserState mUserState = new LogoutState();

    private LoginContext() {
    }

    public static LoginContext getInstance() {
        if (sInstance == null) {
            synchronized (LoginContext.class) {
                if (sInstance == null) {
                    sInstance = new LoginContext();
                }
            }
        }
        return sInstance;
    }

    /**
     * 切换登录状态 */
    public void setUserState(UserState userState) {
        mUserState = userState;
    }

    public void followFunc(Context context) {
        mUserState.followFunc(context);
    }

    public void likeFunc(Context context) {
        mUserState.likeFunc(context);
    }
}
