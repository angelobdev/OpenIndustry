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

import static com.angelobdev.openindustry.item.custom.OITier.*;

@SuppressWarnings("unused")
public final class OIItems {

    // Item Registry
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpenIndustry.MODID);

    //Creative Mod Tab
    public static final CreativeModeTab OI_TAB = new CreativeModeTab("open_industry_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(OIItems.RAW_RUBBER.get());
        }
    };

    //region INGOTS
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register(
            "copper_ingot",
            () -> new Item(
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register(
            "silver_ingot",
            () -> new Item(
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register(
            "iridium_ingot",
            () -> new Item(
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    //endregion

    //region COPPER ARMOR AND TOOLS
    public static final RegistryObject<Item> RAW_COPPER = ITEMS.register(
            "raw_copper",
            () -> new Item(
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register(
            "copper_nugget",
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

    //region SILVER ARMOR AND TOOLS
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register(
            "raw_silver",
            () -> new Item(
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register(
            "silver_nugget",
            () -> new Item(
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register(
            "silver_helmet",
            () -> new ArmorItem(
                    OIArmorMaterials.SILVER,
                    EquipmentSlot.HEAD,
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register(
            "silver_chestplate",
            () -> new ArmorItem(
                    OIArmorMaterials.SILVER,
                    EquipmentSlot.CHEST,
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register(
            "silver_leggings",
            () -> new ArmorItem(
                    OIArmorMaterials.SILVER,
                    EquipmentSlot.LEGS,
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register(
            "silver_boots",
            () -> new ArmorItem(
                    OIArmorMaterials.SILVER,
                    EquipmentSlot.FEET,
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register(
            "silver_sword",
            () -> new SwordItem(
                    SILVER_TIER,
                    6, //Attack Damage
                    5.2f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register(
            "silver_pickaxe",
            () -> new PickaxeItem(
                    SILVER_TIER,
                    4, //Attack Damage
                    3.2f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register(
            "silver_axe",
            () -> new AxeItem(
                    SILVER_TIER,
                    5, //Attack Damage
                    3.2f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register(
            "silver_shovel",
            () -> new ShovelItem(
                    SILVER_TIER,
                    3, //Attack Damage
                    2.2f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register(
            "silver_hoe",
            () -> new HoeItem(
                    SILVER_TIER,
                    3, //Attack Damage
                    2.8f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    //endregion (COPPER ITEMS)

    //region IRIDIUM ARMOR AND TOOLS
    public static final RegistryObject<Item> RAW_IRIDIUM = ITEMS.register(
            "raw_iridium",
            () -> new Item(
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register(
            "iridium_nugget",
            () -> new Item(
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> IRIDIUM = ITEMS.register(
            "iridium_helmet",
            () -> new ArmorItem(
                    OIArmorMaterials.IRIDIUM,
                    EquipmentSlot.HEAD,
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> IRIDIUM_CHESTPLATE = ITEMS.register(
            "iridium_chestplate",
            () -> new ArmorItem(
                    OIArmorMaterials.IRIDIUM,
                    EquipmentSlot.CHEST,
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> IRIDIUM_LEGGINGS = ITEMS.register(
            "iridium_leggings",
            () -> new ArmorItem(
                    OIArmorMaterials.IRIDIUM,
                    EquipmentSlot.LEGS,
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> IRIDIUM_BOOTS = ITEMS.register(
            "iridium_boots",
            () -> new ArmorItem(
                    OIArmorMaterials.IRIDIUM,
                    EquipmentSlot.FEET,
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> IRIDIUM_SWORD = ITEMS.register(
            "iridium_sword",
            () -> new SwordItem(
                    IRIDIUM_TIER,
                    5, //Attack Damage
                    5f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> IRIDIUM_PICKAXE = ITEMS.register(
            "iridium_pickaxe",
            () -> new PickaxeItem(
                    IRIDIUM_TIER,
                    3, //Attack Damage
                    3f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> IRIDIUM_AXE = ITEMS.register(
            "iridium_axe",
            () -> new AxeItem(
                    IRIDIUM_TIER,
                    4, //Attack Damage
                    3f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> IRIDIUM_SHOVEL = ITEMS.register(
            "iridium_shovel",
            () -> new ShovelItem(
                    IRIDIUM_TIER,
                    2, //Attack Damage
                    2f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> IRIDIUM_HOE = ITEMS.register(
            "iridium_hoe",
            () -> new HoeItem(
                    IRIDIUM_TIER,
                    2, //Attack Damage
                    2.5f, //Attack Speed
                    new Item.Properties()
                            .stacksTo(1)
                            .tab(OI_TAB)
            )
    );

    //endregion

    //region RUBBER
    public static final RegistryObject<Item> RAW_RUBBER = ITEMS.register(
            "raw_rubber",
            () -> new Item(
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );

    public static final RegistryObject<Item> COOKED_RUBBER = ITEMS.register(
            "cooked_rubber",
            () -> new Item(
                    new Item.Properties()
                            .tab(OI_TAB)
            )
    );
    //endregion

    // Register function
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
