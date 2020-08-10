package com.example.mvvmtest.login;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mvvmtest.BR;

/**
 * @author ggz
 * @date 2020/8/10
 */
public class LoginInfo extends BaseObservable {
    private String user;
    private String password;

    public LoginInfo(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @NonNull
    @Bindable
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
        // 刷新 UI
        notifyPropertyChanged(BR.user);
    }

    @NonNull
    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }
}
