package net.gellyphish.skatesnowsurf.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gellyphish.skatesnowsurf.SkateSnowSurf;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WHEEL = registerItem("wheel", new Item(new Item.Settings()));
    public static final Item FIN = registerItem("fin", new Item(new Item.Settings()));

    public static final Item SURFBOARD = registerItem("surfboard", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SkateSnowSurf.MOD_ID, name), item);
    }


    public static void registerModItems() {
        SkateSnowSurf.LOGGER.info("Registering mod items for " + SkateSnowSurf.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(WHEEL);
            fabricItemGroupEntries.add(FIN);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SURFBOARD);
        });
    }
}
