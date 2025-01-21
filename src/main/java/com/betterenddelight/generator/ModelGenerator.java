package com.betterenddelight.generator;

import com.betterenddelight.BetterEndDelight;
import com.betterenddelight.registers.blocks.Crates;
import com.betterenddelight.registers.blocks.PetalCarpetBlocks;
import com.betterenddelight.registers.blocks.Pies;
import com.betterenddelight.registers.blocks.WildCrops;
import com.betterenddelight.registers.items.Foods;
import com.betterenddelight.registers.items.Knives;
import com.betterenddelight.registers.items.Tools;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModelGenerator extends FabricModelProvider {

    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        crateBlock(Crates.BLOSSOM_BERRY_CRATE, blockStateModelGenerator);
        crateBlock(Crates.SHADOW_BERRY_CRATE, blockStateModelGenerator);
        crateBlock(Crates.LUMECORN_ROD_CRATE, blockStateModelGenerator);

        bagBlock(Crates.HYDRALUX_PETAL_BAG, blockStateModelGenerator);
        bagBlock(Crates.AMBER_ROOT_RAW_BAG, blockStateModelGenerator);
        bagBlock(Crates.CHORUS_MUSHROOM_RAW_BAG, blockStateModelGenerator);

        blockStateModelGenerator.registerSingleton(PetalCarpetBlocks.HYDRALUX_PETAL_CARPET_BLOCK,
                (new TextureMap())
                        .put(TextureKey.WOOL, new Identifier("betterend", "block/hydralux_petal_block")),
                Models.CARPET);

    }



    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(Knives.THALLASIUM_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(Knives.TERMINITE_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(Knives.AETERNIUM_KNIFE, Models.HANDHELD);

        itemModelGenerator.register(Tools.LUMECORN_CUDGEL, Models.HANDHELD);


        itemModelGenerator.register(Foods.END_FISH_SLICE, Models.GENERATED);
        itemModelGenerator.register(Foods.COOKED_END_FISH_SLICE, Models.GENERATED);
        itemModelGenerator.register(Foods.END_FISH_ROLL, Models.GENERATED);
        itemModelGenerator.register(Foods.CAVE_PUMPKIN_PIE_SLICE, Models.GENERATED);

        itemModelGenerator.register(Pies.BLOSSOM_BERRY_CHEESECAKE.asItem(),Models.GENERATED);
        itemModelGenerator.register(Pies.SHADOW_BERRY_CHEESECAKE.asItem(),Models.GENERATED);

        itemModelGenerator.register(Foods.BLOSSOM_BERRY_CHEESECAKE_SLICE, Models.GENERATED);
        itemModelGenerator.register(Foods.SHADOW_BERRY_CHEESECAKE_SLICE, Models.GENERATED);
        itemModelGenerator.register(Foods.BLOSSOM_BERRY_POPSICLE, Models.GENERATED);
        itemModelGenerator.register(Foods.SHADOW_BERRY_POPSICLE, Models.GENERATED);
        itemModelGenerator.register(Foods.END_FISH_WRAP, Models.GENERATED);
        itemModelGenerator.register(Foods.END_FISH_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(Foods.GELATINE_SAUCE, Models.GENERATED);
        itemModelGenerator.register(Foods.GLOW_BERRY_JELLY, Models.GENERATED);
        itemModelGenerator.register(Foods.COOKED_POLYPORE, Models.GENERATED);
        itemModelGenerator.register(Foods.NEON_CACTUS_SLICE, Models.GENERATED);
        itemModelGenerator.register(Foods.COOKED_NEON_CACTUS_SLICE, Models.GENERATED);
        itemModelGenerator.register(Foods.AMARANITA_MUSHROOM_RICE, Models.GENERATED);
        itemModelGenerator.register(Foods.ALOE_VERA_JELLY, Models.GENERATED);
        itemModelGenerator.register(Foods.ALOE_VERA_LEAF, Models.GENERATED);
        itemModelGenerator.register(Foods.SHADOW_BERRY_JUICE,Models.GENERATED);
        itemModelGenerator.register(Foods.BLOSSOM_BERRY_JUICE, Models.GENERATED);
        itemModelGenerator.register(Foods.APPLE_JELLY,Models.GENERATED);
        itemModelGenerator.register(Foods.MELON_JELLY, Models.GENERATED);
        itemModelGenerator.register(Foods.MILK_JELLY, Models.GENERATED);

    }
    private static void crateBlock(Block block, BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSingleton(block,
                (new TextureMap())
                        .put(TextureKey.SIDE, new Identifier(BetterEndDelight.MOD_ID, "block/" + block.getTranslationKey().split("block.betterenddelight.")[1]+ "_side"))
                        .put(TextureKey.TOP, new Identifier(BetterEndDelight.MOD_ID, "block/" + block.getTranslationKey().split("block.betterenddelight.")[1] + "_top"))
                        .put(TextureKey.BOTTOM, new Identifier("farmersdelight", "block/crate_bottom")),
                Models.CUBE_BOTTOM_TOP);
    }
    private static void bagBlock(Block block, BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSingleton(block,
                (new TextureMap())
                        .put(TextureKey.UP, new Identifier(BetterEndDelight.MOD_ID, "block/" + block.getTranslationKey().split("block.betterenddelight.")[1]+ "_top"))
                        .put(TextureKey.WEST, new Identifier("farmersdelight", "block/rice_bag_side" ))
                        .put(TextureKey.EAST, new Identifier("farmersdelight", "block/rice_bag_side" ))
                        .put(TextureKey.NORTH, new Identifier("farmersdelight", "block/rice_bag_side_tied" ))
                        .put(TextureKey.SOUTH, new Identifier("farmersdelight", "block/rice_bag_side_tied"))
                        .put(TextureKey.DOWN, new Identifier("farmersdelight", "block/rice_bag_bottom"))
                        .put(TextureKey.PARTICLE, new Identifier(BetterEndDelight.MOD_ID, "block/"+block.getTranslationKey().split("block.betterenddelight.")[1]+"_top")),
                Models.CUBE);
    }

}
