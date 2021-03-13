package com.oosd.monopolygame.action;

import com.oosd.monopolygame.Player;

public class PayRent implements PlayerAction {

    @Override
    public void execute(Player player) {
        System.out.println(player.getColor() + " paid rent ");
    }
}
