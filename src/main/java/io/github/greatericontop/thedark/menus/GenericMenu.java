package io.github.greatericontop.thedark.menus;

import io.github.greatericontop.thedark.player.PlayerProfile;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public abstract class GenericMenu implements Listener {

    public abstract void openMenu(PlayerProfile profile);

}
