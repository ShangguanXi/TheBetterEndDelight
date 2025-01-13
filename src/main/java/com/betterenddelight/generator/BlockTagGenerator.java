package com.betterenddelight.generator;

import com.betterenddelight.registers.blocks.Crates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import vectorwing.farmersdelight.common.tag.CompatibilityTags;

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
    }

    private void BetterEndDelightTags() {
    }

    private void MinecraftTags() {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(Crates.BLOSSOM_BERRY_CRATE)
                .add(Crates.SHADOW_BERRY_CRATE);
    }

    private void CommonTags() {
    }

}
