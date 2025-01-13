package com.betterenddelight.generator;

import com.betterenddelight.BetterEndDelight;
import com.betterenddelight.registers.blocks.Crates;
import com.betterenddelight.registers.items.Foods;
import com.nhoryzon.mc.farmersdelight.registry.BlocksRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModelGenerator extends FabricModelProvider {

    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        crateBlock(Crates.BLOSSOM_BERRY_CRATE, blockStateModelGenerator);
        crateBlock(Crates.SHADOW_BERRY_CRATE, blockStateModelGenerator);
    }



    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Foods.END_FISH_SLICE, Models.GENERATED);
        itemModelGenerator.register(Foods.COOKED_END_FISH_SLICE, Models.GENERATED);

    }
    private static void crateBlock(Block block, BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSingleton(block,
                (new TextureMap())
                        .put(TextureKey.SIDE, new Identifier(BetterEndDelight.MOD_ID, "block/" + block.getTranslationKey().split("block.betterenddelight.")[1]+ "_side"))
                        .put(TextureKey.TOP, new Identifier(BetterEndDelight.MOD_ID, "block/" + block.getTranslationKey().split("block.betterenddelight.")[1] + "_top"))
                        .put(TextureKey.BOTTOM, new Identifier("farmersdelight", "block/crate_bottom")),
                Models.CUBE_BOTTOM_TOP);
    }

}
