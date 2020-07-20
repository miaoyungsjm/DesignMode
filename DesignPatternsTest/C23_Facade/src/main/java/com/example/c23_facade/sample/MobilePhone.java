package com.example.c23_facade.sample;

/**
 * @author ggz
 * @date 2020/7/20
 */
public class MobilePhone {
    private Phone mPhone = new PhoneImp();
    private Camera mCamera = new SamsungCamera();

    public void dail() {
        mPhone.dail();
    }

    public void videoChat() {
        mCamera.open();
        mPhone.dail();
    }

    public void takePicture() {
        mCamera.open();
        mCamera.takePicture();
    }

    public void hangup() {
        mPhone.hangup();
    }

    public void closeCamera() {
        mCamera.close();
    }
}
