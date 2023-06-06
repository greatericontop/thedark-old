package io.github.greatericontop.thedark.enemy;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

public class BasicZombie extends BaseEnemy {

    public BasicZombie(Location spawnLocation) {
        entity = (LivingEntity) spawnLocation.getWorld().spawnEntity(spawnLocation, EntityType.ZOMBIE, false);
        applyAttributes(20.0, 0.23); // same as vanilla
    }

    @Override
    public int coinsToAwardOnDeath() {
        return 15;
    }

}
