package net.komanda2.advancednpc.events;

import net.komanda2.advancednpc.AdvancedNPCMod;
import net.komanda2.advancednpc.EntityNPC;
import net.komanda2.advancednpc.init.EntityInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = AdvancedNPCMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvent {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event)
    {
        event.put(EntityInit.NPC_ENTITY.get(), EntityNPC.createAttributes().build());
    }
}
