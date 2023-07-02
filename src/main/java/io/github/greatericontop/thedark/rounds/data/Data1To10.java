package io.github.greatericontop.thedark.rounds.data;

import io.github.greatericontop.thedark.enemy.BasicZombie;
import io.github.greatericontop.thedark.rounds.operation.BaseOperation;
import io.github.greatericontop.thedark.rounds.operation.SpawnOneAtATime;

public class Data1To10 {

    public static final BaseOperation[] R1 = {
            // 4s ---> 16s (technically 10.05 because there's no start/end delay but nobody cares)
            new SpawnOneAtATime(4.0, BasicZombie.class, 6, 40),
            // (8s delay) 24s ---> 40s
            new SpawnOneAtATime(24.0, BasicZombie.class, 8, 40),
            // (8s delay) 48s ---> 68s
            new SpawnOneAtATime(48.0, BasicZombie.class, 10, 40),
    };

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
