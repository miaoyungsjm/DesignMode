package com.example.designpatternstest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.designpatternstest.aidl.IBankAIDL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    IBinder mBankBinder;
    IBankAIDL mBankBinder;

    TextView mContentTv;

    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
//            mBankBinder = (BankBinder) iBinder;
            // 跨进程 AIDL
            mBankBinder = IBankAIDL.Stub.asInterface(iBinder);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 启动服务
        Intent intent = new Intent(this, BankService.class);
        startService(intent);

        // 不同包名的 server
//        Intent intent1 = new Intent();
//        intent.setAction("com.example.aidl.BankService");
//        intent.setPackage("com.example.appPackageName");

        // 绑定 Server
        bindService(intent, connection, BIND_AUTO_CREATE);

        initView();
    }

    public void initView() {
        mContentTv = (TextView) findViewById(R.id.tv_content);
        Button button1 = (Button) findViewById(R.id.btn_open);
        Button button2 = (Button) findViewById(R.id.btn_save);
        Button button3 = (Button) findViewById(R.id.btn_take);
        Button button4 = (Button) findViewById(R.id.btn_close);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String content = "";
        switch (view.getId()) {
            case R.id.btn_open:
                try {
                    content = mBankBinder.openAccount("AIDL", "123456");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.btn_save:
                try {
                    content = mBankBinder.saveMoney(10000, "account0001");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.btn_take:
                try {
                    content = mBankBinder.takeMoney(1000, "account0001", "123456");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.btn_close:
                try {
                    content = mBankBinder.closeAccount("account0001", "123456");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
            default:
                content = "null";
                break;
        }
        mContentTv.setText(content);
    }

    @Override
    protected void onDestroy() {
        Intent intent = new Intent(this, BankService.class);
        stopService(intent);
        super.onDestroy();
    }
}