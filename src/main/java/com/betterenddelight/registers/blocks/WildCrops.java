package com.betterenddelight.registers.blocks;

import com.betterenddelight.registers.BlockRegister;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import org.betterx.betterend.effects.EndStatusEffects;
import vectorwing.farmersdelight.common.block.WildCropBlock;

public class WildCrops {
    public static Block WILD_ALOE_VERA = BlockRegister.registerWithItem("wild_aloe_vera", new WildCropBlock(EndStatusEffects.END_VEIL, 6,AbstractBlock.Settings.copy(Blocks.TALL_GRASS)));
    public static void initialize() {

    }
}
