package io.github.greatericontop.thedark.rounds.data;

import io.github.greatericontop.thedark.enemy.BasicZombie;
import io.github.greatericontop.thedark.rounds.operation.BaseOperation;
import io.github.greatericontop.thedark.rounds.operation.RoundOperationHelper;

public class Data1To10 {

    public static final BaseOperation[] R1 = new RoundOperationHelper(4 * 20)
            .addSpawnOneAtATime(BasicZombie.class, 6, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 8, 40, false)
            .delaySeconds(8)
            .addSpawnOneAtATime(BasicZombie.class, 10, 40, false)
    .getOutput();

//    public static final BaseOperation[] R2 = {
//            new SpawnOneAtATime(BasicZombie.class, 6, 30, true),
//            new Delay(8),
//            new SpawnOneAtATime(BasicZombie.class, 8, 30, true),
//            new Delay(8),
//            new SpawnOneAtATime(BasicZombie.class, 10, 30, true),
//    };
//
//    public static final BaseOperation[] R3 = {
//            new SpawnOneAtATime(BasicZombie.class, 8, 30, true),
//            new Delay(8),
//            new SpawnOneAtATime(BasicZombie.class, 10, 30, true),
//            new Delay(8),
//            new SpawnOneAtATime(BasicZombie.class, 12, 30, true),
//    };
//
//    public static final BaseOperation[] R4 = {
//            new SpawnOneAtATime(BasicZombie.class, 8, 30, true),
//            new Delay(8),
//            new SpawnOneAtATime(BasicZombie.class, 10, 30, true),
//            new Delay(8),
//            new SpawnOneAtATime(StandardZombie.class, 10, 40, true),
//    };


}
