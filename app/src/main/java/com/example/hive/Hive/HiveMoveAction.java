package com.example.hive.Hive;

import com.example.hive.game.GamePlayer;
import com.example.hive.game.actionMessage.GameAction;

public class HiveMoveAction extends GameAction {

    /**
     *  consturctor for GameAction
     *
     * @param player
     *      the player who created the action
     */
    public HiveMoveAction(GamePlayer player) {super(player);}
}
