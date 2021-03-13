package com.oosd.monopolygame.action;
import com.oosd.monopolygame.Player;

import java.util.Random;

public class RollDice implements PlayerAction {

    private int diceValue;
    @Override
    public void execute(Player player) {


        // rolling dice. it will completely change.
        roll();
        System.out.println(player.getColor() + " rolls " + this.diceValue);
        player.setDiceValue(diceValue);
    }

    public void roll() {
        Random rand = new Random();
        int n = rand.nextInt(12) + 1;
        setDiceValue(n);
    }
    public int getDiceValue() {
        return diceValue;
    }

    public void setDiceValue(int diceValue) {
        this.diceValue = diceValue;
    }
}
