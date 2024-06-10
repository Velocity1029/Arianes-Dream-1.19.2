package io.velocity1029.arianes_dream.worldgen.biome.surface;

import io.velocity1029.arianes_dream.block.ModBlocks;
import io.velocity1029.arianes_dream.worldgen.biome.ModBiomes;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static io.velocity1029.arianes_dream.ArianesDream.MODID;

public class ModSurfaceRules {
//    public static final DeferredRegister<SurfaceRules.RuleSource> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOME_MODIFIERS_BUILTIN.get(), MODID);

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }

    private static final SurfaceRules.RuleSource RED_CONCRETE = makeStateRule(Blocks.RED_CONCRETE);
    private static final SurfaceRules.RuleSource DUST_BLOCK = makeStateRule(ModBlocks.DUST_BLOCK.get());
    private static final SurfaceRules.RuleSource DUST = makeStateRule(ModBlocks.DUST.get());
    private static final SurfaceRules.RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);

//    public static final RegistryObject<SurfaceRules.RuleSource> BEDROCK_FLOOR = REGISTRY.register("bedrock_floor",
//            SurfaceRules.ifTrue(
//                    SurfaceRules.verticalGradient(
//                            "minecraft:bedrock_floor",
//                            VerticalAnchor.aboveBottom(0),
//                            VerticalAnchor.aboveBottom(5)
//                    ),
//                    BEDROCK
//
//            ));

//    "type": "minecraft:condition",
//            "if_true": {
//        "type": "minecraft:vertical_gradient",
//                "random_name": "minecraft:bedrock_floor",
//                "true_at_and_below": {
//            "above_bottom": 0
//        },
//        "false_at_and_above": {
//            "above_bottom": 5
//        }
//    },
//            "then_run": {
//        "type": "minecraft:block",
//                "result_state": {
//            "Name": "minecraft:bedrock"
//        }
//    }


    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.RuleSource dustReplace = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, DUST_BLOCK), DUST_BLOCK);

        return SurfaceRules.sequence(
                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.SNOWY_WASTELAND.getKey()),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, DUST)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, RED_CONCRETE)),


                // Default to dust
                dustReplace
        );
    }

    public static void register(IEventBus eventBus) {
//        REGISTRY.register(eventBus);
    }
}
