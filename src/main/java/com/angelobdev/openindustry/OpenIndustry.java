package com.angelobdev.openindustry;

import com.angelobdev.openindustry.block.OIBlocks;
import com.angelobdev.openindustry.block.entity.OIBlockEntities;
import com.angelobdev.openindustry.block.entity.OIMenuType;
import com.angelobdev.openindustry.block.entity.ironfurnace.IronFurnaceScreen;
import com.angelobdev.openindustry.item.OIItems;
import com.angelobdev.openindustry.world.feature.OIConfiguredFeatures;
import com.angelobdev.openindustry.world.feature.OIPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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

        // OpenIndustry custom registries
        OIBlocks.register(modEventBus); // Blocks container
        OIItems.register(modEventBus); // Items container

        OIBlockEntities.register(modEventBus);
        OIMenuType.register(modEventBus);

        // OI Features registries
        OIConfiguredFeatures.register(modEventBus);
        OIPlacedFeatures.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Welcome to OpenIndustry for Minecraft 1.19.2!");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
            MenuScreens.register(OIMenuType.IRON_FURNACE_MENU.get(), IronFurnaceScreen::new);
        }
    }

}
