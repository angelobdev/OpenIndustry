package com.angelobdev.openindustry.block.entity;

import com.angelobdev.openindustry.OpenIndustry;
import com.angelobdev.openindustry.block.OIBlocks;
import com.angelobdev.openindustry.block.entity.ironfurnace.IronFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class OIBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, OpenIndustry.MODID);

    public static final RegistryObject<BlockEntityType<IronFurnaceBlockEntity>> IRON_FURNACE = BLOCK_ENTITIES.register(
            "iron_furnace",
            () -> BlockEntityType.Builder.of(
                    IronFurnaceBlockEntity::new,
                    OIBlocks.IRON_FURNACE.get()
            ).build(null)
    );

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
