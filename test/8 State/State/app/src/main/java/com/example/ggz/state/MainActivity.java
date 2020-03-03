package com.example.ggz.state;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ggz.state.state.LoginContext;
import com.example.ggz.state.state.LogoutState;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private LoginContext mLoginContext = null;
    private Context mContext = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initView() {
        Button followBtn = (Button) findViewById(R.id.btn_follow);
        Button likeBtn = (Button) findViewById(R.id.btn_like);
        Button logoutBtn = (Button) findViewById(R.id.btn_logout);

        followBtn.setOnClickListener(mOnClickListener);
        likeBtn.setOnClickListener(mOnClickListener);
        logoutBtn.setOnClickListener(mOnClickListener);
    }

    private void initData() {
        mLoginContext = LoginContext.getInstance();
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_follow:
                    mLoginContext.followFunc(mContext);
                    break;
                case R.id.btn_like:
                    mLoginContext.likeFunc(mContext);
                    break;
                case R.id.btn_logout:
                    Toast.makeText(mContext, mContext.getString(R.string.str_logout), Toast.LENGTH_SHORT).show();
                    mLoginContext.setUserState(new LogoutState());
                    break;
                default:
                    break;
            }
        }
    };
}
