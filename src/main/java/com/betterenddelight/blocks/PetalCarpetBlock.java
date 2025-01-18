package com.betterenddelight.blocks;

import com.betterenddelight.BetterEndDelight;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.betterx.bclib.client.models.BasePatterns;
import org.betterx.bclib.client.models.ModelsHelper;
import org.betterx.bclib.client.models.PatternsHelper;
import org.betterx.betterend.BetterEnd;
import org.betterx.betterend.blocks.HydraluxPetalColoredBlock;
import org.betterx.betterend.client.models.Patterns;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

import static org.betterx.bclib.client.models.PatternsHelper.createJson;

public class PetalCarpetBlock extends HydraluxPetalColoredBlock {
    public PetalCarpetBlock(FabricBlockSettings settings) {
        super(settings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return !world.isAir(pos.down());
    }
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

    @Environment(EnvType.CLIENT)
    public @Nullable JsonUnbakedModel getBlockModel(Identifier resourceLocation, BlockState blockState) {
        String path = "betterenddelight:block/petal_carpet_colored";
        Optional<String> pattern = Patterns.createJson(BetterEndDelight.makeId("models/block/petal_carpet_colored.json"), path,path);
        return ModelsHelper.fromPattern(pattern);
    }
}
