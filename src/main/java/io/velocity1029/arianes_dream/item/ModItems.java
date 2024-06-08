package io.velocity1029.arianes_dream.item;

import io.velocity1029.arianes_dream.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static io.velocity1029.arianes_dream.ArianesDream.MOD_TAB;
import static io.velocity1029.arianes_dream.ArianesDream.MODID;

public class ModItems {
    // Create a Deferred Register to hold Items which will all be registered under the "arianes_dream" namespace
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> TESSERACT;
    public static final RegistryObject<Item> DUST;
    public static final RegistryObject<Item> DUST_BLOCK;
    public static final RegistryObject<Item> METALLIC_DUST;
    public static final RegistryObject<Item> OUTCROPPING;
    public static final RegistryObject<Item> OBELISK;

    static {
        TESSERACT = REGISTRY.register("tesseract", () -> new Item(new Item.Properties().tab(MOD_TAB)));//() -> new BlockItem(TESSERACT.get(), new Item.Properties().tab(MOD_TAB)));
        DUST = REGISTRY.register("dust", () -> new BlockItem(ModBlocks.DUST.get(), new Item.Properties().tab(MOD_TAB)));
        DUST_BLOCK = REGISTRY.register("dust_block", () -> new BlockItem(ModBlocks.DUST_BLOCK.get(), new Item.Properties().tab(MOD_TAB)));
        METALLIC_DUST = REGISTRY.register("metallic_dust", () -> new Item(new Item.Properties().tab(MOD_TAB)));
        OUTCROPPING = REGISTRY.register("outcropping", () -> new BlockItem(ModBlocks.OUTCROPPING.get(), new Item.Properties().tab(MOD_TAB)));
        OBELISK = REGISTRY.register("obelisk", () -> new BlockItem(ModBlocks.OBELISK.get(), new Item.Properties().tab(MOD_TAB)));
    }

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
