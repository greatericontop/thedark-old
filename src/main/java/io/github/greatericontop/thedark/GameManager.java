package io.github.greatericontop.thedark;

import io.github.greatericontop.thedark.enemy.BaseEnemy;
import org.bukkit.Location;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class GameManager {

    private final TheDark plugin;
    // TODO: for testing
    public final List<BaseEnemy> activeEnemies;

    public GameManager(TheDark plugin) {
        this.plugin = plugin;
        activeEnemies = new ArrayList<>();
    }

    public void tick() {
        activeEnemies.removeIf(BaseEnemy::isDead);
    }

    public void spawnEnemy(Class<? extends BaseEnemy> enemyClass, Location loc) {
        BaseEnemy enemy;
        try {
            enemy = enemyClass.getConstructor(Location.class).newInstance(loc);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            plugin.getLogger().severe("Reflection error (this should never happen)");
            e.printStackTrace();
            return;
        }
        activeEnemies.add(enemy);
    }

}
