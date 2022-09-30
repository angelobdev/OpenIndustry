package com.angelobdev.openindustry.block;

import com.angelobdev.openindustry.OpenIndustry;
import com.angelobdev.openindustry.item.ItemsHolder;
import com.angelobdev.openindustry.item.OICreativeModTab;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public final class BlocksHolder {

    // Blocks Registry
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OpenIndustry.MODID);

    // Blocks
    public static final RegistryObject<Block> COPPER_ORE = registerBlock(
            "copper_ore",
            () -> new OreBlock(
                    BlockBehaviour.Properties
                            .of(Material.STONE)
                            .strength(3f),
                    UniformInt.of(3, 7)
            ),
            OICreativeModTab.OI_TAB
    );

    public static final RegistryObject<Block> COPPER_BLOCK = registerBlock(
            "copper_block",
            () -> new Block(
                    BlockBehaviour.Properties
                            .of(Material.METAL)
                            .strength(5f)
            ),
            OICreativeModTab.OI_TAB
    );

    // Register Function
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, Supplier<T> block, CreativeModeTab tab){
        ItemsHolder.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
}