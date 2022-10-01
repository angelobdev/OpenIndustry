package com.angelobdev.openindustry.world.feature;

import com.angelobdev.openindustry.OpenIndustry;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.NoSuchElementException;

import static com.angelobdev.openindustry.OpenIndustry.LOGGER;

public class OIPlacedFeatures {

    //Registry
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, OpenIndustry.MODID);

    //region COPPER ORE
    public static RegistryObject<PlacedFeature> COPPER_ORE_PLACED = null;
    static {
        try {
            COPPER_ORE_PLACED = PLACED_FEATURES.register(
                    "copper_ore_placed",
                    () -> new PlacedFeature(
                            OIConfiguredFeatures.COPPER_ORE.getHolder().get(),
                            commonOrePlacement(
                                    7, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80))
                            )
                    )
            );
        } catch (NoSuchElementException e) {
            LOGGER.error(e.getMessage());
        }
    }
    //endregionOR

    //Functions
    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }

}
