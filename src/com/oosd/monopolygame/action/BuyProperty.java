package com.oosd.monopolygame.action;

import com.oosd.monopolygame.Player;

public class BuyProperty implements PlayerAction {

    @Override
    public void execute(Player player) {
        System.out.println(player.getColor() + " bought property ");
    }
}
