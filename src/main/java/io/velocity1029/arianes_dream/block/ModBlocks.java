package io.velocity1029.arianes_dream.block;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static io.velocity1029.arianes_dream.ArianesDream.MODID;

public class ModBlocks {
    // Create a Deferred Register to hold Items which will all be registered under the "arianes_dream" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    // Creates a new BlockItem with the id "arianes_dream:tesseract", combining the namespace and path
    public static final RegistryObject<Block> TESSERACT = BLOCKS.register("tesseract",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).explosionResistance(100)));

    // Creates a new BlockItem with the id "arianes_dream:tesseract", combining the namespace and path
    public static final RegistryObject<Block> DUST_LAYER = BLOCKS.register("dust_layer",
            () -> new SnowLayerBlock(BlockBehaviour.Properties.of(Material.TOP_SNOW).sound(SoundType.SAND)));


    public static final RegistryObject<Block> DUST_BLOCK = BLOCKS.register("dust_block",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND)));
}
