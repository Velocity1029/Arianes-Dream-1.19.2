package io.velocity1029.arianes_dream.item;

import io.velocity1029.arianes_dream.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static io.velocity1029.arianes_dream.ArianesDream.MOD_TAB;
import static io.velocity1029.arianes_dream.ArianesDream.MODID;

public class ModItems {
    // Create a Deferred Register to hold Items which will all be registered under the "arianes_dream" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Creates a new BlockItem with the id "arianes_dream:tesseract", combining the namespace and path
    public static final RegistryObject<Item> TESSERACT = ITEMS.register("tesseract",
            () -> new Item(new Item.Properties().tab(MOD_TAB)));
            //() -> new BlockItem(TESSERACT.get(), new Item.Properties().tab(ARIANES_TAB)));

    public static final  RegistryObject<BlockItem> DUST_LAYER = ITEMS.register("dust_layer",
            () -> new BlockItem(ModBlocks.DUST_LAYER.get(), new Item.Properties().tab(MOD_TAB)));

    public static final  RegistryObject<BlockItem> DUST_BLOCK = ITEMS.register("dust_block",
            () -> new BlockItem(ModBlocks.DUST_BLOCK.get(), new Item.Properties().tab(MOD_TAB)));

    public static final RegistryObject<Item> METALLIC_DUST = ITEMS.register("metallic_dust",
            () -> new Item(new Item.Properties().tab(MOD_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
