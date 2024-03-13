package net.komanda2.advancednpc.init;

import net.komanda2.advancednpc.AdvancedNPCMod;
import net.komanda2.advancednpc.EntityNPC;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AdvancedNPCMod.MODID);

    public static final RegistryObject<EntityType<EntityNPC>> NPC_ENTITY = ENTITIES.register("npc01",
            () -> EntityType.Builder.<EntityNPC>of(EntityNPC::new, MobCategory.CREATURE)
                    .sized(1.0f, 2.0f)
                    .build(new ResourceLocation(AdvancedNPCMod.MODID, "npc01").toString())
    );
}
