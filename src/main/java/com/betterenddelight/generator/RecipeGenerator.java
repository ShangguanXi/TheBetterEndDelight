package com.betterenddelight.generator;

import com.betterenddelight.BetterEndDelight;
import com.betterenddelight.generator.recipes.ShapedRecipes;
import com.betterenddelight.registers.TagRegister;
import com.betterenddelight.registers.blocks.Crates;
import com.betterenddelight.registers.items.Foods;
import com.betterenddelight.registers.items.Knives;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.betterx.betterend.registry.EndBlocks;
import org.betterx.betterend.registry.EndItems;
import org.betterx.betterend.registry.EndTemplates;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.ConventionalTags;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public static String hasTag(TagKey<Item> tag) {
        return "has_" + tag.id().getPath().replace("/","_");
    }
    RecipeGenerator(FabricDataOutput generator) {
        super(generator);
    }
    public static void simpleRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, RecipeCategory category2, Item inputItem, int inputCount, Item outputItem, int outputCount) {
        ShapelessRecipeJsonBuilder.create(category, outputItem, outputCount)
                .input(inputItem, inputCount)
                .criterion(FabricRecipeProvider.hasItem(inputItem), FabricRecipeProvider.conditionsFromItem(inputItem))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(category2, inputItem, inputCount)
                .input(outputItem, outputCount)
                .criterion(FabricRecipeProvider.hasItem(outputItem), FabricRecipeProvider.conditionsFromItem(outputItem))
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
    public static ShapelessRecipeBuilder shapelessRecipe(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, Item outputItem, int outputCount) {
        return new ShapelessRecipeBuilder(exporter, category, outputItem, outputCount);
    }

    public static class ShapelessRecipeBuilder {
        private final ShapelessRecipeJsonBuilder recipeBuilder;
        private final Consumer<RecipeJsonProvider> exporter;
        private Object firstInput = null;  // 存储第一个输入物品或标签

        public ShapelessRecipeBuilder(Consumer<RecipeJsonProvider> exporter, RecipeCategory category, Item outputItem, int outputCount) {
            this.recipeBuilder = ShapelessRecipeJsonBuilder.create(category, outputItem, outputCount);
            this.exporter = exporter;
        }

        public ShapelessRecipeBuilder addInput(Item item, int count) {
            if (firstInput == null) {
                firstInput = item;  // 记录第一个输入物品
            }
            this.recipeBuilder.input(item, count);
            return this;
        }

        public ShapelessRecipeBuilder addInput(TagKey<Item> tag, int count) {
            if (firstInput == null) {
                firstInput = tag;  // 记录第一个输入标签
            }
            this.recipeBuilder.input(Ingredient.fromTag(tag), count);
            return this;
        }

        public void build() {
            if (firstInput instanceof Item) {
                this.recipeBuilder.criterion(FabricRecipeProvider.hasItem((Item) firstInput), FabricRecipeProvider.conditionsFromItem((Item) firstInput));
            } else if (firstInput instanceof TagKey) {
                this.recipeBuilder.criterion("has_" + ((TagKey<?>) firstInput).id().getPath(), FabricRecipeProvider.conditionsFromTag((TagKey<Item>) firstInput));
            }
            this.recipeBuilder.offerTo(exporter);
        }
    }






    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipes.initialize(exporter);

        simpleRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,RecipeCategory.FOOD, Crates.SHADOW_BERRY_CRATE.asItem(),1,EndItems.SHADOW_BERRY_RAW,9);

        simpleRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,RecipeCategory.FOOD, Crates.BLOSSOM_BERRY_CRATE.asItem(),1,EndItems.BLOSSOM_BERRY,9);

        simpleRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,RecipeCategory.MISC, Crates.LUMECORN_ROD_CRATE.asItem(),1,EndItems.LUMECORN_ROD,9);

        simpleRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,RecipeCategory.MISC, Crates.HYDRALUX_PETAL_BAG.asItem(),1,EndItems.HYDRALUX_PETAL,9);

        simpleRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,RecipeCategory.MISC, Crates.AMBER_ROOT_RAW_BAG.asItem(),1,EndItems.AMBER_ROOT_RAW,9);

        simpleRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,RecipeCategory.MISC, Crates.CHORUS_MUSHROOM_RAW_BAG.asItem(),1,EndItems.CHORUS_MUSHROOM_RAW,9);



        shapelessRecipe(exporter,RecipeCategory.FOOD,Foods.END_FISH_ROLL,2)
                .addInput(Foods.END_FISH_SLICE,2)
                .addInput(ModItems.COOKED_RICE.get(),1)
                .build();
        shapelessRecipe(exporter,RecipeCategory.FOOD, Foods.CAVE_PUMPKIN_PIE_SLICE,4)
                .addInput(EndItems.CAVE_PUMPKIN_PIE,1)
                .build();
        shapelessRecipe(exporter,RecipeCategory.FOOD, Foods.END_FISH_SANDWICH,1)
                .addInput(TagRegister.COOKED_END_FISH,1)
                .addInput(ConventionalTags.FOODS_BREADS,1)
                .addInput(ConventionalTags.SALAD_INGREDIENTS,1)
                .addInput(ModItems.TOMATO.get(),1)
                .build();
        shapelessRecipe(exporter,RecipeCategory.FOOD, Foods.END_FISH_WRAP,1)
                .addInput(TagRegister.COOKED_END_FISH,1)
                .addInput(ConventionalTags.FOODS_BREADS,1)
                .addInput(ConventionalTags.SALAD_INGREDIENTS,1)
                .addInput(ModItems.ONION.get(),1)
                .build();
        shapelessRecipe(exporter,RecipeCategory.FOOD,Foods.GLOW_BERRY_JELLY,1)
                .addInput(Items.GLOW_BERRIES,1)
                .addInput(EndItems.GELATINE,1)
                .addInput(Items.SUGAR,1)
                .addInput(Items.POTION,1)
                .build();

        cookRecipe(exporter,RecipeCategory.FOOD,Foods.END_FISH_SLICE,Foods.COOKED_END_FISH_SLICE,0.5F,300);

        smithingRecipe(exporter,RecipeCategory.TOOLS, EndItems.AETERNIUM_INGOT,EndItems.LEATHER_WRAPPED_STICK, EndTemplates.TOOL_ASSEMBLY, Knives.AETERNIUM_KNIFE);
        smithingRecipe(exporter,RecipeCategory.TOOLS, EndBlocks.THALLASIUM.ingot ,Items.STICK, EndTemplates.TOOL_ASSEMBLY, Knives.THALLASIUM_KNIFE);
        smithingRecipe(exporter,RecipeCategory.TOOLS, EndBlocks.TERMINITE.ingot ,Items.STICK, EndTemplates.TOOL_ASSEMBLY, Knives.TERMINITE_KNIFE);
    }

}
