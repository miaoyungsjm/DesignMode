package com.example.ggz.strategy.imageloader;

import android.widget.ImageView;

import com.example.ggz.strategy.imageloader.builder.DisplayConfig;
import com.example.ggz.strategy.imageloader.policy.LoaderPolicy;
import com.example.ggz.strategy.imageloader.policy.SerialPolicy;

public class BitmapRequest implements Comparable<BitmapRequest> {

    public int serialNum;
    public String url;
    public ImageView imageView;
    public DisplayConfig displayConfig = null;
    public MyRequestListener listener = null;
    public LoaderPolicy mLoaderPolicy = new SerialPolicy();

    public BitmapRequest(String url, ImageView imageView, DisplayConfig config, MyRequestListener listener) {
        displayConfig = config;
        this.listener = listener;
    }

    @Override
    public int compareTo(BitmapRequest another) {
        // 委托给 LoadPolicy 进行处理，实现按策略模式
        return mLoaderPolicy.compare(this, another);
    }

    public void setLoaderPolicy(LoaderPolicy loaderPolicy) {
        mLoaderPolicy = loaderPolicy;
    }

    public interface MyRequestListener {
        void onSuccess();
        void onfailure();
    }
}
