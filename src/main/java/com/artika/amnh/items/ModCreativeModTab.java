package com.artika.amnh.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab AMNH_TAB = new CreativeModeTab("amnh") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LOCKPICK.get());
        }
    };
}
