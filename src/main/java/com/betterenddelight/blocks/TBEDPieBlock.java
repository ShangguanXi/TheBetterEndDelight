package com.betterenddelight.blocks;

import com.mojang.datafixers.util.Pair;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.tag.ModTags;
import vectorwing.farmersdelight.common.utility.ItemUtils;

import java.util.function.Supplier;

public class TBEDPieBlock extends Block{
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public static final IntProperty BITES = IntProperty.of("bites", 0, 3);

    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 4.0D, 14.0D);

    public final Item pieSlice;

    public TBEDPieBlock(AbstractBlock.Settings properties, Item pieSlice) {
        super(properties);
        this.pieSlice = pieSlice;
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(BITES, 0));
    }

    public ItemStack getPieSliceItem() {
        return new ItemStack(this.pieSlice);
    }

    public int getMaxBites() {
        return 4;
    }


    public VoxelShape getOutlineShape(BlockState state, BlockView level, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }


    public BlockState getPlacementState(ItemPlacementContext context) {
        return this.getDefaultState().with(FACING, context.getHorizontalPlayerFacing());
    }


    public ActionResult onUse(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand
            hand, BlockHitResult hit) {
        ItemStack heldStack = player.getStackInHand(hand);
        if (level.isClient) {
            if (heldStack.isIn(ModTags.KNIVES)) {
                return cutSlice(level, pos, state, player);
            }

            if (this.consumeBite(level, pos, state, player) == ActionResult.SUCCESS) {
                return ActionResult.SUCCESS;
            }

            if (heldStack.isEmpty()) {
                return ActionResult.CONSUME;
            }
        }

        if (heldStack.isIn(ModTags.KNIVES)) {
            return cutSlice(level, pos, state, player);
        }
        return this.consumeBite(level, pos, state, player);
    }

    /**
     * Eats a slice from the pie, feeding the player.
     */
    protected ActionResult consumeBite(World level, BlockPos pos, BlockState state, PlayerEntity playerIn) {
        if (!playerIn.canConsume(false)) {
            return ActionResult.PASS;
        } else {
            ItemStack sliceStack = this.getPieSliceItem();
            ItemStack sliceCopy = sliceStack.copy();
            FoodComponent sliceFood = sliceStack.getItem().getFoodComponent();

            playerIn.getHungerManager().eat(sliceStack.getItem(), sliceStack);
            // Refabricated: We don't need an equivalent I think? Please complain to us Slice of Life devs if necessary.
            // ForgeEventFactory.onItemUseFinish(playerIn, sliceCopy, 0, ItemStack.EMPTY);
            if (this.getPieSliceItem().getItem().isFood() && sliceFood != null) {
                for (Pair<StatusEffectInstance, Float> pair : sliceFood.getStatusEffects()) {
                    if (!level.isClient && pair.getFirst() != null && level.random.nextFloat() < pair.getSecond()) {
                        playerIn.addStatusEffect(new StatusEffectInstance(pair.getFirst()));
                    }
                }
            }

            int bites = state.get(BITES);
            if (bites < getMaxBites() - 1) {
                level.setBlockState(pos, state.with(BITES, bites + 1), 3);
            } else {
                level.removeBlock(pos, false);
            }
            level.playSound(null, pos, SoundEvents.ENTITY_GENERIC_EAT, SoundCategory.PLAYERS, 0.8F, 0.8F);
            return ActionResult.SUCCESS;
        }
    }

    /**
     * Cuts off a bite and drops a slice item, without feeding the player.
     */
    protected ActionResult cutSlice(World level, BlockPos pos, BlockState state, PlayerEntity player) {
        int bites = state.get(BITES);
        if (bites < getMaxBites() - 1) {
            level.setBlockState(pos, state.with(BITES, bites + 1), 3);
        } else {
            level.removeBlock(pos, false);
        }

        Direction direction = player.getHorizontalFacing().getOpposite();
        ItemUtils.spawnItemEntity(level, this.getPieSliceItem(), pos.getX() + 0.5, pos.getY() + 0.3, pos.getZ() + 0.5,
                direction.getOffsetX() * 0.15, 0.05, direction.getOffsetZ() * 0.15);
        level.playSound(null, pos, SoundEvents.BLOCK_WOOL_BREAK, SoundCategory.PLAYERS, 0.8F, 0.8F);
        return ActionResult.SUCCESS;
    }


    public BlockState getStateForNeighborUpdate(BlockState stateIn, Direction facing, BlockState facingState, WorldAccess
            level, BlockPos currentPos, BlockPos facingPos) {
        return facing == Direction.DOWN && !stateIn.canPlaceAt(level, currentPos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(stateIn, facing, facingState, level, currentPos, facingPos);
    }


    public boolean canPlaceAt(BlockState state, WorldView level, BlockPos pos) {
        return level.getBlockState(pos.down()).isSolid();
    }


    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, BITES);
    }


    public int getComparatorOutput(BlockState blockState, World level, BlockPos pos) {
        return getMaxBites() - blockState.get(BITES);
    }


    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }


    public boolean canPathfindThrough(BlockState state, BlockView level, BlockPos pos, NavigationType type) {
        return false;
    }
}
