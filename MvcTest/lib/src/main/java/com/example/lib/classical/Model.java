package com.example.lib.classical;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * @author my
 * @date 2018/7/3
 */
public class Model {
    private OnStateChangeListener mListener;

    private Image mImage;

    public interface OnStateChangeListener {
        void onStateChanged(Image image);
    }

    public Model() {
        try {
            // 预加载默认图片
            mImage = ImageIO.read(new URL("http://wx2.sinaimg.cn/mw690/ac38503ely1fesz8m0ov6j20qo140dix.jpg"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
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
                    Thread.sleep(3000);
                    // 获取图像
                    mImage = ImageIO.read(new URL("http://wx2.sinaimg.cn/mw690/ac38503ely1fesz8m0ov6j20qo140dix.jpg"));

                    // 回传给 View
                    if (null != mListener) {
                        mListener.onStateChanged(mImage);
                    }
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void clearImage() {
        // 清除图像
        mImage = null;

        // 回传给 View
        if (null != mListener) {
            mListener.onStateChanged(null);
        }
    }

    public Image getImage() {
        return mImage;
    }
}
