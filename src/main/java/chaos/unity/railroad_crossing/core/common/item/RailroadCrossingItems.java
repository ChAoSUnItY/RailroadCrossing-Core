package chaos.unity.railroad_crossing.core.common.item;

import chaos.unity.railroad_crossing.core.common.itemgroup.RailroadCrossingItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public final class RailroadCrossingItems {
    public static final Item EMITTER_CIRCUIT_ITEM = simple();
    public static final Item RECEIVER_CIRCUIT_ITEM = simple();

    public static void register() {
        register(EMITTER_CIRCUIT_ITEM, "emitter_circuit");
        register(RECEIVER_CIRCUIT_ITEM, "receiver_circuit");
    }

    private static Item simple() {
        return new Item(new FabricItemSettings().group(RailroadCrossingItemGroups.RAILROAD_CROSSING_CORE));
    }

    private static <T extends Item> void register(T item, String name) {
        Registry.register(Registry.ITEM, new Identifier("rc_core", name), item);
    }
}
