package chaos.unity.railroad_crossing.core;

import chaos.unity.railroad_crossing.core.common.item.RailroadCrossingItems;
import net.fabricmc.api.ModInitializer;

public class RailroadCrossingCore implements ModInitializer {
    @Override
    public void onInitialize() {
        RailroadCrossingItems.register();
    }
}
