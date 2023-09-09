package io.github.greatericontop.thedark.rounds.data;

import io.github.greatericontop.thedark.enemy.other.EmeraldVindicator;
import io.github.greatericontop.thedark.enemy.other.FatDebugZombie;
import io.github.greatericontop.thedark.enemy.zombies.BasicZombie;
import io.github.greatericontop.thedark.enemy.zombies.MilitantZombie;
import io.github.greatericontop.thedark.enemy.zombies.StandardZombie;
import io.github.greatericontop.thedark.enemy.zombies.ZombieVillager;
import io.github.greatericontop.thedark.rounds.operation.BaseOperation;
import io.github.greatericontop.thedark.rounds.operation.RoundOperationHelper;

public class Data1To15 {

    // The first 10 are intended to be intro rounds.
    // They should not be very difficult.

    public static final BaseOperation[] R1 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 6, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 8, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 10, 40, false)
    .getOutput();

    public static final BaseOperation[] R2 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 6, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 8, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 8, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 10, 40, false)
    .getOutput();

    public static final BaseOperation[] R3 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 8, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 10, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 12, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 14, 40, false)
    .getOutput();

    public static final BaseOperation[] R4 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 10, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 12, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 14, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 16, 40, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(EmeraldVindicator.class, 1, 1, false)
    .getOutput();

    public static final BaseOperation[] R5 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 10, 40, true)
            .addSpawnOneAtATime(StandardZombie.class, 10, 60, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(StandardZombie.class, 12, 40, false)
    .getOutput();

    public static final BaseOperation[] R6 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 10, 40, true)
            .addSpawnOneAtATime(StandardZombie.class, 10, 60, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(BasicZombie.class, 10, 40, true)
            .addSpawnOneAtATime(StandardZombie.class, 10, 60, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(StandardZombie.class, 12, 40, false)
    .getOutput();

    public static final BaseOperation[] R7 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 10, 40, true)
            .addSpawnOneAtATime(StandardZombie.class, 10, 40, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(BasicZombie.class, 10, 40, true)
            .addSpawnOneAtATime(StandardZombie.class, 10, 40, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(StandardZombie.class, 30, 40, false)
    .getOutput();

    public static final BaseOperation[] R8 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(MilitantZombie.class, 12, 5, true)
            .delaySeconds(10)
            .addSpawnOneAtATime(StandardZombie.class, 20, 40, false)
    .getOutput();

    public static final BaseOperation[] R9 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(MilitantZombie.class, 12, 75, true)
            .addSpawnOneAtATime(StandardZombie.class, 36, 25, false)
    .getOutput();

    public static final BaseOperation[] R10 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(ZombieVillager.class, 25, 40, true)
            .addSpawnOneAtATime(MilitantZombie.class, 10, 80, true)
            .addSpawnOneAtATime(StandardZombie.class, 25, 40, false)
    .getOutput();

    public static final BaseOperation[] R11 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(ZombieVillager.class, 35, 20, true)
            .addSpawnOneAtATime(StandardZombie.class, 10, 60, false)
    .getOutput();

    public static final BaseOperation[] R12 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(ZombieVillager.class, 20, 40, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(MilitantZombie.class, 10, 40, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(MilitantZombie.class, 10, 60, true)
            .addSpawnOneAtATime(StandardZombie.class, 15, 40, false)
    .getOutput();

    public static final BaseOperation[] R13 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(ZombieVillager.class, 20, 40, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(MilitantZombie.class, 15, 30, false)
            .delaySeconds(12)
            .addSpawnOneAtATime(MilitantZombie.class, 15, 60, true)
            .addSpawnOneAtATime(StandardZombie.class, 20, 41, true)
            .addSpawnOneAtATime(BasicZombie.class, 20, 42, false)
    .getOutput();

    public static final BaseOperation[] R14 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(ZombieVillager.class, 25, 40, true)
            .addSpawnOneAtATime(MilitantZombie.class, 25, 41, true)
            .addSpawnOneAtATime(StandardZombie.class, 25, 42, true)
            .addSpawnOneAtATime(BasicZombie.class, 25, 43, false)
    .getOutput();

    public static final BaseOperation[] R15 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(FatDebugZombie.class, 1, 1, true)
            .addSpawnOneAtATime(MilitantZombie.class, 30, 120, false)
    .getOutput();


}
