package com.jib.jibsfarrierdecor.block;

import com.jib.jibsfarrierdecor.JibsFarrierDecor;
import com.jib.jibsfarrierdecor.block.custom.hoofjacks.BrownHoofJack;
import com.jib.jibsfarrierdecor.item.ModCreativeModeTab;
import com.jib.jibsfarrierdecor.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JibsFarrierDecor.MOD_ID);

    public static final RegistryObject<Block> BROWN_HOOFJACK = registerblock("brown_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);




    private static <T extends Block> RegistryObject<T> registerblock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
