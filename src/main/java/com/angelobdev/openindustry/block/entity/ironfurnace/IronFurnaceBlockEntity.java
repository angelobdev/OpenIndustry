package com.angelobdev.openindustry.block.entity.ironfurnace;

import com.angelobdev.openindustry.block.entity.OIBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class IronFurnaceBlockEntity extends AbstractFurnaceBlockEntity {

    public IronFurnaceBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(OIBlockEntities.IRON_FURNACE.get(), blockPos, blockState, RecipeType.SMELTING);
    }

    protected @NotNull Component getDefaultName() {
        return Component.literal("Iron Furnace");
    }

    protected @NotNull AbstractContainerMenu createMenu(int id, @NotNull Inventory inventory) {
        return new IronFurnaceMenu(id, inventory, this, this.dataAccess);
    }

    @Override
    protected int getBurnDuration(@NotNull ItemStack itemStack) {
        return (super.getBurnDuration(itemStack) * 3) / 2;
    }


}