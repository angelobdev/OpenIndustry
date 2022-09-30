package com.angelobdev.openindustry.block;

import com.angelobdev.openindustry.OpenIndustry;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

@SuppressWarnings("unused")
public class OreBlock extends Block {

    private final UniformInt xpRange;
    private boolean broken = false;

    public OreBlock(Properties blockProperties) {
        this(blockProperties, UniformInt.of(0, 0));
    }

    public OreBlock(Properties blockProperties, UniformInt xpRange){
        super(blockProperties);
        this.xpRange = xpRange;
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        OpenIndustry.LOGGER.info("DESTROYED");
        broken = true;
        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader level, RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
        return broken ? 0 : this.xpRange.sample(randomSource);
    }
}
