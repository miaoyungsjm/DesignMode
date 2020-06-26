package com.example.c11_command.sample;

/**
 * @author ggz
 * @date 2020/6/26
 */
public class RebootCommand implements Command {
    /**
     * 持有一个接收者对象的引用
     */
    private Receiver receiver;

    public RebootCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Command: execute");
        receiver.saveData();
        receiver.reboot();
    }
}
