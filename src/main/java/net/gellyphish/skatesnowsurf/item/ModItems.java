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
    public static final Item POLYURETHANE = registerItem("polyurethane", new Item(new Item.Settings()));

    public static final Item WOODEN_BOARD = registerItem("wooden_board", new Item(new Item.Settings()));
    public static final Item STONE_BOARD = registerItem("stone_board", new Item(new Item.Settings()));
    public static final Item IRON_BOARD = registerItem("iron_board", new Item(new Item.Settings()));
    public static final Item GOLDEN_BOARD = registerItem("golden_board", new Item(new Item.Settings()));
    public static final Item DIAMOND_BOARD = registerItem("diamond_board", new Item(new Item.Settings()));
    public static final Item NETHERITE_BOARD = registerItem("netherite_board", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SkateSnowSurf.MOD_ID, name), item);
    }


    public static void registerModItems() {
        SkateSnowSurf.LOGGER.info("Registering mod items for " + SkateSnowSurf.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(WHEEL);
            fabricItemGroupEntries.add(FIN);
            fabricItemGroupEntries.add(POLYURETHANE);

            fabricItemGroupEntries.add(WOODEN_BOARD);
            fabricItemGroupEntries.add(STONE_BOARD);
            fabricItemGroupEntries.add(IRON_BOARD);
            fabricItemGroupEntries.add(GOLDEN_BOARD);
            fabricItemGroupEntries.add(DIAMOND_BOARD);
            fabricItemGroupEntries.add(NETHERITE_BOARD);
        });
    }
}
