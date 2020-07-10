package com.example.c16_visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ggz
 * @date 2020/7/10
 */
public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport() {
        mStaffs.add(new Manger("白经理"));
        mStaffs.add(new Engineer("红工"));
        mStaffs.add(new Engineer("黄工"));
        mStaffs.add(new Engineer("蓝工"));
        mStaffs.add(new Engineer("绿工"));
    }

    public void showReport(Visitor visitor) {
        for (Staff staff : mStaffs) {
            staff.accept(visitor);
        }
    }
}
