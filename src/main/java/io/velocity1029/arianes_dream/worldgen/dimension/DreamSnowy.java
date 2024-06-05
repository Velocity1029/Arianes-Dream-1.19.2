package io.velocity1029.arianes_dream.worldgen.dimension;

import io.velocity1029.arianes_dream.ArianesDream;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.Bootstrap;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;

public class DreamSnowy {
    public static final ResourceKey<LevelStem> DREAM_KEY = ResourceKey.create(Registry.LEVEL_STEM_REGISTRY,
            new ResourceLocation(ArianesDream.MODID, "dream"));
    public static final ResourceKey<Level> DREAM_LEVEL_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(ArianesDream.MODID, "dream"));
    public static final ResourceKey<DimensionType> DREAM_DIM_TYPE = ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY,
            new ResourceLocation(ArianesDream.MODID, "dream_type"));

    public static void bootstrapType(DimensionType context) {
        //
    }
}
