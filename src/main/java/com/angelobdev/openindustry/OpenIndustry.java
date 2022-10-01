package com.angelobdev.openindustry;

import com.angelobdev.openindustry.block.BlocksHolder;
import com.angelobdev.openindustry.item.ItemsHolder;
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

        // Register OpenIndustry customs
        BlocksHolder.register(modEventBus);
        ItemsHolder.register(modEventBus);

        OIConfiguredFeatures.register(modEventBus);
        OIPlacedFeatures.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

        LOGGER.info("Welcome to OpenIndustry for Minecraft 1.19.2!");

    }

//    //You can use SubscribeEvent and let the Event Bus discover methods to call
//    @SubscribeEvent
//    public void onServerStarting(ServerStartingEvent event) {
//        // Do something when the server starts
//        LOGGER.info("Welcome to OpenIndustry for Minecraft Server 1.19.2!");
//    }
//
//    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
//    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
//    public static class ClientModEvents {
//        @SubscribeEvent
//        public static void onClientSetup(FMLClientSetupEvent event) {
//            // Some client setup code
//            LOGGER.info("HELLO FROM CLIENT SETUP");
//            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
//        }
//    }
}
