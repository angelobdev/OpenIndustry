package com.angelobdev.openindustry;

import com.angelobdev.openindustry.block.BlocksHolder;
import com.angelobdev.openindustry.item.ItemsHolder;
import com.angelobdev.openindustry.world.feature.OIConfiguredFeatures;
import com.angelobdev.openindustry.world.feature.OIPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(OpenIndustry.MODID)
public class OpenIndustry {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "open_industry";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OpenIndustry() {
        // Register the commonSetup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        // OpenIndustry custom registries
        BlocksHolder.register(modEventBus); // Blocks container
        ItemsHolder.register(modEventBus); // Items container

        OIConfiguredFeatures.register(modEventBus);
        OIPlacedFeatures.register(modEventBus); // Ore Spawning

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Welcome to OpenIndustry for Minecraft 1.19.2!");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        //ItemBlockRenderTypes.setRenderLayer(BlocksHolder.RUBBER_LEAVES_BLOCK.get(), RenderType.cutout());
        //ItemBlockRenderTypes.setRenderLayer(BlocksHolder.RUBBER_SAPLING.get(), RenderType.cutout());
    }

}
