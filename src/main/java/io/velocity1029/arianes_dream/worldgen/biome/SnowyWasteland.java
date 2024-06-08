package io.velocity1029.arianes_dream.worldgen.biome;

import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;

public class SnowyWasteland {
    public static Biome createBiome() {
        BiomeSpecialEffects
                effects = new BiomeSpecialEffects.Builder()
                    .fogColor(13158615)
                    .waterColor(13158615)
                    .waterFogColor(13158615)
                    .skyColor(13158615)
                    .foliageColorOverride(16396820)
                    .grassColorOverride(16396820)
                    //.ambientLoopSound()
                    .build();

        BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
        BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);

        MobSpawnSettings.Builder mobSpawnSettings = new MobSpawnSettings.Builder();

        return new Biome.BiomeBuilder()
                .precipitation(Biome.Precipitation.SNOW)
                .temperature(0.2f)
                .downfall(1)
                .specialEffects(effects)
                .mobSpawnSettings(mobSpawnSettings.build())
                .generationSettings(biomeGenerationSettings.build())
                .build();
    }
}
