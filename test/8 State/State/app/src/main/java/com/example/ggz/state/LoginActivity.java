package com.example.ggz.state;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ggz.state.state.LoginContext;
import com.example.ggz.state.state.LoginedState;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private LoginContext mLoginContext = null;
    private Context mContext = LoginActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginContext = LoginContext.getInstance();

        Button button = (Button) findViewById(R.id.btn_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, mContext.getString(R.string.str_login), Toast.LENGTH_SHORT).show();
                mLoginContext.setUserState(new LoginedState());
                finish();
            }
        });
    }
}
