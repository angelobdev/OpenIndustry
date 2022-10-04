package com.angelobdev.openindustry;

import com.angelobdev.openindustry.block.OIBlocks;
import com.angelobdev.openindustry.item.OIItems;
import com.angelobdev.openindustry.world.feature.OIConfiguredFeatures;
import com.angelobdev.openindustry.world.feature.OIPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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

        // OpenIndustry custom registries
        OIBlocks.register(modEventBus); // Blocks container
        OIItems.register(modEventBus); // Items container

        // OI Features registries
        OIConfiguredFeatures.register(modEventBus);
        OIPlacedFeatures.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Welcome to OpenIndustry for Minecraft 1.19.2!");
    }

}
