package com.betterenddelight.registers.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;

import static com.betterenddelight.registers.BlockRegister.registerWithItem;

public class Crates {
    public static final Block SHADOW_BERRY_CRATE = registerWithItem("shadow_berry_crate", new Block(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block BLOSSOM_BERRY_CRATE = registerWithItem("blossom_berry_crate", new Block(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LUMECORN_ROD_CRATE = registerWithItem("lumecorn_rod_crate", new Block(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static  final Block HYDRALUX_PETAL_BAG = registerWithItem("hydralux_petal_bag", new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static  final Block AMBER_ROOT_RAW_BAG = registerWithItem("amber_root_raw_bag", new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
    public static  final Block CHORUS_MUSHROOM_RAW_BAG = registerWithItem("chorus_mushroom_raw_bag", new Block(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

    public static void initialize() {

    }
}
