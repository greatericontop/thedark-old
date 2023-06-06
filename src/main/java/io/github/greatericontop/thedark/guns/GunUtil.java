package io.github.greatericontop.thedark.guns;

import io.github.greatericontop.thedark.TheDark;
import org.bukkit.FluidCollisionMode;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

public class GunUtil implements Listener {
    public final static NamespacedKey GUN_KEY = new NamespacedKey("thedark", "gun");
    private final static NamespacedKey DAMAGE_KEY = new NamespacedKey("thedark", "arrow_damage");
    private final static double MAX_DISTANCE = 72.0;

    public static void fireProjectile(GunType gunType, Location sourceLoc, Vector direction, Player owner, double damage, TheDark plugin) {
        // perform raytrace
        RayTraceResult result = sourceLoc.getWorld().rayTrace(
                sourceLoc, direction, MAX_DISTANCE,
                FluidCollisionMode.NEVER, true, 0.0,
                entity -> (entity instanceof LivingEntity && entity.getType() != EntityType.PLAYER));
        Location targetLoc;
        if (result != null) {
            targetLoc = result.getHitPosition().toLocation(sourceLoc.getWorld());
            if (result.getHitEntity() != null) {
                LivingEntity targetEntity = (LivingEntity) result.getHitEntity();
                targetEntity.damage(damage, owner);
                // TODO knockback?
            }
        } else {
            targetLoc = sourceLoc.clone().add(direction.clone().multiply(MAX_DISTANCE));
        }
        // special properties
        if (gunType == GunType.SHOTGUN) {
            targetLoc.getWorld().spawnParticle(Particle.EXPLOSION_LARGE, targetLoc, 8);
            for (LivingEntity e : targetLoc.getNearbyLivingEntities(3.0)) {
                e.damage(damage, owner);
            }
        }
        // particles
        Vector totalDelta = targetLoc.toVector().subtract(sourceLoc.toVector());
        Vector step = totalDelta.clone().normalize().multiply(0.2);
        Location current = sourceLoc.clone();
        for (int i = 0; i < (int) (totalDelta.length() / 0.2); i++) {
            current.add(step);
            current.getWorld().spawnParticle(Particle.ASH, current, 1, 0.0, 0.0, 0.0, 0.0);
        }
        // sound
        sourceLoc.getWorld().playSound(sourceLoc, Sound.ENTITY_GENERIC_EXPLODE, 0.225F, 1.0F);
    }

}
