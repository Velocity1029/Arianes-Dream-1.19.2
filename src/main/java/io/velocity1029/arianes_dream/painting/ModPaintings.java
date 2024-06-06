package io.velocity1029.arianes_dream.painting;

import io.velocity1029.arianes_dream.block.ModBlocks;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static io.velocity1029.arianes_dream.ArianesDream.MODID;
import static io.velocity1029.arianes_dream.ArianesDream.MOD_TAB;

public class ModPaintings {
    // Create a Deferred Register to hold Items which will all be registered under the "arianes_dream" namespace
    public static final DeferredRegister<PaintingVariant> PAINTINGS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, MODID);

    public static final RegistryObject<PaintingVariant> EUSAN_FLAG;

    static {
        EUSAN_FLAG = registerPainting("eusan_flag", () -> new PaintingVariant(16, 32));
    }

    public static void register(IEventBus eventBus) {
        PAINTINGS.register(eventBus);
    }

    private static <T extends PaintingVariant> RegistryObject<T> registerPainting(String pName, Supplier<T> supplier) {
        return PAINTINGS.register(pName, supplier);
    }
}
