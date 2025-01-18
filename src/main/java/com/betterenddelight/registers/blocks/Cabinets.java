package com.betterenddelight.registers.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import vectorwing.farmersdelight.common.block.CabinetBlock;

import static com.betterenddelight.registers.BlockRegister.registerWithItem;

public class Cabinets {
    public static final Block DRAGON_TREE_CABINET = registerWithItem("dragon_tree_cabinet", new CabinetBlock(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block END_LOTUS_CABINET = registerWithItem("end_lotus_cabinet", new CabinetBlock(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block HELIX_TREE_CABINET = registerWithItem("helix_tree_cabinet", new CabinetBlock(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block JELLYSHROOM_CABINET = registerWithItem("jellyshroom_cabinet", new CabinetBlock(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LACUGROVE_CABINET = registerWithItem("lacugrove_cabinet", new CabinetBlock(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block LUCERNIA_CABINET = registerWithItem("lucernia_cabinet", new CabinetBlock(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block MOSSY_GLOWSHROOM_CABINET = registerWithItem("mossy_glowshroom_cabinet", new CabinetBlock(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block TENANEA_CABINET = registerWithItem("tenanea_cabinet", new CabinetBlock(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block PYTHADENDRON_CABINET = registerWithItem("pythadendron_cabinet", new CabinetBlock(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block UMBRELLA_TREE_CABINET = registerWithItem("umbrella_tree_cabinet", new CabinetBlock(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    public static void initialize() {

    }
}
