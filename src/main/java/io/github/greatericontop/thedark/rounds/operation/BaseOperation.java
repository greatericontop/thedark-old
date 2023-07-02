package io.github.greatericontop.thedark.rounds.operation;

import org.bukkit.Bukkit;

public abstract class BaseOperation {

    // Some constructor here
    // This will initialize config stuff (e.g., what enemies to spawn, how many, how long to delay)
    // Other info will be passed in to :execute: when it is called

    protected abstract int getOffset();

    public void execute(OperationContext ctx) {
        Bukkit.getScheduler().runTaskLater(ctx.plugin(), () -> actuallyExecute(ctx), getOffset());
    }

    // Note: you should be able to execute this method multiple times.
    public abstract void actuallyExecute(OperationContext ctx);

}
