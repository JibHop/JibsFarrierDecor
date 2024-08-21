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

public class WellingtonBootsNeat extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public WellingtonBootsNeat(Properties pProperties) {
        super(pProperties);
    }

    private static final VoxelShape SHAPE_NORTH = Stream.of(
            Block.box(9, 2, 10, 14, 8, 15),
            Block.box(9, 0, 9, 14, 2, 15),
            Block.box(2, 0, 9, 7, 2, 15),
            Block.box(2, 2, 10, 7, 8, 15)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_EAST = Stream.of(
            Block.box(1, 2, 9, 6, 8, 14),
            Block.box(1, 0, 9, 7, 2, 14),
            Block.box(1, 0, 2, 7, 2, 7),
            Block.box(1, 2, 2, 6, 8, 7)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_SOUTH = Stream.of(
            Block.box(2, 2, 1, 7, 8, 6),
            Block.box(2, 0, 1, 7, 2, 7),
            Block.box(9, 0, 1, 14, 2, 7),
            Block.box(9, 2, 1, 14, 8, 6)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_WEST = Stream.of(
            Block.box(10, 2, 2, 15, 8, 7),
            Block.box(9, 0, 2, 15, 2, 7),
            Block.box(9, 0, 9, 15, 2, 14),
            Block.box(10, 2, 9, 15, 8, 14)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_UP = Stream.of(
            Block.box(9, 2, 10, 14, 8, 15),
            Block.box(9, 0, 9, 14, 2, 15),
            Block.box(2, 0, 9, 7, 2, 15),
            Block.box(2, 2, 10, 7, 8, 15)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_DOWN = Stream.of(
            Block.box(9, 2, 10, 14, 8, 15),
            Block.box(9, 0, 9, 14, 2, 15),
            Block.box(2, 0, 9, 7, 2, 15),
            Block.box(2, 2, 10, 7, 8, 15)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

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