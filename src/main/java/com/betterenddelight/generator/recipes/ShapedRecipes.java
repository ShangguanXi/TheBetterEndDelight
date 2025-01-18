package com.betterenddelight.generator.recipes;

import com.betterenddelight.registers.blocks.Cabinets;
import com.betterenddelight.registers.blocks.PetalCarpetBlocks;
import com.betterenddelight.registers.blocks.Pies;
import com.betterenddelight.registers.items.Foods;
import com.betterenddelight.registers.items.Tools;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import org.betterx.betterend.registry.EndBlocks;
import org.betterx.betterend.registry.EndItems;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.ConventionalTags;

import java.util.Objects;
import java.util.function.Consumer;

import org.betterx.bclib.complexmaterials.WoodenComplexMaterial;

public class ShapedRecipes {
    public static void initialize(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Pies.BLOSSOM_BERRY_CHEESECAKE.asItem())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("BCB")
                .input('A', EndItems.BLOSSOM_BERRY)
                .input('B', ConventionalTags.MILKS)
                .input('C', ModItems.PIE_CRUST.get());
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Pies.BLOSSOM_BERRY_CHEESECAKE)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("BCB")
                .input('A', EndItems.BLOSSOM_BERRY)
                .input('B', ConventionalTags.MILKS)
                .input('C', ModItems.PIE_CRUST.get())
                .criterion(RecipeProvider.hasItem(EndItems.BLOSSOM_BERRY), RecipeProvider.conditionsFromItem(EndItems.BLOSSOM_BERRY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Pies.SHADOW_BERRY_CHEESECAKE)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("BCB")
                .input('A', EndItems.SHADOW_BERRY_RAW)
                .input('B', ConventionalTags.MILKS)
                .input('C', ModItems.PIE_CRUST.get())
                .criterion(RecipeProvider.hasItem(EndItems.SHADOW_BERRY_RAW), RecipeProvider.conditionsFromItem(EndItems.SHADOW_BERRY_RAW))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, PetalCarpetBlocks.HYDRALUX_PETAL_CARPET_BLOCK)
                .pattern("AA")
                .input('A', EndItems.HYDRALUX_PETAL)
                .criterion(RecipeProvider.hasItem(EndItems.HYDRALUX_PETAL), RecipeProvider.conditionsFromItem(EndItems.HYDRALUX_PETAL))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, Tools.LUMECORN_CUDGEL)
                .pattern(" A")
                .pattern("B ")
                .input('A', EndItems.LUMECORN_ROD)
                .input('B', Items.STICK)
                .criterion(RecipeProvider.hasItem(EndItems.LUMECORN_ROD), RecipeProvider.conditionsFromItem(EndItems.LUMECORN_ROD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Foods.SHADOW_BERRY_POPSICLE)
                .pattern(" AA")
                .pattern("CAA")
                .pattern("BC ")
                .input('A', EndItems.SHADOW_BERRY_RAW)
                .input('C', Items.ICE)
                .input('B', Items.STICK)
                .criterion(RecipeProvider.hasItem(EndItems.SHADOW_BERRY_RAW), RecipeProvider.conditionsFromItem(EndItems.SHADOW_BERRY_RAW))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Foods.BLOSSOM_BERRY_POPSICLE)
                .pattern(" AA")
                .pattern("CAA")
                .pattern("BC ")
                .input('A', EndItems.BLOSSOM_BERRY)
                .input('C', Items.ICE)
                .input('B', Items.STICK)
                .criterion(RecipeProvider.hasItem(EndItems.BLOSSOM_BERRY), RecipeProvider.conditionsFromItem(EndItems.BLOSSOM_BERRY))
                .offerTo(exporter);

          }
}
