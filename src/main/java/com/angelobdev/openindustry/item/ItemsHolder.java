package com.angelobdev.openindustry.item;

import com.angelobdev.openindustry.OpenIndustry;
import com.angelobdev.openindustry.item.custom.OIArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import static com.angelobdev.openindustry.item.custom.OITier.COPPER_TIER;

@SuppressWarnings("unused")
public final class ItemsHolder {

    // Item Registry
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpenIndustry.MODID);

    //Creative Mod Tab
    public static final CreativeModeTab OI_TAB = new CreativeModeTab("open_industry_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(COPPER_INGOT.get());
        }
    };

    //region COPPER ITEMS
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register(
            "copper_ingot",
            () -> new Item(
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register(
            "copper_helmet",
            () -> new ArmorItem(
                    OIArmorMaterials.COPPER,
                    EquipmentSlot.HEAD,
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register(
            "copper_chestplate",
            () -> new ArmorItem(
                    OIArmorMaterials.COPPER,
                    EquipmentSlot.CHEST,
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register(
            "copper_leggings",
            () -> new ArmorItem(
                    OIArmorMaterials.COPPER,
                    EquipmentSlot.LEGS,
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register(
            "copper_boots",
            () -> new ArmorItem(
                    OIArmorMaterials.COPPER,
                    EquipmentSlot.FEET,
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register(
            "copper_sword",
            () -> new SwordItem(
                    COPPER_TIER,
                    5, //Attack Damage
                    5f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register(
            "copper_pickaxe",
            () -> new PickaxeItem(
                    COPPER_TIER,
                    3, //Attack Damage
                    3f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register(
            "copper_axe",
            () -> new AxeItem(
                    COPPER_TIER,
                    4, //Attack Damage
                    3f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register(
            "copper_shovel",
            () -> new ShovelItem(
                    COPPER_TIER,
                    2, //Attack Damage
                    2f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register(
            "copper_hoe",
            () -> new HoeItem(
                    COPPER_TIER,
                    2, //Attack Damage
                    2.5f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    //endregion (COPPER ITEMS)

    // Register function
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
