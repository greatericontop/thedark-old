package io.github.greatericontop.thedark.enemy;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class ArmedStandardZombie extends BaseEnemy {

    public ArmedStandardZombie(Location spawnLocation) {
        entity = (LivingEntity) spawnLocation.getWorld().spawnEntity(spawnLocation, EntityType.ZOMBIE, false);
        setUp(35.0, 0.253); // 75% extra health, 10% faster
        entity.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET, 1));
        entity.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE, 1));
        entity.getEquipment().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS, 1));
        entity.getEquipment().setBoots(new ItemStack(Material.LEATHER_BOOTS, 1));
        entity.getEquipment().setItemInMainHand(new ItemStack(Material.IRON_SWORD, 1));
    }

    @Override
    public int coinsToAwardOnDeath() {
        return 35;
    }

}
