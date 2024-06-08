package io.velocity1029.arianes_dream.painting;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static io.velocity1029.arianes_dream.ArianesDream.MODID;
public class ModPaintings {
    // Create a Deferred Register to hold Items which will all be registered under the "arianes_dream" namespace
    public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, MODID);

    public static final RegistryObject<PaintingVariant> EUSAN_FLAG;

    static {
        EUSAN_FLAG = REGISTRY.register("eusan_flag", () -> new PaintingVariant(16, 32));
    }

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
