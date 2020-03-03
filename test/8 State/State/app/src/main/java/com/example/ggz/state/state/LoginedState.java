package com.example.ggz.state.state;

import android.content.Context;
import android.widget.Toast;

import com.example.ggz.state.R;

public class LoginedState implements UserState {
    @Override
    public void followFunc(Context context) {
        Toast.makeText(context, context.getString(R.string.main_follow), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void likeFunc(Context context) {
        Toast.makeText(context, context.getString(R.string.main_like), Toast.LENGTH_SHORT).show();
    }
}
