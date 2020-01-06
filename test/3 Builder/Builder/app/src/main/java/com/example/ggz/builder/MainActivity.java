package com.example.ggz.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ggz.builder.demo.Builder;
import com.example.ggz.builder.demo.Computer;
import com.example.ggz.builder.demo.Director;
import com.example.ggz.builder.demo.MacbookBuilder;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv_info)
    TextView mInfoTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Builder builder = new MacbookBuilder();
        Director director = new Director(builder);
        director.construct("英特尔", "Retina 显示器");
        Computer computer = builder.create();

        System.out.println(computer.toString());
        mInfoTv.setText(computer.toString());
    }
}
