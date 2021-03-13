package com.oosd.monopolygame.action;

import com.oosd.monopolygame.Player;

public class Invoker {
    public void makeAction(Player player, PlayerAction playerAction) {
        playerAction.execute(player);
    }
}
