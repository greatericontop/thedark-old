package io.github.greatericontop.thedark.rounds;

import io.github.greatericontop.thedark.rounds.data.RoundData;
import io.github.greatericontop.thedark.rounds.operation.BaseOperation;
import io.github.greatericontop.thedark.rounds.operation.OperationContext;

public class RoundUtil {

    public static void executeRound(OperationContext ctx, int roundNumber) {
        for (BaseOperation operation : RoundData.ROUNDS[roundNumber]) {
            operation.execute(ctx);
        }
    }

}
