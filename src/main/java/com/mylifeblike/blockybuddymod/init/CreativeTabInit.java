package com.mylifeblike.blockybuddymod.init;

import com.mylifeblike.blockybuddymod.BlockyBuddyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod(BlockyBuddyMod.MODID)
public class CreativeTabInit {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlockyBuddyMod.MODID);

    public static final List<Supplier<? extends ItemLike>> TAB_ITEMS = new ArrayList<>();

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BB_TAB = TABS.register("bbtab",
            ()-> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.bbtab"))
                    .icon(ItemInit.BB_SPAWN_EGG.get()::getDefaultInstance)
                    .displayItems((displayParams, output)->
                            TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );

    public static <T extends Item> DeferredHolder<T, T> addToTab(DeferredHolder<T, T> itemLike){
        TAB_ITEMS.add(itemLike);
        return itemLike;
    }

//     Method to add an item to an existing tab
//     @SubscribeEvent
//     public static void buildContents(BuildCreativeModeTabContentsEvent event) {
//         if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
//             event.accept((ItemLike) ItemInit.BB_SPAWN_EGG);
//         }
//         if (event.getTab() == BB_TAB.get()){
//             event.accept(Items.CROSSBOW);
//         }
//     }
}
