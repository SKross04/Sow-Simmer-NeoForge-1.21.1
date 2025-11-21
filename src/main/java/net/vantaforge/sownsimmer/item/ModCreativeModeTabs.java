package net.vantaforge.sownsimmer.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vantaforge.sownsimmer.SowNSimmer;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SowNSimmer.MOD_ID);


    public static final Supplier<CreativeModeTab> SOWNSIMMER_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("sownsimmer_item_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.sownsimmer.sownsimmer_item_tab"))
                    .icon(() -> new ItemStack(ModItems.ONION.get()))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ONION);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
