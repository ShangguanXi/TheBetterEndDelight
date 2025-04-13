package com.betterenddelight.generator;

import com.betterenddelight.registers.blocks.*;
import com.betterenddelight.registers.items.Foods;
import com.betterenddelight.registers.items.Knives;
import com.betterenddelight.registers.items.Tools;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EnUsTranslationGenerator extends FabricLanguageProvider {
    protected EnUsTranslationGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.better_end_delight","The Better End Delight");
        translationBuilder.add(PetalCarpetBlocks.HYDRALUX_PETAL_CARPET_BLOCK, "Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_white", "White Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_orange", "Orange Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_magenta", "Magenta Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_light_blue", "Light Blue Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_yellow", "Yellow Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_lime", "Lime Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_pink", "Pink Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_gray", "Gray Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_light_gray", "Light Gray Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_cyan", "Cyan Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_purple", "Purple Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_blue", "Blue Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_brown", "Brown Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_green", "Green Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_red", "Red Hydralux Petal Carpet");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_black", "Black Hydralux Petal Carpet");
        translationBuilder.add("farmersdelight.tooltip.milk_jelly", "Clears 1 Effect");

        translationBuilder.add(Crates.BLOSSOM_BERRY_CRATE, "Blossom Berry Crate");
        translationBuilder.add(Crates.SHADOW_BERRY_CRATE, "Shadow Berry Crate");
        translationBuilder.add(Crates.LUMECORN_ROD_CRATE, "Lumecorn Rod Crate");

        translationBuilder.add(Crates.HYDRALUX_PETAL_BAG, "HydraluxPetal Bag");
        translationBuilder.add(Crates.AMBER_ROOT_RAW_BAG, "Amber Root Bag");
        translationBuilder.add(Crates.CHORUS_MUSHROOM_RAW_BAG, "Chorus Mushroom Bag");

        translationBuilder.add(Pies.BLOSSOM_BERRY_CHEESECAKE, "Blossom Berry Cheesecake");
        translationBuilder.add(Foods.BLOSSOM_BERRY_CHEESECAKE_SLICE, "Blossom Berry Cheesecake Slice");
        translationBuilder.add(Pies.SHADOW_BERRY_CHEESECAKE, "Shadow Berry Cheesecake");
        translationBuilder.add(Foods.SHADOW_BERRY_CHEESECAKE_SLICE, "Shadow Cheesecake Slice");

        translationBuilder.add(Knives.THALLASIUM_KNIFE, "Thallasium Knife");
        translationBuilder.add(Knives.TERMINITE_KNIFE, "Terminite Knife");
        translationBuilder.add(Knives.AETERNIUM_KNIFE, "Aeternium Knife");
        translationBuilder.add(Tools.LUMECORN_CUDGEL, "Lumecorn Cudgel");

        translationBuilder.add(Foods.COOKED_END_FISH_SLICE,"Cooked End Fish Slice");
        translationBuilder.add(Foods.END_FISH_SLICE,"End Fish Slice");
        translationBuilder.add(Foods.END_FISH_ROLL,"End Fish Roll");
        translationBuilder.add(Foods.CAVE_PUMPKIN_PIE_SLICE,"Cave Pumpkin Pie Slice");
        translationBuilder.add(Foods.BLOSSOM_BERRY_POPSICLE,"Blossom Berry Popsicle");
        translationBuilder.add(Foods.SHADOW_BERRY_POPSICLE,"Shadow Berry Popsicle");
        translationBuilder.add(Foods.END_FISH_WRAP,"End Fish Warp");
        translationBuilder.add(Foods.END_FISH_SANDWICH,"End Fish Sandwich");
        translationBuilder.add(Foods.GELATINE_SAUCE,"Jellyfish Sauce");
        translationBuilder.add(Foods.GLOW_BERRY_JELLY,"Glow Berry Jelly");
        translationBuilder.add(Cabinets.DRAGON_TREE_CABINET,"Dragon Tree Cabinet");
        translationBuilder.add(Cabinets.END_LOTUS_CABINET,"End Lotus Cabinet");
        translationBuilder.add(Cabinets.HELIX_TREE_CABINET,"Helix Tree Cabinet");
        translationBuilder.add(Cabinets.JELLYSHROOM_CABINET,"Jellyshroom Cabinet");
        translationBuilder.add(Cabinets.LACUGROVE_CABINET,"Lacugrove Cabinet");
        translationBuilder.add(Cabinets.LUCERNIA_CABINET,"Lucernia Cabinet");
        translationBuilder.add(Cabinets.MOSSY_GLOWSHROOM_CABINET,"Mossy Glowshroom Cabinet");
        translationBuilder.add(Cabinets.TENANEA_CABINET,"Tenanea Cabinet");
        translationBuilder.add(Cabinets.PYTHADENDRON_CABINET,"Pythadendron Cabinet");
        translationBuilder.add(Cabinets.UMBRELLA_TREE_CABINET,"Umbrella Tree Cabinet");
        translationBuilder.add(Foods.COOKED_POLYPORE,"Cooked Polypore");
        translationBuilder.add(Foods.NEON_CACTUS_SLICE,"Neon Cactus Slice");
        translationBuilder.add(Foods.COOKED_NEON_CACTUS_SLICE,"Cooked Neon Cactus Slice");
        translationBuilder.add(Foods.AMARANITA_MUSHROOM_RICE,"Amaranita Mushroom Rice");
        translationBuilder.add(WildCrops.WILD_ALOE_VERA,"End Aloe Vera");
        translationBuilder.add(Foods.ALOE_VERA_JELLY,"End Aloe Vera Jelly");
        translationBuilder.add(Foods.ALOE_VERA_LEAF,"End Aloe Vera Leaf");
        translationBuilder.add(Foods.BLOSSOM_BERRY_JUICE,"Blossom Berry Juice");
        translationBuilder.add(Foods.SHADOW_BERRY_JUICE,"Shadow Berry Juice");
        translationBuilder.add(Foods.MELON_JELLY,"Melon Jelly");
        translationBuilder.add(Foods.APPLE_JELLY,"Apple Jelly");
        translationBuilder.add(Foods.MILK_JELLY,"Milk Jelly");
        translationBuilder.add(Foods.SHADOW_WALKER_MEAT_RAW,"Raw Shadow Meat");
        translationBuilder.add(Foods.SHADOW_WALKER_MEAT_COOKED,"Cooked Shadow Meat");
        translationBuilder.add(Foods.ENDSHADE_BARBECUE_STICK,"Endshade Barbecue");
        translationBuilder.add(Foods.COOKED_SMALL_JELLYSHROOM,"Cooked Small Jellyshroom");

    }
}
