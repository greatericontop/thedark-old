package io.github.greatericontop.thedark.enemy;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class PigBrute extends BaseEnemy {

    public PigBrute(Location spawnLocation) {
        entity = (LivingEntity) spawnLocation.getWorld().spawnEntity(spawnLocation, EntityType.PIGLIN_BRUTE, false);
        applyAttributes(50.0, 0.35); // same health, same speed
        entity.getEquipment().setHelmet(new ItemStack(Material.GOLDEN_HELMET, 1));
        entity.getEquipment().setItemInMainHand(new ItemStack(Material.GOLDEN_AXE, 1));
    }

    @Override
    public int coinsToAwardOnDeath() {
        return 75;
    }

    // TODO: onDeath event that spawns 2 PigZombies

}
