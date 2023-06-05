package io.github.greatericontop.thedark.menus;

import io.github.greatericontop.thedark.TheDark;
import io.github.greatericontop.thedark.Util;
import io.github.greatericontop.thedark.player.PlayerProfile;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class SwordBuyListener extends GenericMenu {
    public static final Component INVENTORY_NAME = Component.text("§c[TheDark] §bSwords");
    private static final int NUMBER_UPGRADES = 4;
    private static final String[] NAMES = {
            "§7Stone Sword",
            "§f§lIron Sword",
            "§bDiamond Sword",
            "§8§lNetherite Sword",
    };
    private static final int[] COSTS = {
            -1,
            250,
            1000,
            2000,
    };
    public static final Material[] SWORD_MATERIALS = {
            Material.STONE_SWORD,
            Material.IRON_SWORD,
            Material.DIAMOND_SWORD,
            Material.NETHERITE_SWORD,
    };

    private final TheDark plugin;
    public SwordBuyListener(TheDark plugin) {
        this.plugin = plugin;
    }

    @Override
    public void openMenu(PlayerProfile profile) {
        Player player = profile.getPlayer();
        Inventory gui = Bukkit.createInventory(player, 9, INVENTORY_NAME);

        int lvl = profile.swordTier;

        gui.setItem(0, Util.createItemStack(Material.LIME_STAINED_GLASS_PANE, 1, NAMES[0], "§aALREADY UNLOCKED"));
        for (int i = 1; i < NUMBER_UPGRADES; i++) {
            Material mat = (lvl == i) ? Material.LIGHT_BLUE_STAINED_GLASS : (lvl > i) ? Material.LIME_STAINED_GLASS_PANE : Material.RED_STAINED_GLASS_PANE;
            gui.setItem(i, Util.createItemStack(mat, 1,
                    NAMES[i],
                    String.format("§7Cost: §6%,d", COSTS[i])));
        }

        player.openInventory(gui);
    }

    @EventHandler()
    public void onInventoryClick(InventoryClickEvent event) {
        if (!event.getView().title().equals(INVENTORY_NAME))  return;
        event.setCancelled(true);
        int slot = event.getSlot();
        if (slot >= NUMBER_UPGRADES)  return;
        Player player = (Player) event.getWhoClicked();
        PlayerProfile profile = plugin.getGameManager().getPlayerProfile(player);
        if (profile == null) {
            player.sendMessage("§cYou don't have a profile!");
            return;
        }
        int currentLevel = profile.swordTier;
        if (slot > currentLevel) {
            player.sendMessage("§cYou need to buy the previous upgrade first!");
            Util.playFailSound(player);
            return;
        }
        if (slot < currentLevel) {
            player.sendMessage("§cYou already have this upgrade!");
            Util.playFailSound(player);
            return;
        }
        int cost = COSTS[slot];
        if (profile.coins < cost) {
            player.sendMessage("§cYou can't afford this!");
            Util.playFailSound(player);
            return;
        }
        profile.coins -= cost;
        profile.swordTier++;
        player.sendMessage("§aYou have successfully upgraded your sword!");
        player.closeInventory();
        Util.playSuccessSound(player);
    }

}
