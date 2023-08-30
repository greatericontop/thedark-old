package io.github.greatericontop.thedark.rounds.operation;

import io.github.greatericontop.thedark.enemy.BaseEnemy;
import org.bukkit.Bukkit;

public class SpawnOneAtATime extends BaseOperation {

    private final int offset;
    private final Class<? extends BaseEnemy> enemyClass;
    private final int count;
    private final int spacing;

    public SpawnOneAtATime(int offsetTicks, Class<? extends BaseEnemy> enemyClass, int count, int spacing) {
        this.offset = offsetTicks;
        this.enemyClass = enemyClass;
        this.count = count;
        this.spacing = spacing;
    }

    @Override
    protected int getOffset() {
        return offset;
    }

    @Override
    public void actuallyExecute(OperationContext ctx) {
        Bukkit.getScheduler().runTaskLater(ctx.plugin(), () -> spawnOne(ctx, count), 1L);
    }

    private void spawnOne(OperationContext ctx, int numberRemaining) {
        if (numberRemaining <= 0) {
            return;
        }
        ctx.plugin().getGameManager().spawnEnemy(enemyClass, ctx.location());
        final int numberRemainingNext = numberRemaining - 1;
        Bukkit.getScheduler().runTaskLater(ctx.plugin(), () -> spawnOne(ctx, numberRemainingNext), spacing);
    }

}
