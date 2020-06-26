package com.example.c11_command.demo1.command;

import com.example.c11_command.demo1.receiver.TetrisMachine;

/**
 * @author ggz
 * @date 2020/6/26
 */
public class FallCommand implements Command {
    TetrisMachine tetrisMachine;

    public FallCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        tetrisMachine.fastToBottom();
    }
}
