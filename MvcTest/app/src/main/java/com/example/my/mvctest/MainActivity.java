package com.example.my.mvctest;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Model.OnStateChangeListener, View.OnClickListener {

    private Model mModel;

    private ImageView mImageIv;
    private Button mLoadBtn;
    private Button mClearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mModel = new Model(this);
        mModel.setOnStateChangeListener(this);


        mImageIv = findViewById(R.id.iv_image);
        mImageIv.setImageBitmap(mModel.getImage());

        mLoadBtn = findViewById(R.id.btn_load);
        mLoadBtn.setOnClickListener(this);

        mClearBtn = findViewById(R.id.btn_clear);
        mClearBtn.setOnClickListener(this);

    }

    @Override
    public void OnStateChanged(Bitmap bitmap) {
        mImageIv.setImageBitmap(bitmap);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_load:
                mModel.loadImage();
                break;

            case R.id.btn_clear:
                mModel.clearImage();
                break;

            default:
        }
    }
}
