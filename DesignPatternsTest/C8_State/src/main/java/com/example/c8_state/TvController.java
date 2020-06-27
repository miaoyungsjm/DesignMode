package com.example.c8_state;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class TvController implements PowerController {

    private TvState mTvState;

    public void setTvState(TvState state) {
        mTvState = state;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机");
    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void prevChannel() {
        mTvState.prevChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
}
