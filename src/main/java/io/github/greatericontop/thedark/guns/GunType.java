package io.github.greatericontop.thedark.guns;

public enum GunType {

    PISTOL(3.0, 9L),
    RIFLE(4.0, 8L),
    SHOTGUN(8.0, 20L),

    SUPER_WEAPON(20.0, 2L),

    ;

    private final double damage;
    private final long cooldownTicks;

    public double getDamage() {
        return damage;
    }
    public long getCooldownTicks() {
        return cooldownTicks;
    }

    GunType(double damage, long cooldownTicks) {
        this.damage = damage;
        this.cooldownTicks = cooldownTicks;
    }
}
