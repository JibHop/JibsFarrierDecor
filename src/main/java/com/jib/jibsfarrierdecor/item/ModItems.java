package com.jib.jibsfarrierdecor.item;

import com.jib.jibsfarrierdecor.JibsFarrierDecor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JibsFarrierDecor.MOD_ID);

public static final RegistryObject<Item> HORSESHOE = ITEMS.register("horseshoe",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

public static final RegistryObject<Item> HOOF_LEVELLER = ITEMS.register("hoof_leveller",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

public static final RegistryObject<Item> HOOF_NIPPERS = ITEMS.register("hoof_nippers",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

public static final RegistryObject<Item> HOOF_TESTER = ITEMS.register("hoof_tester",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

public static final RegistryObject<Item> HOOF_KNIFE = ITEMS.register("hoof_knife",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

public static final RegistryObject<Item> NAIL_PULLER = ITEMS.register("nail_puller",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

public static final RegistryObject<Item> GOOSENECK_CLENCHER = ITEMS.register("gooseneck_clencher",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

public static final RegistryObject<Item> CLENCHER = ITEMS.register("clencher",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> BROWN_HOOF_PICK = ITEMS.register("brown_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

public static final RegistryObject<Item> RED_HOOF_PICK = ITEMS.register("red_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> ORANGE_HOOF_PICK = ITEMS.register("orange_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> YELLOW_HOOF_PICK = ITEMS.register("yellow_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> LIME_HOOF_PICK = ITEMS.register("lime_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> GREEN_HOOF_PICK = ITEMS.register("green_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> CYAN_HOOF_PICK = ITEMS.register("cyan_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> LIGHT_BLUE_HOOF_PICK = ITEMS.register("light_blue_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> BLUE_HOOF_PICK = ITEMS.register("blue_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> PURPLE_HOOF_PICK = ITEMS.register("purple_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> MAGENTA_HOOF_PICK = ITEMS.register("magenta_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> PINK_HOOF_PICK = ITEMS.register("pink_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> WHITE_HOOF_PICK = ITEMS.register("white_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> LIGHT_GRAY_HOOF_PICK = ITEMS.register("light_gray_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> GRAY_HOOF_PICK = ITEMS.register("gray_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));

    public static final RegistryObject<Item> BLACK_HOOF_PICK = ITEMS.register("black_hoof_pick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO)));



public static final RegistryObject<Item> BANANACARROTAPPLESAUCE_TREATS = ITEMS.register("bananacarrotapplesauce_treats",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO).food(ModFoods.BANANACARROTAPPLESAUCE_TREATS)));

public static final RegistryObject<Item> COCONUT_TREATS = ITEMS.register("coconut_treats",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO).food(ModFoods.COCONUT_TREATS)));

public static final RegistryObject<Item> MINTS = ITEMS.register("mints",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FARRIERDECO).food(ModFoods.MINTS)));


    public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
    }
}
