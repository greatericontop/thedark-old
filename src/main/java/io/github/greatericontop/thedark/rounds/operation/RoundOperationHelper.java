package io.github.greatericontop.thedark.rounds.operation;

import io.github.greatericontop.thedark.enemy.BaseEnemy;

import java.util.ArrayList;
import java.util.List;

public class RoundOperationHelper {

    private List<BaseOperation> operations;
    private int currentOffsetTicks;

    public RoundOperationHelper(int initialDelayTicks) {
        this.operations = new ArrayList<>();
        this.currentOffsetTicks = initialDelayTicks;
    }

    public BaseOperation[] getOutput() {
        return operations.toArray(new BaseOperation[0]);
    }

    //

    public RoundOperationHelper delay(int ticks) {
        currentOffsetTicks += ticks;
        return this;
    }

    public RoundOperationHelper delaySeconds(int seconds) {
        currentOffsetTicks += seconds * 20;
        return this;
    }

    // Note that :isAsync: will add the operation at the current offset without increasing the offset
    // This means that it will run at the same time as the NEXT operation, NOT the CURRENT one

    public RoundOperationHelper addSpawnOneAtATime(Class<? extends BaseEnemy> enemyClass, int count, int spacing, boolean isAsync) {
        BaseOperation operation = new SpawnOneAtATime(currentOffsetTicks, enemyClass, count, spacing);
        operations.add(operation);
        if (!isAsync) {
            currentOffsetTicks += (count - 1) * spacing + 1;
        }
        return this;
    }

}
