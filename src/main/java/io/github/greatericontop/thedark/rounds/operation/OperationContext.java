package io.github.greatericontop.thedark.rounds.operation;

import io.github.greatericontop.thedark.TheDark;
import org.bukkit.Location;

import java.util.List;

public record OperationContext(TheDark plugin, Location location, List<BaseOperation> operations) {
}
