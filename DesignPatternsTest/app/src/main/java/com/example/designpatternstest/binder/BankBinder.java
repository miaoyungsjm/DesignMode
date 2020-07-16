package com.example.designpatternstest.binder;

import android.os.Binder;

import java.util.UUID;

public class BankBinder extends Binder implements IBank {

    @Override
    public String openAccount(String name, String password) {
        return "openAccount - name: " + name + ", account: " + UUID.randomUUID().toString();
    }

    @Override
    public String saveMoney(int money, String account) {
        return "saveMoney - account: " + account + ", money: +" + money;
    }

    @Override
    public String takeMoney(int money, String account, String password) {
        return "takeMoney - account: " + account + ", money: -" + money;
    }

    @Override
    public String closeAccount(String account, String password) {
        return "closeAccount - account: " + account;
    }
}
