package com.example.ggz.state.state;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.ggz.state.LoginActivity;
import com.example.ggz.state.R;

public class LogoutState implements UserState {
    @Override
    public void followFunc(Context context) {
        gotoLoginActivity(context);
    }

    @Override
    public void likeFunc(Context context) {
        Toast.makeText(context, context.getString(R.string.main_like), Toast.LENGTH_SHORT).show();
    }

    private void gotoLoginActivity(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
}
