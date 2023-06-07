package io.github.greatericontop.thedark.guns;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public enum GunType {

    PISTOL(
            3.0, 11L, 125,
            Material.WOODEN_HOE,
            "§fPistol",
            "§7A basic pistol."
    ),

    RIFLE(
            4.0, 9L, 500,
            Material.STONE_HOE,
            "§eRifle",
            "§7A high-powered rifle that fires quickly."
    ),

    SHOTGUN(
            6.0, 25L, 400,
            Material.IRON_SHOVEL,
            "§eShotgun",
            "§7This shotgun damages multiple enemies."
    ),

    SUPER_WEAPON(
            20.0, 2L, 10,
            Material.NETHERITE_HOE,
            "§cTHE SUPERWEAPON",
            "§4Need I say more?"
    ),

    ;

    private final double damage;
    private final long cooldownTicks;
    private final int cost;

    private final Material itemMaterial;
    private final Component itemName;
    private final List<Component> itemLore;

    public double getDamage() {
        return damage;
    }
    public long getCooldownTicks() {
        return cooldownTicks;
    }
    public int getCost() {
        return cost;
    }

    GunType(double damage, long cooldownTicks, int cost, Material itemMaterial, String itemName, String miniDescription) {
        this.damage = damage;
        this.cooldownTicks = cooldownTicks;
        this.cost = cost;
        this.itemMaterial = itemMaterial;
        this.itemName = Component.text(itemName);
        this.itemLore = List.of(
                Component.text(miniDescription),
                Component.text(""),
                Component.text(String.format("§7Damage: §f%.0f", damage)),
                Component.text(String.format("§7Cooldown: §f%.2fs", cooldownTicks*0.05))
        );
    }

    public ItemStack createItemStack() {
        ItemStack stack = new ItemStack(itemMaterial, 1);
        ItemMeta im = stack.getItemMeta();
        im.displayName(itemName);
        im.lore(itemLore);
        im.getPersistentDataContainer().set(GunUtil.GUN_KEY, PersistentDataType.STRING, this.name());
        stack.setItemMeta(im);
        return stack;
    }

}
