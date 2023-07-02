package io.github.greatericontop.thedark.rounds.operation;

import io.github.greatericontop.thedark.enemy.BaseEnemy;
import org.bukkit.scheduler.BukkitRunnable;

public class SpawnOneAtATime extends BaseOperation {

    private final int offset;
    private final Class<? extends BaseEnemy> enemyClass;
    private final int count;
    private final int spacing;

    public SpawnOneAtATime(double offsetSeconds, Class<? extends BaseEnemy> enemyClass, int count, int spacing) {
        this.offset = (int) (offsetSeconds * 20);
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
        final int[] numberRemaining = {count};
        new BukkitRunnable() {
            public void run() {
                if (numberRemaining[0] <= 0) {
                    cancel();
                    return;
                }
                ctx.plugin().getGameManager().spawnEnemy(enemyClass, ctx.location());
                numberRemaining[0]--;
                this.runTaskLater(ctx.plugin(), spacing);
            }
        }.runTaskLater(ctx.plugin(), 1L);
    }

}
