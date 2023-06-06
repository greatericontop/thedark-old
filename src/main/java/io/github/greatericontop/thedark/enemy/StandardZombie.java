package io.github.greatericontop.thedark.enemy;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class StandardZombie extends BaseEnemy {

    public StandardZombie(Location spawnLocation) {
        entity = (LivingEntity) spawnLocation.getWorld().spawnEntity(spawnLocation, EntityType.ZOMBIE, false);
        applyAttributes(30.0, 0.253); // extra health, slightly faster, and armored
        entity.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET, 1));
        entity.getEquipment().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE, 1));
        entity.getEquipment().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS, 1));
        entity.getEquipment().setBoots(new ItemStack(Material.LEATHER_BOOTS, 1));
    }

    @Override
    public int coinsToAwardOnDeath() {
        return 25;
    }

}
