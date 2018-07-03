package com.example.my.mvctest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;

/**
 * @author my
 * @date 2018/7/3
 */
public class Model {
    private Handler mHandler = new Handler();

    private OnStateChangeListener mListener;

    private Bitmap mBitmap;
    private Context mContext;

    public interface OnStateChangeListener {
        void OnStateChanged(Bitmap bitmap);
    }

    public Model(Context context) {
        this.mContext = context;

        // 初始化默认图片
        mBitmap = BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher);
    }

    public void setOnStateChangeListener(OnStateChangeListener listener) {
        mListener = listener;
    }

    public void loadImage() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 模拟耗时操作
                    Thread.sleep(2000);
                    // 获取图像
                    mBitmap = BitmapFactory.decodeResource(mContext.getResources(), R.mipmap.ic_launcher);

                    // 回传给 View
                    if (null != mListener) {
                        mHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                mListener.OnStateChanged(mBitmap);
                            }
                        });
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void clearImage() {
        // 清除图像
        mBitmap = null;

        // 回传给 View
        if (null != mListener) {
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    mListener.OnStateChanged(null);
                }
            });
        }
    }

    public Bitmap getImage() {
        return mBitmap;
    }
}
