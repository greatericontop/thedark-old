package io.github.greatericontop.thedark.player;

import org.bukkit.entity.Player;

public class PlayerProfile {
    private Player player;
    public int coins;
    public int armorLevel;

    public PlayerProfile(Player player) {
        this.player = player;
        coins = 0;
        armorLevel = 0;
    }

    public Player getPlayer() {
        return player;
    }

}
