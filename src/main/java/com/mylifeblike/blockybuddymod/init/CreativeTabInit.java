package com.mylifeblike.blockybuddymod.init;

import com.mylifeblike.blockybuddymod.BlockyBuddyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTabInit {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlockyBuddyMod.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BB_TAB = TABS.register("bbtab",
            ()-> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.bbtab"))
                    .icon(()-> new ItemStack((ItemLike) ItemInit.ITEMS))
                    .build()
    );
}
