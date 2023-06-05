package io.github.greatericontop.thedark;

import io.github.greatericontop.thedark.menus.ArmorBuyListener;
import io.github.greatericontop.thedark.menus.SignListener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class TheDark extends JavaPlugin {

    private GameManager gameManager;
    public GameManager getGameManager() {
        return gameManager;
    }

    public ArmorBuyListener armorBuyListener = null;



    @Override
    public void onEnable() {
        gameManager = new GameManager(this);
        this.getCommand("thedark").setExecutor(new TheDarkCommand(this));

        this.getServer().getPluginManager().registerEvents(new SignListener(this), this);
        armorBuyListener = new ArmorBuyListener(this);
        this.getServer().getPluginManager().registerEvents(armorBuyListener, this);


        new BukkitRunnable() {
            public void run() {
                gameManager.tick();
            }
        }.runTaskTimer(this, 20L, 1L);

    }

}
