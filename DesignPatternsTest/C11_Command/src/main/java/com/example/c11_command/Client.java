package com.example.c11_command;

import com.example.c11_command.demo1.command.FallCommand;
import com.example.c11_command.demo1.command.LeftCommand;
import com.example.c11_command.demo1.command.RightCommand;
import com.example.c11_command.demo1.command.TransformCommand;
import com.example.c11_command.demo1.invoker.Buttons;
import com.example.c11_command.demo1.receiver.TetrisMachine;
import com.example.c11_command.sample.ShutdownCommand;
import com.example.c11_command.sample.Invoker;
import com.example.c11_command.sample.RebootCommand;
import com.example.c11_command.sample.Receiver;
import com.example.c11_command.sample.StandbyCommand;

/**
 * @author ggz
 * @date 2020/6/26
 */
public class Client {
    public static void main(String[] args) {
        // --------------------------------
        // 构造接受者对象
        Receiver receiver = new Receiver();
        // 根据接收者对象构造命令对象
        ShutdownCommand shutdownCommand = new ShutdownCommand(receiver);
        RebootCommand rebootCommand = new RebootCommand(receiver);
        StandbyCommand standbyCommand = new StandbyCommand(receiver);
        // 根据具体的对象构造请求者对象
        Invoker invoker = new Invoker(shutdownCommand, rebootCommand, standbyCommand);
        /*
         * 将调用者和行为实现者分离
         */
        invoker.shutdownAction();


        // --------------------------------
        TetrisMachine machine = new TetrisMachine();

        LeftCommand leftCommand = new LeftCommand(machine);
        RightCommand rightCommand = new RightCommand(machine);
        FallCommand fallCommand = new FallCommand(machine);
        TransformCommand transformCommand = new TransformCommand(machine);

        Buttons buttons = new Buttons(leftCommand, rightCommand, fallCommand, transformCommand);
        // 用户操作...
        buttons.toLeft();
        buttons.toRight();
        // --------------------------------
        TetrisMachine machine1 = new TetrisMachine();
        // 用户操作...
        machine1.toLeft();
        machine1.toRight();
        // --------------------------------
    }
}
