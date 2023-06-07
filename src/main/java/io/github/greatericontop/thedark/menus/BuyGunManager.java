package io.github.greatericontop.thedark.menus;

import io.github.greatericontop.thedark.guns.GunType;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BuyGunManager {

    public static void giveGun(GunType gunType, Player player, Integer forceSlot) {
        int slot = forceSlot != null ? forceSlot : getFirstSpace(player);
        if (slot == -1) {
            // no space available and not forced
            player.sendMessage("§3No slot was available and the gun give was not forced to a slot.");
            return;
        }
        ItemStack gunItem = gunType.createItemStack();
        player.getInventory().setItem(slot, gunItem);
    }

    private static int getFirstSpace(Player player) {
        // check for guns in slot 1, 2, 3
        for (int slot = 1; slot <= 3; slot++) {
            ItemStack stack = player.getInventory().getItem(slot);
            if (stack == null)  return slot;
            // light gray dye signifies an empty space
            if (stack.getType() == Material.LIGHT_GRAY_DYE)  return slot;
        }
        return -1;
    }

}
