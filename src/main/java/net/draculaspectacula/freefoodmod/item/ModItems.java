package net.draculaspectacula.freefoodmod.item;

import net.draculaspectacula.freefoodmod.FreeFoodMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FreeFoodMod.MOD_ID);

    public static final RegistryObject<Item>  SAGEBRUSH_SHRUB = ITEMS.register("sagebrush_shrub",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
