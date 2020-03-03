package com.example.ggz.state.Demo;

public class TvController implements PowerController {

    private TvState mTvState;

    public TvController() {
    }

    public TvController(TvState state) {
        mTvState = state;
    }

    public void setTvState(TvState state) {
        this.mTvState = state;
    }

    @Override
    public void powerOn() {
        System.out.println("开机");
        setTvState(new PowerOnState());
    }

    @Override
    public void powerOff() {
        System.out.println("关机");
        setTvState(new PowerOffState());
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
