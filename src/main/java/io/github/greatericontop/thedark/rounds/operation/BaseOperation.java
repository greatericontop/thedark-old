package io.github.greatericontop.thedark.rounds.operation;

public abstract class BaseOperation {

    // Some constructor here
    // This will initialize config stuff (e.g., what enemies to spawn, how many, how long to delay)
    // Other info will be passed in to :execute: when it is called

    // Note: you should be able to execute this method multiple times.
    public abstract void execute(OperationContext ctx);

    protected void executeNext(OperationContext ctx) {
        // Remove the last operation (which should be this instance) from :ctx.operations:, and then execute the
        // last one that remains. (This usually shouldn't cause a stack overflow because bukkit scheduler.)
        ctx.operations().remove(ctx.operations().size() - 1);
        ctx.operations().get(ctx.operations().size() - 1).execute(ctx);
    }

}
