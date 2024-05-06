package net.ho3pli.blockybuddymod.entity;

import net.ho3pli.blockybuddymod.BlockyBuddyMod;
import net.ho3pli.blockybuddymod.entity.custom.BBEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModEntities {
    public static  final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(NeoForgeRegistries.ENTITY_TYPES, BlockyBuddyMod.MODID);

    public static final RegistryObject<EntityType<BBEntity>> BB = ENTITY_TYPES.register("BB", ()-> EntityType.Builder.of(BBEntity::new, MobCategory.CREATURE).sized(2.5f, 2.5f).build("BB"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}