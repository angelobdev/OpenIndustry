package com.angelobdev.openindustry.block.entity;

import com.angelobdev.openindustry.OpenIndustry;
import com.angelobdev.openindustry.block.entity.ironfurnace.IronFurnaceMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class OIMenuType {

    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, OpenIndustry.MODID);

    public static final RegistryObject<MenuType<IronFurnaceMenu>> IRON_FURNACE_MENU = registerMenuType(
            (ID, inventory, extraData) -> new IronFurnaceMenu(ID, inventory),
            "iron_furnace_menu"
    );

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }

}
