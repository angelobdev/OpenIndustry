package com.angelobdev.openindustry.world.feature;

import com.angelobdev.openindustry.OpenIndustry;
import com.angelobdev.openindustry.block.BlocksHolder;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class OIConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, OpenIndustry.MODID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_COPPER_ORE = Suppliers.memoize(
            () -> List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlocksHolder.COPPER_ORE.get().defaultBlockState())
            )
    );

    public static final RegistryObject<ConfiguredFeature<?, ?>> COPPER_ORE = CONFIGURED_FEATURES.register(
            "copper_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_COPPER_ORE.get(), 7)) // 7 is the vein-size
    );

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }

}
