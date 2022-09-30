package com.angelobdev.openindustry.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class OICreativeModTab {
    public static final CreativeModeTab OI_TAB = new CreativeModeTab("open_industry_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ItemsHolder.COPPER_INGOT.get());
        }
    };
}
