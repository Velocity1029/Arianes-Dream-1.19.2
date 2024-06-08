package io.velocity1029.arianes_dream.worldgen.biome;

import io.velocity1029.arianes_dream.ArianesDream;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBiomes {
    public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ArianesDream.MODID);

    public static final RegistryObject<Biome> SNOWY_WASTELAND = REGISTRY.register("snowy_wasteland", SnowyWasteland::createBiome);

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
