package io.velocity1029.arianes_dream.worldgen.dimension;

import io.velocity1029.arianes_dream.ArianesDream;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {

    public static final ResourceKey<Level> SNOWY_DREAM_LEVEL_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(ArianesDream.MODID, "snowy_dream"));
    public static final ResourceKey<DimensionType> SNOWY_DREAM_DIM_TYPE = ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY,
            new ResourceLocation(ArianesDream.MODID, "snowy_dream"));

    public static void register() {
        System.out.println("Registering Mod Dimensions for " + ArianesDream.MODID);
    }
}
