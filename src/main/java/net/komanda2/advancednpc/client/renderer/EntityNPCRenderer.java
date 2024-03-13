package net.komanda2.advancednpc.client.renderer;

import net.komanda2.advancednpc.AdvancedNPCMod;
import net.komanda2.advancednpc.EntityNPC;
import net.komanda2.advancednpc.client.model.EntityNPCModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class EntityNPCRenderer extends HumanoidMobRenderer
{
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(AdvancedNPCMod.MODID, "resources/textures/entity/entitynpc.png");
    public EntityNPCRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new HumanoidModel<>(ctx.bakeLayer(ModelLayers.PLAYER)),1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(Entity pEntity) {
        return TEXTURE;
    }
}
