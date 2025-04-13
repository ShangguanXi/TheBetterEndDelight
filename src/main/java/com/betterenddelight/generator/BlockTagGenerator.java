package com.betterenddelight.generator;

import com.betterenddelight.registers.TagRegister;
import com.betterenddelight.registers.blocks.Cabinets;
import com.betterenddelight.registers.blocks.Crates;
import com.betterenddelight.registers.blocks.WildCrops;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import org.betterx.betterend.registry.EndBlocks;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends  FabricTagProvider.BlockTagProvider {


    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        this.CommonTags();
        this.MinecraftTags();
        this.BetterEndDelightTags();
        this.FarmersDelightTags();
    }

    private void BetterEndDelightTags() {
        getOrCreateTagBuilder(TagRegister.ALOE_VERA_CAN_PLANT)
                .add(EndBlocks.JUNGLE_MOSS)
                .addOptionalTag(BlockTags.DIRT)
                .addOptionalTag(BlockTags.SAND);
    }

    private void MinecraftTags() {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(Crates.BLOSSOM_BERRY_CRATE)
                .add(Crates.SHADOW_BERRY_CRATE)
                .add(Crates.LUMECORN_ROD_CRATE)
                .add(Cabinets.DRAGON_TREE_CABINET)
                .add(Cabinets.END_LOTUS_CABINET)
                .add(Cabinets.HELIX_TREE_CABINET)
                .add(Cabinets.JELLYSHROOM_CABINET)
                .add(Cabinets.LACUGROVE_CABINET)
                .add(Cabinets.LUCERNIA_CABINET)
                .add(Cabinets.MOSSY_GLOWSHROOM_CABINET)
                .add(Cabinets.TENANEA_CABINET)
                .add(Cabinets.PYTHADENDRON_CABINET)
                .add(Cabinets.UMBRELLA_TREE_CABINET)
        ;
    }

    private void CommonTags(

    ){

    }
    private void FarmersDelightTags() {
        getOrCreateTagBuilder(ModTags.STRAW_BLOCKS)
                .add(Crates.HYDRALUX_PETAL_BAG)
                .add(Crates.AMBER_ROOT_RAW_BAG)
                .add(Crates.CHORUS_MUSHROOM_RAW_BAG);
        getOrCreateTagBuilder(ModTags.WILD_CROPS)
                .add(WildCrops.WILD_ALOE_VERA);
    }

}
