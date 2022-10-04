package com.angelobdev.openindustry.world.feature.tree;

import com.angelobdev.openindustry.world.feature.OIConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class RubberTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(@NotNull RandomSource p_222910_, boolean p_222911_) {
        Optional<Holder<ConfiguredFeature<?, ?>>> holder = OIConfiguredFeatures.RUBBER_TREE.getHolder();
        return holder.orElse(null);
    }
}
