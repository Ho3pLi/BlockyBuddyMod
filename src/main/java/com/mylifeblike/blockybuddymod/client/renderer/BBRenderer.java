package com.mylifeblike.blockybuddymod.client.renderer;

import com.mylifeblike.blockybuddymod.BlockyBuddyMod;
import com.mylifeblike.blockybuddymod.client.model.BB;
import com.mylifeblike.blockybuddymod.entity.BBEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.resources.ResourceLocation;

public class BBRenderer extends LivingEntityRenderer<BBEntity, BB<BBEntity>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(BlockyBuddyMod.MODID, "textures/entity/player.png");
    public BBRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new BB<>(ctx.bakeLayer(BB.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(BBEntity entity) {
        return TEXTURE;
    }
}
