package com.example.designpatternstest;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author ggz
 * @date 2020/9/1
 */
public class LoginActivity extends AppCompatActivity {
    private EditText mAccountEt, mPasswordEt;
    private Button mLoginBtn, mRegisterBtn;
    private CheckBox mAutoCb, mRememberCb;

    private String mAccount, mPassword;
    private boolean isAuto, isRemember;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAccountEt = (EditText) findViewById(R.id.et_login_account);
        mAccountEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mAccount = s.toString();
                // 通知中介者
                change();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mPasswordEt = (EditText) findViewById(R.id.et_login_password);
        mPasswordEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPassword = s.toString();
                // 通知中介者
                change();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mAutoCb = (CheckBox) findViewById(R.id.cb_login_auto);
        mAutoCb.setEnabled(false);
        mAutoCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                isAuto = isChecked;
                // 通知中介者
                change();
            }
        });

        mRememberCb = (CheckBox) findViewById(R.id.cb_login_remember);
        mRememberCb.setEnabled(false);
        mRememberCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                isRemember = isChecked;
                // 通知中介者
                change();
            }
        });

        mLoginBtn = (Button) findViewById(R.id.btn_login_ensure);
        mLoginBtn.setEnabled(false);
        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 登录验证
            }
        });

        mRegisterBtn = (Button) findViewById(R.id.btn_login_register);
        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转去注册页面
            }
        });
    }

    private void change() {
        if (TextUtils.isEmpty(mAccount)) {
            mPasswordEt.setEnabled(false);
            mAutoCb.setEnabled(false);
            mRememberCb.setEnabled(false);
            mLoginBtn.setEnabled(false);
        } else if (!TextUtils.isEmpty(mAccount) &&
                TextUtils.isEmpty(mPassword)) {
            mPasswordEt.setEnabled(true);
            mAutoCb.setEnabled(false);
            mRememberCb.setEnabled(false);
            mLoginBtn.setEnabled(false);
        } else if (!TextUtils.isEmpty(mAccount) &&
                !TextUtils.isEmpty(mPassword)) {
            mPasswordEt.setEnabled(true);
            mAutoCb.setEnabled(true);
            mRememberCb.setEnabled(true);
            mLoginBtn.setEnabled(true);
        }
    }
}
