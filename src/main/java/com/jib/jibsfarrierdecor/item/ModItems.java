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
