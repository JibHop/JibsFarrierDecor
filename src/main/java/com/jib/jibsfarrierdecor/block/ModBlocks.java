package com.jib.jibsfarrierdecor.block;

import com.jib.jibsfarrierdecor.JibsFarrierDecor;
import com.jib.jibsfarrierdecor.block.custom.FarrierstableBlock;
import com.jib.jibsfarrierdecor.block.custom.GreenFarrierstableBlock;
import com.jib.jibsfarrierdecor.block.custom.hoofjacks.BrownHoofJack;
import com.jib.jibsfarrierdecor.item.ModCreativeModeTab;
import com.jib.jibsfarrierdecor.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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

    public static final RegistryObject<Block> RED_HOOFJACK = registerblock("red_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> ORANGE_HOOFJACK = registerblock("orange_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> YELLOW_HOOFJACK = registerblock("yellow_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> LIME_HOOFJACK = registerblock("lime_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> GREEN_HOOFJACK = registerblock("green_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> CYAN_HOOFJACK = registerblock("cyan_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> LIGHT_BLUE_HOOFJACK = registerblock("light_blue_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> BLUE_HOOFJACK = registerblock("blue_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> PURPLE_HOOFJACK = registerblock("purple_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> MAGENTA_HOOFJACK = registerblock("magenta_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> PINK_HOOFJACK = registerblock("pink_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> BLACK_HOOFJACK = registerblock("black_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> GRAY_HOOFJACK = registerblock("gray_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> LIGHT_GRAY_HOOFJACK = registerblock("light_gray_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);

    public static final RegistryObject<Block> WHITE_HOOFJACK = registerblock("white_hoofjack",
            () -> new BrownHoofJack(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.FARRIERDECO);
    public static final RegistryObject<Block> FARRIERSTABLE_BLOCK = registerblock("farrierstable_block",
            () -> new FarrierstableBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion()), ModCreativeModeTab.FARRIERDECO);
    public static final RegistryObject<Block> GREEN_FARRIERSTABLE_BLOCK = registerblock("green_farrierstable_block",
            () -> new GreenFarrierstableBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion()), ModCreativeModeTab.FARRIERDECO);


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
