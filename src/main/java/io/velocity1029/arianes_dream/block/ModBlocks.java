package io.velocity1029.arianes_dream.block;

import io.velocity1029.arianes_dream.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static io.velocity1029.arianes_dream.ArianesDream.MODID;
import static io.velocity1029.arianes_dream.ArianesDream.MOD_TAB;

public class ModBlocks {
    // Create a Deferred Register to hold Items which will all be registered under the "arianes_dream" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<Block> TESSERACT;
    public static final RegistryObject<Block> DUST_LAYER;
    public static final RegistryObject<Block> DUST_BLOCK;

    static {
        TESSERACT = registerBlock("tesseract", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).explosionResistance(100)));
        DUST_LAYER = registerBlock("dust_layer", () -> new SnowLayerBlock(BlockBehaviour.Properties.of(Material.TOP_SNOW).sound(SoundType.SAND)));
        DUST_BLOCK = registerBlock("dust_block", () -> new SandBlock(11098145, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_RED).strength(0.5F,10).sound(SoundType.SAND)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String pName, Supplier<T> supplier) {
        return BLOCKS.register(pName, supplier);
    }
}
