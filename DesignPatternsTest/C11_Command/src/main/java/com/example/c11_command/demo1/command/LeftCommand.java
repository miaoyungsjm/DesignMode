package com.example.c11_command.demo1.command;

import com.example.c11_command.demo1.receiver.TetrisMachine;

/**
 * @author ggz
 * @date 2020/6/26
 */
public class LeftCommand implements Command {
    TetrisMachine tetrisMachine;

    public LeftCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        tetrisMachine.toLeft();
    }
}
