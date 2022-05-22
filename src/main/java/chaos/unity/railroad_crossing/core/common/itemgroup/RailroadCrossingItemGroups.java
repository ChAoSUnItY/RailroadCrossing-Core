package chaos.unity.railroad_crossing.core.common.itemgroup;

import chaos.unity.railroad_crossing.core.common.item.RailroadCrossingItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public final class RailroadCrossingItemGroups {
    public static final ItemGroup RAILROAD_CROSSING_CORE = FabricItemGroupBuilder.build(new Identifier("rc_core", "common"), () -> new ItemStack(RailroadCrossingItems.EMITTER_CIRCUIT_ITEM));
}
