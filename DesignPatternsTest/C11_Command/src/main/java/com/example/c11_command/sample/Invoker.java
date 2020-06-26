package com.example.c11_command.sample;

/**
 * @author ggz
 * @date 2020/6/26
 */
public class Invoker {
    /**
     * 持有一个对应命令对象的引用
     */
    private ShutdownCommand shutdownCommand;
    private RebootCommand rebootCommand;
    private StandbyCommand standbyCommand;

    public Invoker(ShutdownCommand shutdownCommand,
                   RebootCommand rebootCommand,
                   StandbyCommand standbyCommand) {
        this.shutdownCommand = shutdownCommand;
        this.rebootCommand = rebootCommand;
        this.standbyCommand = standbyCommand;
    }

    public void shutdownAction() {
        // 调用具体命令对象的相关方法，执行具体命令
        System.out.println("Invoker: shutdownAction");
        shutdownCommand.execute();
    }

    public void rebootAction() {
        // 调用具体命令对象的相关方法，执行具体命令
        rebootCommand.execute();
    }

    public void standbyAction() {
        // 调用具体命令对象的相关方法，执行具体命令
        standbyCommand.execute();
    }
}
