package com.angelobdev.openindustry.block;

import com.angelobdev.openindustry.OpenIndustry;
import com.angelobdev.openindustry.item.ItemsHolder;
import com.angelobdev.openindustry.item.custom.OIFlammableRotatedPillarBlock;
import com.angelobdev.openindustry.world.feature.tree.RubberTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.angelobdev.openindustry.item.ItemsHolder.OI_TAB;
import static net.minecraft.world.level.block.Blocks.*;

@SuppressWarnings("unused")
public final class BlocksHolder {

    // Blocks Registry
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OpenIndustry.MODID);

    // region COPPER
    public static final RegistryObject<Block> COPPER_ORE = BlocksHolder.registerBlock(
            "copper_ore",
            () -> new Block(
                    BlockBehaviour.Properties
                            .of(Material.STONE)
                            .strength(3f)
                            .requiresCorrectToolForDrops()
            ),
            OI_TAB
    );

    public static final RegistryObject<Block> COPPER_BLOCK = BlocksHolder.registerBlock(
            "copper_block",
            () -> new Block(
                    BlockBehaviour.Properties
                            .of(Material.METAL)
                            .strength(5f)
            ),
            OI_TAB
    );

    //endregion

    //region RUBBER TREE

    public static final RegistryObject<Block> RUBBER_LOG = registerBlock(
            "rubber_log",
            () -> new OIFlammableRotatedPillarBlock(
                    BlockBehaviour.Properties.copy(OAK_LOG)
                            .requiresCorrectToolForDrops()
            ),
            OI_TAB
    );

    public static final RegistryObject<Block> RUBBER_WOOD = registerBlock(
            "rubber_wood",
            () -> new OIFlammableRotatedPillarBlock(
                    BlockBehaviour.Properties.copy(OAK_WOOD)
                            .requiresCorrectToolForDrops()
            ),
            OI_TAB
    );

    public static final RegistryObject<Block> STRIPPED_RUBBER_LOG = registerBlock(
            "stripped_rubber_log",
            () -> new OIFlammableRotatedPillarBlock(
                    BlockBehaviour.Properties.copy(STRIPPED_OAK_LOG)
                            .requiresCorrectToolForDrops()
            ),
            OI_TAB
    );

    public static final RegistryObject<Block> STRIPPED_RUBBER_WOOD = registerBlock(
            "stripped_rubber_wood",
            () -> new OIFlammableRotatedPillarBlock(
                    BlockBehaviour.Properties.copy(STRIPPED_OAK_WOOD)
                            .requiresCorrectToolForDrops()
            ),
            OI_TAB
    );

    public static final RegistryObject<Block> RUBBER_PLANKS = registerBlock(
            "rubber_planks",
            () -> new Block(
                    BlockBehaviour.Properties.copy(OAK_PLANKS)
                            .requiresCorrectToolForDrops()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            },
            OI_TAB
    );

    public static final RegistryObject<Block> RUBBER_LEAVES = registerBlock(
            "rubber_leaves",
            () -> new LeavesBlock(
                    BlockBehaviour.Properties.copy(OAK_LEAVES)
                            .requiresCorrectToolForDrops()
            ) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            },
            OI_TAB
    );

    public static final RegistryObject<Block> RUBBER_SAPLING = registerBlock(
            "rubber_sapling",
            () -> new SaplingBlock(
                    new RubberTreeGrower(),
                    BlockBehaviour.Properties.copy(OAK_SAPLING)
            ),
            OI_TAB
    );


    //endregion

    // Register Functions
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, Supplier<T> block, CreativeModeTab tab) {
        ItemsHolder.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
}
