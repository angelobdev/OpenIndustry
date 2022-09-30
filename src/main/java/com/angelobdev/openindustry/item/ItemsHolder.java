package com.angelobdev.openindustry.item;

import com.angelobdev.openindustry.OpenIndustry;
import com.angelobdev.openindustry.item.armor.OIArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
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

    //Armor
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register(
            "copper_helmet",
            () -> new ArmorItem(
                    OIArmorMaterials.COPPER,
                    EquipmentSlot.HEAD,
                    new Item.Properties().tab(OICreativeModTab.OI_TAB)
            )
    );

    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register(
            "copper_chestplate",
            () -> new ArmorItem(
                    OIArmorMaterials.COPPER,
                    EquipmentSlot.CHEST,
                    new Item.Properties().tab(OICreativeModTab.OI_TAB)
            )
    );

    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register(
            "copper_leggings",
            () -> new ArmorItem(
                    OIArmorMaterials.COPPER,
                    EquipmentSlot.LEGS,
                    new Item.Properties().tab(OICreativeModTab.OI_TAB)
            )
    );

    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register(
            "copper_boots",
            () -> new ArmorItem(
                    OIArmorMaterials.COPPER,
                    EquipmentSlot.FEET,
                    new Item.Properties().tab(OICreativeModTab.OI_TAB)
            )
    );

    // Register function
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
