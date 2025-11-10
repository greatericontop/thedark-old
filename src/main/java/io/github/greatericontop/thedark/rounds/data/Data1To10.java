package io.github.greatericontop.thedark.rounds.data;

import io.github.greatericontop.thedark.enemy.other.EmeraldVindicator;
import io.github.greatericontop.thedark.enemy.zombies.BasicZombie;
import io.github.greatericontop.thedark.enemy.zombies.MilitantZombie;
import io.github.greatericontop.thedark.enemy.zombies.StandardZombie;
import io.github.greatericontop.thedark.rounds.operation.BaseOperation;
import io.github.greatericontop.thedark.rounds.operation.RoundOperationHelper;

public class Data1To10 {

    // The first 10 are intended to be intro rounds.
    // They should not be very difficult.

    public static final BaseOperation[] R1 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 10, 30, false)
    .getOutput();

    public static final BaseOperation[] R2 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 15, 40, false)
    .getOutput();

    public static final BaseOperation[] R3 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 15, 40, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(StandardZombie.class, 5, 40, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(EmeraldVindicator.class, 1, 1, false) // Vindicator
    .getOutput();

    public static final BaseOperation[] R4 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 10, 40, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(StandardZombie.class, 10, 40, false)
    .getOutput();

    public static final BaseOperation[] R5 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(StandardZombie.class, 20, 40, false)
            .delaySeconds(1)
            .addSpawnOneAtATime(BasicZombie.class, 5, 40, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(EmeraldVindicator.class, 1, 1, false) // Vindicator
    .getOutput();

    public static final BaseOperation[] R6 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 20, 1, false)
    .getOutput();

    public static final BaseOperation[] R7 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(StandardZombie.class, 15, 10, true)
            .addSpawnOneAtATime(BasicZombie.class, 15, 10, false)
            .delaySeconds(20)
            .addSpawnOneAtATime(EmeraldVindicator.class, 1, 1, false) // Vindicator
    .getOutput();

    public static final BaseOperation[] R8 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(MilitantZombie.class, 5, 40, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(EmeraldVindicator.class, 1, 1, false) // Vindicator
    .getOutput();

    public static final BaseOperation[] R9 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 10, 20, false)
            .delaySeconds(4)
            .addSpawnOneAtATime(StandardZombie.class, 10, 20, false)
            .delaySeconds(4)
            .addSpawnOneAtATime(MilitantZombie.class, 10, 60, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(EmeraldVindicator.class, 1, 1, false) // Vindicator
    .getOutput();

    public static final BaseOperation[] R10 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(MilitantZombie.class, 3, 1, true)
            .addSpawnOneAtATime(EmeraldVindicator.class, 3, 1, false) // Vindicator x3
    .getOutput();


}
