package com.betterenddelight.blocks;

import com.betterenddelight.registers.TagRegister;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.betterx.betterend.registry.EndBlocks;
import org.betterx.betterend.registry.EndTags;
import vectorwing.farmersdelight.common.block.WildCropBlock;

public class AloeVera extends WildCropBlock {
    public AloeVera(StatusEffect suspiciousStewEffect, int effectDuration, Settings properties) {
        super(suspiciousStewEffect, effectDuration, properties);
    }
    @Override
    public boolean canPlantOnTop(BlockState state, BlockView level, BlockPos pos) {
        return state.isIn(BlockTags.DIRT) || state.isIn(BlockTags.SAND) || state.isIn(TagRegister.ALOE_VERA_CAN_PLANT);
    }
}
