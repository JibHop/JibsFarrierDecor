package com.jib.jibsfarrierdecor.item;

import com.jib.jibsfarrierdecor.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FARRIERDECO = new CreativeModeTab("farrierdeco") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CYAN_HOOFJACK.get());
        }
    };
}
