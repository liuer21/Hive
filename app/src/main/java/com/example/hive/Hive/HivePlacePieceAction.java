package com.example.hive.Hive;

import com.example.hive.game.GamePlayer;
import com.example.hive.game.actionMessage.GameAction;

public class HivePlacePieceAction extends GameAction {

    protected int row;
    protected int col;
    /**
     * constructor for GameAction
     *
     * @param player
     *      the player who created the action
     */
    public HivePlacePieceAction(GamePlayer player, int x, int y)
    {
        super(player);

        row = x;
        col = y;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }
}