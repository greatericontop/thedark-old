package io.github.greatericontop.thedark.enemy;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;

public abstract class BaseEnemy {
    protected LivingEntity entity;

    public LivingEntity getEntity() {
        return entity;
    }

    public boolean isDead() {
        return entity.isDead();
    }

    protected void applyAttributes(double maxHealth, double speed) {
        entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(maxHealth);
        entity.setHealth(maxHealth);
        entity.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(speed);
        entity.getAttribute(Attribute.GENERIC_FOLLOW_RANGE).setBaseValue(64.0);
    }


    public abstract int coinsToAwardOnDeath();

}
