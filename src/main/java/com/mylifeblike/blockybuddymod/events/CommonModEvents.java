package com.mylifeblike.blockybuddymod.events;

import com.mylifeblike.blockybuddymod.BlockyBuddyMod;
import com.mylifeblike.blockybuddymod.entity.BBEntity;
import com.mylifeblike.blockybuddymod.init.EntityInit;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.SpawnPlacementRegisterEvent;

@Mod(BlockyBuddyMod.MODID)
public class CommonModEvents {

    @SubscribeEvent
    public static void entryAttributes(EntityAttributeCreationEvent event){
        event.put(EntityInit.entityHolder.get(), BBEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event){
        event.register(
                EntityInit.entityHolder.get(),
                SpawnPlacementTypes.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                BBEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
    }
}
