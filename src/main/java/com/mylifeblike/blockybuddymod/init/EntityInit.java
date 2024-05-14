package com.mylifeblike.blockybuddymod.init;

import com.mylifeblike.blockybuddymod.BlockyBuddyMod;
import com.mylifeblike.blockybuddymod.entity.BBEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EntityInit {
    public static  final DeferredRegister<EntityType<?>> entityRegister = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, BlockyBuddyMod.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<BBEntity>> entityHolder = entityRegister.register("BB",
                ()-> EntityType.Builder.<BBEntity>of(BBEntity::new, MobCategory.CREATURE)
                        .sized(1.0f, 1.0f)
                        .build(new ResourceLocation(BlockyBuddyMod.MODID, "BB").toString())
    );
    public static void register(IEventBus eventBus){
        entityRegister.register(eventBus);
    }
}