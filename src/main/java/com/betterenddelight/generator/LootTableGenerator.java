package com.betterenddelight.generator;

import com.betterenddelight.registers.blocks.Cabinets;
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
        addDrop(Crates.LUMECORN_ROD_CRATE);
        addDrop(Crates.HYDRALUX_PETAL_BAG);
        addDrop(Crates.AMBER_ROOT_RAW_BAG);
        addDrop(Crates.CHORUS_MUSHROOM_RAW_BAG);
        addDrop(Cabinets.DRAGON_TREE_CABINET);
        addDrop(Cabinets.END_LOTUS_CABINET);
        addDrop(Cabinets.HELIX_TREE_CABINET);
        addDrop(Cabinets.JELLYSHROOM_CABINET);
        addDrop(Cabinets.LACUGROVE_CABINET);
        addDrop(Cabinets.LUCERNIA_CABINET);
        addDrop(Cabinets.MOSSY_GLOWSHROOM_CABINET);
        addDrop(Cabinets.TENANEA_CABINET);
        addDrop(Cabinets.PYTHADENDRON_CABINET);
        addDrop(Cabinets.UMBRELLA_TREE_CABINET);

    }
}
