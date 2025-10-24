package net.gellyphish.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gellyphish.skatesnowsurf.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BLACK_FIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_WHEEL, Models.GENERATED);

        itemModelGenerator.register(ModItems.POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GRAY_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_POLYURETHANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_POLYURETHANE, Models.GENERATED);

        itemModelGenerator.register(ModItems.WOODEN_BOARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_BOARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_BOARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_BOARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_BOARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_BOARD, Models.GENERATED);
    }
}
