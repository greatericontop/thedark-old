package io.github.greatericontop.thedark.rounds.data;

import io.github.greatericontop.thedark.rounds.operation.BaseOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoundDataUtil {

    // This transforms an array of :BaseOperation: into a mutable list that then can be messed with during the round
    public static List<BaseOperation> mutableList(BaseOperation... elements) {
        // This lets you delete items unlike :List.of: or :Arrays.asList:
        List<BaseOperation> operations = new ArrayList<>(elements.length);
        operations.addAll(Arrays.asList(elements));
        return operations;
    }

}
