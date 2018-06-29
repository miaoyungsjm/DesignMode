package com.example.my.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.my.singleton.company.CEO;
import com.example.my.singleton.company.Company;
import com.example.my.singleton.company.Staff;
import com.example.my.singleton.company.VP;

/**
 * @author my
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Company company = new Company();
        Staff ceo1 = CEO.getCeo();
        Staff ceo2 = CEO.getCeo();
        company.addStaff(ceo1);
        company.addStaff(ceo2);
        Staff vp1 = new VP();
        Staff vp2 = new VP();
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();
        company.addStaff(vp1);
        company.addStaff(vp2);
        company.addStaff(staff1);
        company.addStaff(staff2);
        company.addStaff(staff3);
        company.showAllStaffs();
    }
}
