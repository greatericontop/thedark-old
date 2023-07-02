package io.github.greatericontop.thedark.rounds.operation;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;

public class Delay extends BaseOperation {

    private final int ticks;
    private final Component message;

    public Delay(int seconds) {
        ticks = seconds * 20;
        message = null;
    }
    public Delay(int seconds, String message) {
        ticks = seconds * 20;
        this.message = Component.text(message);
    }

    @Override
    public void execute(OperationContext ctx) {
        if (message != null) {
            Bukkit.broadcast(message); // message broadcast at the *start* of the delay
        }
        Bukkit.getScheduler().runTaskLater(ctx.plugin(), () -> this.executeNext(ctx), ticks);
    }

}
