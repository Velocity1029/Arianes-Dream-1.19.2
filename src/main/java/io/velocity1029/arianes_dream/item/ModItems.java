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
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> TESSERACT;
    public static final RegistryObject<Item> DUST;
    public static final RegistryObject<Item> DUST_BLOCK;
    public static final RegistryObject<Item> METALLIC_DUST;
    public static final RegistryObject<Item> OUTCROPPING;
    public static final RegistryObject<Item> OBELISK;

    static {
        TESSERACT = registerItem("tesseract", () -> new Item(new Item.Properties().tab(MOD_TAB)));//() -> new BlockItem(TESSERACT.get(), new Item.Properties().tab(MOD_TAB)));
        DUST = registerItem("dust", () -> new BlockItem(ModBlocks.DUST.get(), new Item.Properties().tab(MOD_TAB)));
        DUST_BLOCK = registerItem("dust_block", () -> new BlockItem(ModBlocks.DUST_BLOCK.get(), new Item.Properties().tab(MOD_TAB)));
        METALLIC_DUST = registerItem("metallic_dust", () -> new Item(new Item.Properties().tab(MOD_TAB)));
        OUTCROPPING = registerItem("outcropping", () -> new BlockItem(ModBlocks.OUTCROPPING.get(), new Item.Properties().tab(MOD_TAB)));
        OBELISK = registerItem("obelisk", () -> new BlockItem(ModBlocks.OBELISK.get(), new Item.Properties().tab(MOD_TAB)));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static <T extends Item> RegistryObject<T> registerItem(String pName, Supplier<T> supplier) {
        return ITEMS.register(pName, supplier);
    }
}
