package net.vantaforge.sownsimmer.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vantaforge.sownsimmer.SowNSimmer;

public class ModItems {
    public static final DeferredRegister.Items  ITEMS = DeferredRegister.createItems(SowNSimmer.MOD_ID);

    public static final DeferredItem<Item> ONION = ITEMS.registerSimpleItem("onion");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
