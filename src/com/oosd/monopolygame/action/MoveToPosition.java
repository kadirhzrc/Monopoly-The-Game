package com.oosd.monopolygame.action;

import com.oosd.monopolygame.Player;

public class MoveToPosition implements PlayerAction {
    @Override
    public void execute(Player player) {
        System.out.println(player.getColor() + " moves by " + player.getDiceValue());
    }
}
