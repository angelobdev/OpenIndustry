package com.angelobdev.openindustry.item;

import com.angelobdev.openindustry.OpenIndustry;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class ItemsHolder {

    // Item Registry
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpenIndustry.MODID);

    // Items
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register(
            "copper_ingot",
            () -> new Item(
                    new Item.Properties()
                            .tab(OICreativeModTab.OI_TAB)
            )
    );

    // Register function
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
