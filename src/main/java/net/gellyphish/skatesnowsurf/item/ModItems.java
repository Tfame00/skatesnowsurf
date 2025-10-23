package net.gellyphish.skatesnowsurf.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gellyphish.skatesnowsurf.SkateSnowSurf;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BLACK_WHEEL = registerItem("black_wheel", new Item(new Item.Settings()));
    public static final Item BLACK_FIN = registerItem("black_fin", new Item(new Item.Settings()));

    public static final Item POLYURETHANE = registerItem("polyurethane", new Item(new Item.Settings()));
    public static final Item RED_POLYURETHANE = registerItem("red_polyurethane", new Item(new Item.Settings()));
    public static final Item ORANGE_POLYURETHANE = registerItem("orange_polyurethane", new Item(new Item.Settings()));
    public static final Item YELLOW_POLYURETHANE = registerItem("yellow_polyurethane", new Item(new Item.Settings()));
    public static final Item GREEN_POLYURETHANE = registerItem("green_polyurethane", new Item(new Item.Settings()));
    public static final Item LIME_POLYURETHANE = registerItem("lime_polyurethane", new Item(new Item.Settings()));
    public static final Item CYAN_POLYURETHANE = registerItem("cyan_polyurethane", new Item(new Item.Settings()));
    public static final Item LIGHT_BLUE_POLYURETHANE = registerItem("light_blue_polyurethane", new Item(new Item.Settings()));
    public static final Item BLUE_POLYURETHANE = registerItem("blue_polyurethane", new Item(new Item.Settings()));
    public static final Item PURPLE_POLYURETHANE = registerItem("purple_polyurethane", new Item(new Item.Settings()));
    public static final Item MAGENTA_POLYURETHANE = registerItem("magenta_polyurethane", new Item(new Item.Settings()));
    public static final Item PINK_POLYURETHANE = registerItem("pink_polyurethane", new Item(new Item.Settings()));
    public static final Item BLACK_POLYURETHANE = registerItem("black_polyurethane", new Item(new Item.Settings()));
    public static final Item GRAY_POLYURETHANE = registerItem("gray_polyurethane", new Item(new Item.Settings()));
    public static final Item LIGHT_GRAY_POLYURETHANE = registerItem("light_gray_polyurethane", new Item(new Item.Settings()));
    public static final Item WHITE_POLYURETHANE = registerItem("white_polyurethane", new Item(new Item.Settings()));
    public static final Item BROWN_POLYURETHANE = registerItem("brown_polyurethane", new Item(new Item.Settings()));

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
            fabricItemGroupEntries.add(POLYURETHANE);
            fabricItemGroupEntries.add(WHITE_POLYURETHANE);
            fabricItemGroupEntries.add(LIGHT_GRAY_POLYURETHANE);
            fabricItemGroupEntries.add(GRAY_POLYURETHANE);
            fabricItemGroupEntries.add(BLACK_POLYURETHANE);
            fabricItemGroupEntries.add(BROWN_POLYURETHANE);
            fabricItemGroupEntries.add(RED_POLYURETHANE);
            fabricItemGroupEntries.add(ORANGE_POLYURETHANE);
            fabricItemGroupEntries.add(YELLOW_POLYURETHANE);
            fabricItemGroupEntries.add(GREEN_POLYURETHANE);
            fabricItemGroupEntries.add(LIME_POLYURETHANE);
            fabricItemGroupEntries.add(CYAN_POLYURETHANE);
            fabricItemGroupEntries.add(BLUE_POLYURETHANE);
            fabricItemGroupEntries.add(LIGHT_BLUE_POLYURETHANE);
            fabricItemGroupEntries.add(PURPLE_POLYURETHANE);
            fabricItemGroupEntries.add(MAGENTA_POLYURETHANE);
            fabricItemGroupEntries.add(PINK_POLYURETHANE);

            fabricItemGroupEntries.add(BLACK_WHEEL);
            fabricItemGroupEntries.add(BLACK_FIN);

            fabricItemGroupEntries.add(WOODEN_BOARD);
            fabricItemGroupEntries.add(STONE_BOARD);
            fabricItemGroupEntries.add(IRON_BOARD);
            fabricItemGroupEntries.add(GOLDEN_BOARD);
            fabricItemGroupEntries.add(DIAMOND_BOARD);
            fabricItemGroupEntries.add(NETHERITE_BOARD);
        });
    }
}
