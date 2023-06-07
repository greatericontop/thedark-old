package io.github.greatericontop.thedark.guns;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public enum GunType {

    PISTOL(
            3.0, 11L,
            Material.WOODEN_HOE,
            "§fPistol",
            "§7A basic pistol."
    ),

    RIFLE(
            4.0, 9L,
            Material.STONE_HOE,
            "§eRifle",
            "§7A high-powered rifle that fires quickly."
    ),

    SHOTGUN(
            6.0, 25L,
            Material.IRON_SHOVEL,
            "§eShotgun",
            "§7This shotgun damages multiple enemies."
    ),

    SUPER_WEAPON(
            20.0, 2L,
            Material.NETHERITE_HOE,
            "§cTHE SUPERWEAPON",
            "§4Need I say more?"
    ),

    ;

    private final double damage;
    private final long cooldownTicks;

    private final Material itemMaterial;
    private final Component itemName;
    private final List<Component> itemLore;

    public double getDamage() {
        return damage;
    }
    public long getCooldownTicks() {
        return cooldownTicks;
    }

    GunType(double damage, long cooldownTicks, Material itemMaterial, String itemName, String miniDescription) {
        this.damage = damage;
        this.cooldownTicks = cooldownTicks;
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
