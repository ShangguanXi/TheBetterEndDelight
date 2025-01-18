package com.betterenddelight.registers.blocks;
import com.betterenddelight.blocks.TBEDPieBlock;
import com.betterenddelight.registers.BlockRegister;
import com.betterenddelight.registers.items.Foods;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;


public class Pies {
    public static final Block BLOSSOM_BERRY_CHEESECAKE = BlockRegister.registerWithItem("blossom_berry_cheesecake", new TBEDPieBlock(Block.Settings.copy(Blocks.CAKE), Foods.BLOSSOM_BERRY_CHEESECAKE_SLICE));
    public static final Block SHADOW_BERRY_CHEESECAKE = BlockRegister.registerWithItem("shadow_berry_cheesecake", new TBEDPieBlock(Block.Settings.copy(Blocks.CAKE), Foods.SHADOW_BERRY_CHEESECAKE_SLICE));
    public static void initialize() {

    }
}
