package com.example.designpatternstest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.example.designpatternstest.aidl.BankBinder;

import androidx.annotation.Nullable;

public class BankService extends Service {
    private final String TAG = this.getClass().getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG, "onCreate: " + getPackageName() + getClass().getName());
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e(TAG, "onBind: " + intent);
        return new BankBinder();
    }

}
