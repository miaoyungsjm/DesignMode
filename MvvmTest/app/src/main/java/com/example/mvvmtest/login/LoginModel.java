package com.example.mvvmtest.login;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.annotation.NonNull;

/**
 * @author ggz
 * @date 2020/8/10
 */
public class LoginModel {
    private static final String DEFAULT_USER = "AndroidStudio";
    private static final String DEFAULT_PASSWORD = "123456";

    public LoginInfo mInfo = new LoginInfo("", "");

    private OnLoginListener mListener;

    public interface OnLoginListener {
        void onLoginSuccess();

        void onLoginFail();
    }

    public LoginModel(@NonNull OnLoginListener listener) {
        this.mListener = listener;
    }

    public TextWatcher getUserTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mInfo.setUser(s.toString());
            }
        };
    }

    public TextWatcher getPasswordTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mInfo.setPassword(s.toString());
            }
        };
    }

    public void onLoginClick(View view) {
        if (mInfo.getUser().equals(DEFAULT_USER) &&
                mInfo.getPassword().equals(DEFAULT_PASSWORD)) {
            mListener.onLoginSuccess();
        } else {
            mListener.onLoginFail();
        }
    }

    public void onDefaultClick(View view) {
        mInfo.setUser(DEFAULT_USER);
        mInfo.setPassword(DEFAULT_PASSWORD);
    }
}
