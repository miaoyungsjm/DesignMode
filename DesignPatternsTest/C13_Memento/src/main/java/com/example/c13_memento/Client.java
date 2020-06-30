package com.example.c13_memento;

import com.example.c13_memento.sample.CallOfDuty;
import com.example.c13_memento.sample.Caretaker;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class Client {
    public static void main(String[] args) {
        // ----------------------
        Caretaker caretaker = new Caretaker();

        // 打开游戏
        CallOfDuty game = new CallOfDuty();
        // 奋战中
        game.play();
        game.play();

        // 存档
        caretaker.archive(game.createMemento());

        // 退出游戏
        game.quit();

        // 重新打开游戏
        CallOfDuty restartGame = new CallOfDuty();
        // 恢复存档
        restartGame.restore(caretaker.getMemento());
    }
}
