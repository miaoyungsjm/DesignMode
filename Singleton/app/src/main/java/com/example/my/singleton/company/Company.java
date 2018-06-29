package com.example.my.singleton.company;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * 公司
 *
 * @author my
 * @date 2018/6/29
 */
public class Company {

    private List<Staff> mAllStaffs = new ArrayList<>();

    public void addStaff(Staff person) {
        mAllStaffs.add(person);
    }

    public void showAllStaffs() {
        for (Staff staff : mAllStaffs) {
            Log.d("Company", staff.toString());
        }
    }
}
