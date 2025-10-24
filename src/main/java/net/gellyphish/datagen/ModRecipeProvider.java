package net.gellyphish.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gellyphish.skatesnowsurf.SkateSnowSurf;
import net.gellyphish.skatesnowsurf.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<Item> dyes = List.of(
                Items.BLACK_DYE,
                Items.BLUE_DYE,
                Items.BROWN_DYE,
                Items.CYAN_DYE,
                Items.GRAY_DYE,
                Items.GREEN_DYE,
                Items.LIGHT_BLUE_DYE,
                Items.LIGHT_GRAY_DYE,
                Items.LIME_DYE,
                Items.MAGENTA_DYE,
                Items.ORANGE_DYE,
                Items.PINK_DYE,
                Items.PURPLE_DYE,
                Items.RED_DYE,
                Items.YELLOW_DYE,
                Items.WHITE_DYE
        );

        List<Item> colored_polyurethanes = List.of(
                ModItems.BLACK_POLYURETHANE,
                ModItems.BLUE_POLYURETHANE,
                ModItems.BROWN_POLYURETHANE,
                ModItems.CYAN_POLYURETHANE,
                ModItems.GRAY_POLYURETHANE,
                ModItems.GREEN_POLYURETHANE,
                ModItems.LIGHT_BLUE_POLYURETHANE,
                ModItems.LIGHT_GRAY_POLYURETHANE,
                ModItems.LIME_POLYURETHANE,
                ModItems.MAGENTA_POLYURETHANE,
                ModItems.ORANGE_POLYURETHANE,
                ModItems.PINK_POLYURETHANE,
                ModItems.PURPLE_POLYURETHANE,
                ModItems.RED_POLYURETHANE,
                ModItems.YELLOW_POLYURETHANE,
                ModItems.WHITE_POLYURETHANE
        );


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POLYURETHANE, 4)
                .pattern(" H ")
                .pattern("HSH")
                .pattern(" H ")
                .input('H', Items.HONEYCOMB)
                .input('S', Items.SLIME_BALL)
                .criterion(hasItem(Items.SLIME_BALL), conditionsFromItem(Items.SLIME_BALL))
                .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                .offerTo(recipeExporter);

        //Creates recipes for dying polyurethane into colored polyurethane
        for (int i = 0; i < dyes.size(); i++) {
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, colored_polyurethanes.get(i), 1)
                    .input(ModItems.POLYURETHANE)
                    .input(dyes.get(i))
                    .criterion(hasItem(ModItems.POLYURETHANE), conditionsFromItem(ModItems.POLYURETHANE))
                    .group("polyurethanes")
                    .offerTo(recipeExporter);
        }

        //Creates recipes for dying colored polyurethane into differently colored polyurethane
        for (int i = 0; i < dyes.size(); i++) {
            Item item = dyes.get(i);
            Item item2 = colored_polyurethanes.get(i);
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, item2)
                .input(item)
                .input(Ingredient.ofStacks(colored_polyurethanes.stream().filter(dyeable -> !dyeable.equals(item2)).map(ItemStack::new)))
                .group("polyurethanes")
                .criterion("has_needed_dye", conditionsFromItem(item))
                .offerTo(recipeExporter, "dye_" + getItemPath(item2));
        }


    }
}
