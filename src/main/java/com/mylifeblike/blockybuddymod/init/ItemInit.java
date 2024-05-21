package com.mylifeblike.blockybuddymod.init;

import com.mylifeblike.blockybuddymod.BlockyBuddyMod;
import com.mylifeblike.blockybuddymod.entity.BBEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SpawnEggItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, BlockyBuddyMod.MODID);

    public static final DeferredHolder<Item, Item> test = ITEMS.register("test",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationModifier(0.2f)
                            .build())
                    .rarity(Rarity.EPIC)
            )
    );

    public static final DeferredHolder<Item, SpawnEggItem> BB_SPAWN_EGG = ITEMS.register("bbspawnegg",
            () -> new SpawnEggItem(EntityType.PIG, 0xF0ABD1, 0xAE4C82, new Item.Properties())
    );
}