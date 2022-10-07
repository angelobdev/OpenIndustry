package com.angelobdev.openindustry.block.entity.ironfurnace;

import com.angelobdev.openindustry.block.entity.OIMenuType;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.item.crafting.RecipeType;

public class IronFurnaceMenu extends AbstractFurnaceMenu {

    public IronFurnaceMenu(int ID, Inventory inventory) {
        this(ID, inventory, new SimpleContainer(3), new SimpleContainerData(4));
    }

    public IronFurnaceMenu(int ID, Inventory inventory, Container container, ContainerData data) {
        super(OIMenuType.IRON_FURNACE_MENU.get(), RecipeType.SMELTING, RecipeBookType.FURNACE, ID, inventory, container, data);
    }
}
