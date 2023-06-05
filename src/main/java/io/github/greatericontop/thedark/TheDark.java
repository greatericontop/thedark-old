package io.github.greatericontop.thedark;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class TheDark extends JavaPlugin {

    private GameManager gameManager;


    public GameManager getGameManager() {
        return gameManager;
    }



    @Override
    public void onEnable() {
        gameManager = new GameManager(this);
        getCommand("thedark").setExecutor(new TheDarkCommand(this));

        new BukkitRunnable() {
            public void run() {
                gameManager.tick();
            }
        }.runTaskTimer(this, 20L, 1L);

    }

}
