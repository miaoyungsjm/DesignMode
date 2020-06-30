package com.example.c13_memento.sample;

/**
 * @author ggz
 * @date 2020/6/30
 */
public class Caretaker {
    Memento mMemento;

    public void archive(Memento memento) {
        mMemento = memento;
    }

    public Memento getMemento() {
        return mMemento;
    }
}
