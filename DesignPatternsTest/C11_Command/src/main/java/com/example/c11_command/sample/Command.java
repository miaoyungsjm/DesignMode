package com.example.c11_command.sample;

/**
 * @author ggz
 * @date 2020/6/26
 */
public interface Command {
    /**
     * 执行具体操作命令
     * 调用接收者角色的一系列方法
     * 执行方法
     */
    void execute();
}
