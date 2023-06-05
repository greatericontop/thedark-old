package io.github.greatericontop.thedark.player;

import io.github.greatericontop.thedark.TheDark;
import io.github.greatericontop.thedark.Util;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class ArmorBuyListener extends GenericMenu {
    public static final Component INVENTORY_NAME = Component.text("§c[TheDark] §bArmor Upgrades");

    private final TheDark plugin;
    public ArmorBuyListener(TheDark plugin) {
        this.plugin = plugin;
    }

    @Override
    public void openMenu(PlayerProfile profile) {
        Player player = profile.getPlayer();
        Inventory gui = Bukkit.createInventory(player, 9, INVENTORY_NAME);

        int lvl = profile.armorLevel;

        Material mat = (lvl == 0) ? Material.LIGHT_BLUE_STAINED_GLASS : (lvl > 0) ? Material.GREEN_STAINED_GLASS_PANE : Material.RED_STAINED_GLASS_PANE;
        gui.setItem(0, Util.createItemStack(mat, 1, "§eLeather Armor", "§7Cost: §6500"));

        mat = (lvl == 1) ? Material.LIGHT_BLUE_STAINED_GLASS : (lvl > 1) ? Material.GREEN_STAINED_GLASS_PANE : Material.RED_STAINED_GLASS_PANE;
        gui.setItem(1, Util.createItemStack(mat, 1, "§eChain Armor", "§7Cost: §62,000"));

        mat = (lvl == 2) ? Material.LIGHT_BLUE_STAINED_GLASS : (lvl > 2) ? Material.GREEN_STAINED_GLASS_PANE : Material.RED_STAINED_GLASS_PANE;
        gui.setItem(2, Util.createItemStack(mat, 1, "§eIron Armor", "§7Cost: §65,000"));

        mat = (lvl == 3) ? Material.LIGHT_BLUE_STAINED_GLASS : (lvl > 3) ? Material.GREEN_STAINED_GLASS_PANE : Material.RED_STAINED_GLASS_PANE;
        gui.setItem(3, Util.createItemStack(mat, 1, "§eDiamond Chestplate", "§7Cost: §610,000"));

        player.openInventory(gui);
    }

    @EventHandler()
    public void onInventoryClick(InventoryClickEvent event) {

    }

}
