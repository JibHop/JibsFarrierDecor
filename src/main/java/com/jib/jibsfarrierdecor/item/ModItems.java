package com.jib.jibsfarrierdecor.item;

import com.jib.jibsfarrierdecor.JibsFarrierDecor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JibsFarrierDecor.MOD_ID);


public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}
}
