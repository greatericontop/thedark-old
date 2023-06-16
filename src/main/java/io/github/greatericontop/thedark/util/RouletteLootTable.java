package io.github.greatericontop.thedark.util;

import io.github.greatericontop.thedark.player.PlayerProfile;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RouletteLootTable {

    public static int getCost(int winKey) {
        return new int[] {
                2000, // 0
                4000, // 1
        }[winKey];
    }

    public static ItemStack getIcon(int winKey) {
        switch (winKey) {
            case 0 -> {
                return new ItemStack(Material.OAK_PLANKS);
            }
            case 1 -> {
                return new ItemStack(Material.SPRUCE_PLANKS);
            }
            default -> {
                throw new IllegalArgumentException("invalid winKey " + winKey);
            }
        }
    }

    public static void runClaim(int winKey, PlayerProfile profile, Player player) {
        profile.coins -= getCost(winKey);

        switch (winKey) {
            case 0 -> {
                player.sendMessage("§3You got some oak planks for 2000 coins.");
            }
            case 1 -> {
                player.sendMessage("§3You got some spruce planks for 4000 coins.");
            }
        }
    }

}
