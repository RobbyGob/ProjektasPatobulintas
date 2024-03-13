package net.komanda2.advancednpc.events;

import net.komanda2.advancednpc.AdvancedNPCMod;
import net.komanda2.advancednpc.client.renderer.EntityNPCRenderer;
import net.komanda2.advancednpc.init.EntityInit;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(modid = AdvancedNPCMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class clientModEvent {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerEntityRenderer(EntityInit.NPC_ENTITY.get(), EntityNPCRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event)
    {

    }
}
