package com.oosd.monopolygame;

import com.oosd.monopolygame.action.Invoker;
import com.oosd.monopolygame.action.RollDice;

public class Demo {
    public static void main(String[] args) {
        int playerCount;
        playerCount = 4;
        MonopolyGame monopolyGame = new MonopolyGame(playerCount);
        monopolyGame.createBoard();
        monopolyGame.createPlayers();
        monopolyGame.decideMoveOrder();
        monopolyGame.startGame();

    }
}
