package com.mylifeblike.blockybuddymod.events;

import com.mylifeblike.blockybuddymod.BlockyBuddyMod;
import com.mylifeblike.blockybuddymod.client.model.BB;
import com.mylifeblike.blockybuddymod.client.renderer.BBRenderer;
import com.mylifeblike.blockybuddymod.init.EntityInit;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@Mod(BlockyBuddyMod.MODID)
public class ClientModsEvents {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(EntityInit.entityHolder.get(), BBRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(BB.LAYER_LOCATION, BB::createBodyLayer);
    }
}
