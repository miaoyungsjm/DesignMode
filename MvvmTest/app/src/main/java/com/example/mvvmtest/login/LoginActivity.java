package com.example.mvvmtest.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mvvmtest.MainActivity;
import com.example.mvvmtest.R;
import com.example.mvvmtest.databinding.ActivityLoginBinding;

/**
 * @author ggz
 * @date 2020/8/10
 */
public class LoginActivity extends AppCompatActivity implements LoginModel.OnLoginListener {
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
        ActivityLoginBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_login);
        final LoginModel model = new LoginModel(this);
        binding.setModel(model);
    }

    @Override
    public void onLoginSuccess() {
        Toast.makeText(LoginActivity.this,
                "Success", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onLoginFail() {
        Toast.makeText(LoginActivity.this,
                "Fail", Toast.LENGTH_SHORT).show();
    }
}
