package io.github.greatericontop.thedark.rounds.data;

import io.github.greatericontop.thedark.enemy.BasicZombie;
import io.github.greatericontop.thedark.enemy.StandardZombie;
import io.github.greatericontop.thedark.rounds.operation.BaseOperation;
import io.github.greatericontop.thedark.rounds.operation.Delay;
import io.github.greatericontop.thedark.rounds.operation.SpawnOneAtATime;

public class Data1To10 {

    // TODO: instead of executing these one at a time, maybe just execute them all (with an offset)

    public static final BaseOperation[] R1 = {
            new SpawnOneAtATime(BasicZombie.class, 6, 40, true),
            new Delay(8),
            new SpawnOneAtATime(BasicZombie.class, 8, 40, true),
            new Delay(8),
            new SpawnOneAtATime(BasicZombie.class, 10, 40, true),
    };

    public static final BaseOperation[] R2 = {
            new SpawnOneAtATime(BasicZombie.class, 6, 30, true),
            new Delay(8),
            new SpawnOneAtATime(BasicZombie.class, 8, 30, true),
            new Delay(8),
            new SpawnOneAtATime(BasicZombie.class, 10, 30, true),
    };

    public static final BaseOperation[] R3 = {
            new SpawnOneAtATime(BasicZombie.class, 8, 30, true),
            new Delay(8),
            new SpawnOneAtATime(BasicZombie.class, 10, 30, true),
            new Delay(8),
            new SpawnOneAtATime(BasicZombie.class, 12, 30, true),
    };

    public static final BaseOperation[] R4 = {
            new SpawnOneAtATime(BasicZombie.class, 8, 30, true),
            new Delay(8),
            new SpawnOneAtATime(BasicZombie.class, 10, 30, true),
            new Delay(8),
            new SpawnOneAtATime(StandardZombie.class, 10, 40, true),
    };


}
