package io.github.greatericontop.thedark;

import io.github.greatericontop.thedark.enemy.BasicZombie;
import io.github.greatericontop.thedark.enemy.FatDebugZombie;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TheDarkCommand implements CommandExecutor {

    private final TheDark plugin;
    public TheDarkCommand(TheDark plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            return false;
        }
        if (!(sender instanceof Player player)) {
            sender.sendMessage("§cPlayers only!");
            return true;
        }

        if (args[0].equals("info")) {
            player.sendMessage("§cTheDark v" + plugin.getDescription().getVersion());
            player.sendMessage(String.format("§7Enemy count: §f%d", plugin.getGameManager().activeEnemies.size()));
        }

        if (args[0].equals("spawnBasicZombies")) {
            for (int i = 0; i < 5; i++) {
                plugin.getGameManager().spawnEnemy(BasicZombie.class, player.getLocation());
            }
        }
        if (args[0].equals("spawnDebugZombie")) {
            plugin.getGameManager().spawnEnemy(FatDebugZombie.class, player.getLocation());
        }

        return false;
    }

}
