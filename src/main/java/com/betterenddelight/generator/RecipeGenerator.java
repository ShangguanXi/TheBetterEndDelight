package com.betterenddelight.generator;

import com.betterenddelight.BetterEndDelight;
import com.betterenddelight.registers.blocks.Crates;
import com.betterenddelight.registers.items.Foods;
import com.betterenddelight.registers.items.Knives;
import com.google.common.collect.Lists;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.Util;
import net.minecraft.util.collection.DefaultedList;
import org.betterx.betterend.item.material.EndToolMaterial;
import org.betterx.betterend.registry.EndBlocks;
import org.betterx.betterend.registry.EndItems;
import org.betterx.betterend.registry.EndTemplates;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.crafting.CuttingBoardRecipe;
import vectorwing.farmersdelight.common.crafting.ingredient.ChanceResult;
import vectorwing.farmersdelight.common.tag.ConventionalTags;
import vectorwing.farmersdelight.integration.crafttweaker.handlers.CuttingBoardRecipeHandler;
import vectorwing.farmersdelight.integration.crafttweaker.managers.CuttingBoardRecipeManager;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

import static net.minecraft.advancement.AdvancementRewards.Builder.recipe;

public class RecipeGenerator extends FabricRecipeProvider {
    public static String hasTag(TagKey<Item> tag) {
        return "has_" + tag.id().getPath().replace("/","_");
    }
    RecipeGenerator(FabricDataOutput generator) {
        super(generator);
    }
    public static void simpleRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, Item inputItem, int inputCount, Item outputItem, int outputCount) {
        ShapelessRecipeJsonBuilder.create(category, outputItem, outputCount)
                .input(inputItem, inputCount)
                .criterion(FabricRecipeProvider.hasItem(inputItem), FabricRecipeProvider.conditionsFromItem(inputItem))
                .offerTo(exporter);
    }
    public static void cookRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, Item input, Item output, float experience, int smeltingTime) {
        int campfireTime = smeltingTime * 3;
        int smokingTime = smeltingTime / 2;
        String path = Registries.ITEM.getId(output).getPath();


        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(input), category, output, experience, smeltingTime)
                .criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, new Identifier(BetterEndDelight.MOD_ID, path + "_from_smelting"));


        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(input), category, output, experience, campfireTime)
                .criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, new Identifier(BetterEndDelight.MOD_ID, path+ "_from_campfire_cooking"));


        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(input), category, output, experience, smokingTime)
                .criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, new Identifier(BetterEndDelight.MOD_ID,  path + "_from_smoking"));
    }
    public static void smithingRecipe(Consumer<RecipeJsonProvider> exporter,RecipeCategory category, Item base, Item addition, Item template, Item result){

        String path = Registries.ITEM.getId(result).getPath();
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(template),Ingredient.ofItems(base),Ingredient.ofItems(addition),category,result)
                .criterion(RecipeProvider.hasItem(base), RecipeProvider.conditionsFromItem(base))
                .offerTo(exporter, new Identifier(BetterEndDelight.MOD_ID,  path));
    }




    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        simpleRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, Crates.SHADOW_BERRY_CRATE.asItem(),1,EndItems.SHADOW_BERRY_RAW,9);
        simpleRecipe(exporter,RecipeCategory.FOOD, EndItems.SHADOW_BERRY_RAW,9,Crates.SHADOW_BERRY_CRATE.asItem(),1);
        simpleRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, Crates.BLOSSOM_BERRY_CRATE.asItem(),1,EndItems.BLOSSOM_BERRY,9);
        simpleRecipe(exporter,RecipeCategory.FOOD, EndItems.BLOSSOM_BERRY,9,Crates.BLOSSOM_BERRY_CRATE.asItem(),1);
        cookRecipe(exporter,RecipeCategory.FOOD,Foods.END_FISH_SLICE,Foods.COOKED_END_FISH_SLICE,0.5F,300);
        smithingRecipe(exporter,RecipeCategory.TOOLS, EndItems.AETERNIUM_INGOT,EndItems.LEATHER_WRAPPED_STICK, EndTemplates.TOOL_ASSEMBLY, Knives.AETERNIUM_KNIFE);
        smithingRecipe(exporter,RecipeCategory.TOOLS, EndBlocks.THALLASIUM.ingot ,Items.STICK, EndTemplates.TOOL_ASSEMBLY, Knives.THALLASIUM_KNIFE);
        smithingRecipe(exporter,RecipeCategory.TOOLS, EndBlocks.TERMINITE.ingot ,Items.STICK, EndTemplates.TOOL_ASSEMBLY, Knives.TERMINITE_KNIFE);
    }

}
