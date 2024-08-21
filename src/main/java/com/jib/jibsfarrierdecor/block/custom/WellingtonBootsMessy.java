package com.jib.jibsfarrierdecor.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class WellingtonBootsMessy extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public WellingtonBootsMessy(Properties pProperties) {
        super(pProperties);
    }

    private static final VoxelShape SHAPE_NORTH = Shapes.join(
            Block.box(8, 0, 9, 13, 2, 15),
            Block.box(8, 2, 10, 13, 8, 15), BooleanOp.OR);

    private static final VoxelShape SHAPE_EAST = Shapes.join(
            Block.box(1, 0, 8, 7, 2, 13),
            Block.box(1, 2, 8, 6, 8, 13), BooleanOp.OR);

    private static final VoxelShape SHAPE_SOUTH = Shapes.join(
            Block.box(3, 0, 1, 8, 2, 7),
            Block.box(3, 2, 1, 8, 8, 6), BooleanOp.OR);

    private static final VoxelShape SHAPE_WEST = Shapes.join(
            Block.box(9, 0, 3, 15, 2, 8),
            Block.box(10, 2, 3, 15, 8, 8), BooleanOp.OR);

    private static final VoxelShape SHAPE_UP = Shapes.join(
            Block.box(8, 0, 9, 13, 2, 15),
            Block.box(8, 2, 10, 13, 8, 15), BooleanOp.OR);

    private static final VoxelShape SHAPE_DOWN = Shapes.join(
            Block.box(8, 0, 9, 13, 2, 15),
            Block.box(8, 2, 10, 13, 8, 15), BooleanOp.OR);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(BlockStateProperties.FACING)) {
            case DOWN -> SHAPE_DOWN;
            case UP -> SHAPE_UP;
            case NORTH -> SHAPE_NORTH;
            case SOUTH -> SHAPE_SOUTH;
            case WEST -> SHAPE_WEST;
            case EAST -> SHAPE_EAST;
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(BlockStateProperties.FACING, context.getNearestLookingDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING);
    }
}