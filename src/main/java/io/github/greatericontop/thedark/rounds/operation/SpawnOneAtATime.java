package io.github.greatericontop.thedark.rounds.operation;

import io.github.greatericontop.thedark.enemy.BaseEnemy;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.concurrent.ThreadLocalRandom;

public class SpawnOneAtATime extends BaseOperation {

    private final Class<? extends BaseEnemy> enemyClass;
    private final int count;
    private final int spacing;
    private final boolean shouldRandomize;

    public SpawnOneAtATime(Class<? extends BaseEnemy> enemyClass, int count, int spacing, boolean shouldRandomize) {
        this.enemyClass = enemyClass;
        this.count = count;
        this.spacing = spacing;
        this.shouldRandomize = shouldRandomize;
    }

    @Override
    public void execute(OperationContext ctx) {
        final int[] numberRemaining = {count};
        new BukkitRunnable() {
            public void run() {
                if (numberRemaining[0] <= 0) {
                    cancel();
                    SpawnOneAtATime.this.executeNext(ctx);
                    return;
                }
                ctx.plugin().getGameManager().spawnEnemy(enemyClass, ctx.location());
                numberRemaining[0]--;
                this.runTaskLater(ctx.plugin(), getNextDelayTicks());
            }
        }.runTaskLater(ctx.plugin(), 1L);
    }

    private int getNextDelayTicks() {
        if (shouldRandomize) {
            int randomnessBound = (int) (spacing * 0.15);
            return spacing + ThreadLocalRandom.current().nextInt(-randomnessBound, randomnessBound+1);
        }
        return spacing;
    }

}
