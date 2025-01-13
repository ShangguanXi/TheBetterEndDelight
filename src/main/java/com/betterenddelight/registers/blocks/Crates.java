package com.betterenddelight.registers.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;

import static com.betterenddelight.registers.BlockRegister.registerWithItem;

public class Crates {
    public static final Block SHADOW_BERRY_CRATE = registerWithItem("shadow_berry_crate", new Block(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLOSSOM_BERRY_CRATE = registerWithItem("blossom_berry_crate", new Block(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static void initialize() {

    }
}
