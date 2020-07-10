package com.example.c17_mediator.demo;

/**
 * @author ggz
 * @date 2020/7/10
 */
public class MainBoard extends Mediator {

    private CDDevice cdDevice;
    private CPU cpu;
    private SoundCard soundCard;
    private GraphicsCard graphicsCard;

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void changed(Colleague colleague) {
        // 通知中介者
        if (colleague == cdDevice) {
            handleCD((CDDevice) colleague);
        } else if (colleague == cpu) {
            handleCPU((CPU) colleague);
        }
    }

    /**
     * 业务逻辑
     */
    private void handleCD(CDDevice cdDevice) {
        cpu.decodeData(cdDevice.read());
    }

    private void handleCPU(CPU cpu) {
        graphicsCard.videoPlay(cpu.getVideoData());
        soundCard.audioPlay(cpu.getAudioData());
    }
}
