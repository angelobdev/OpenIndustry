package com.angelobdev.openindustry.block.entity.ironfurnace;

import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.SmeltingRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class IronFurnaceScreen extends AbstractFurnaceScreen<IronFurnaceMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/furnace.png");

    public IronFurnaceScreen(IronFurnaceMenu menu, Inventory inventory, Component component) {
        super(menu, new SmeltingRecipeBookComponent(), inventory, component, TEXTURE);
    }

    @Override
    public void init() {
        super.init();
    }
}