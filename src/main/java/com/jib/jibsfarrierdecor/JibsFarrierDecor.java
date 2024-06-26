package com.jib.jibsfarrierdecor;

import com.jib.jibsfarrierdecor.block.ModBlocks;
import com.jib.jibsfarrierdecor.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JibsFarrierDecor.MOD_ID)
public class JibsFarrierDecor
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "jfd";

    public JibsFarrierDecor() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }



    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_HOOFJACK.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_HOOFJACK.get(), RenderType.solid());
    }




    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}