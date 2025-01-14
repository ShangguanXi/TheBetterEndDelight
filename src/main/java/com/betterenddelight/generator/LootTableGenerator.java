package com.betterenddelight.generator;

import com.betterenddelight.registers.blocks.Crates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    protected LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(Crates.SHADOW_BERRY_CRATE);
        addDrop(Crates.BLOSSOM_BERRY_CRATE);
    }
}
