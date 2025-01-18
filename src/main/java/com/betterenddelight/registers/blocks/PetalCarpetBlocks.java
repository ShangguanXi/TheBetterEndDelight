package com.betterenddelight.registers.blocks;

import com.betterenddelight.blocks.PetalCarpetBlock;
import com.betterenddelight.functions.ColoredMaterial;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import org.betterx.betterend.blocks.HydraluxPetalColoredBlock;
import org.betterx.betterend.registry.EndBlocks;

import static com.betterenddelight.registers.BlockRegister.registerWithItem;


public class PetalCarpetBlocks {
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK =  registerWithItem("hydralux_petal_carpet_block", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.WHITE)));

    public static final ColoredMaterial HYDRALUX_PETAL_BLOCK_COLORED = new ColoredMaterial(PetalCarpetBlock::new, HYDRALUX_PETAL_CARPET_BLOCK);
    /*public static final Block HYDRALUX_PETAL_CARPET_BLOCK_WHITE = registerWithItem("hydralux_petal_carpet_block_white", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.WHITE)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_ORANGE = registerWithItem("hydralux_petal_carpet_block_orange", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.ORANGE)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_MAGENTA = registerWithItem("hydralux_petal_carpet_block_magenta", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.MAGENTA)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_LIGHT_BLUE = registerWithItem("hydralux_petal_carpet_block_light_blue", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.LIGHT_BLUE)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_YELLOW = registerWithItem("hydralux_petal_carpet_block_yellow", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.YELLOW)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_LIME = registerWithItem("hydralux_petal_carpet_block_lime", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.LIME)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_PINK = registerWithItem("hydralux_petal_carpet_block_pink", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.PINK)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_GRAY = registerWithItem("hydralux_petal_carpet_block_gray", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.GRAY)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_LIGHT_GRAY = registerWithItem("hydralux_petal_carpet_block_light_gray", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.LIGHT_GRAY)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_CYAN = registerWithItem("hydralux_petal_carpet_block_cyan", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.CYAN)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_PURPLE = registerWithItem("hydralux_petal_carpet_block_purple", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.PURPLE)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_BLUE = registerWithItem("hydralux_petal_carpet_block_blue", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.BLUE)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_BROWN = registerWithItem("hydralux_petal_carpet_block_brown", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.BROWN)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_GREEN = registerWithItem("hydralux_petal_carpet_block_green", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.GREEN)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_RED = registerWithItem("hydralux_petal_carpet_block_red", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.RED)));
    public static final Block HYDRALUX_PETAL_CARPET_BLOCK_BLACK = registerWithItem("hydralux_petal_carpet_block_black", new Block(Block.Settings.copy(EndBlocks.HYDRALUX_PETAL_BLOCK).mapColor(DyeColor.BLACK)));
*/

    public static void initialize() {

    }
}
