package com.jib.jibsfarrierdecor.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class HangingHorseshoesGreen extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public HangingHorseshoesGreen(Properties pProperties) {
        super(pProperties);
    }

    private static final VoxelShape SHAPE_NORTH = Stream.of(
            Block.box(4, 8, 15, 5, 11, 16),
            Block.box(6, 8, 15, 7, 11, 16),
            Block.box(5, 8, 15, 6, 9, 16),
            Block.box(11, 6, 15, 12, 9, 16),
            Block.box(9, 6, 15, 10, 9, 16),
            Block.box(10, 6, 15, 11, 7, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_EAST = Stream.of(
            Block.box(0, 8, 4, 1, 11, 5),
            Block.box(0, 8, 6, 1, 11, 7),
            Block.box(0, 8, 5, 1, 9, 6),
            Block.box(0, 6, 11, 1, 9, 12),
            Block.box(0, 6, 9, 1, 9, 10),
            Block.box(0, 6, 10, 1, 7, 11)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_SOUTH = Stream.of(
            Block.box(11, 8, 0, 12, 11, 1),
            Block.box(9, 8, 0, 10, 11, 1),
            Block.box(10, 8, 0, 11, 9, 1),
            Block.box(4, 6, 0, 5, 9, 1),
            Block.box(6, 6, 0, 7, 9, 1),
            Block.box(5, 6, 0, 6, 7, 1)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_WEST = Stream.of(
            Block.box(15, 8, 11, 16, 11, 12),
            Block.box(15, 8, 9, 16, 11, 10),
            Block.box(15, 8, 10, 16, 9, 11),
            Block.box(15, 6, 4, 16, 9, 5),
            Block.box(15, 6, 6, 16, 9, 7),
            Block.box(15, 6, 5, 16, 7, 6)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_UP = Stream.of(
            Block.box(4, 0, 8, 5, 1, 11),
            Block.box(6, 0, 8, 7, 1, 11),
            Block.box(5, 0, 8, 6, 1, 9),
            Block.box(11, 0, 6, 12, 1, 9),
            Block.box(9, 0, 6, 10, 1, 9),
            Block.box(10, 0, 6, 11, 1, 7)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_DOWN = Stream.of(
            Block.box(4, 15, 5, 5, 16, 8),
            Block.box(6, 15, 5, 7, 16, 8),
            Block.box(5, 15, 7, 6, 16, 8),
            Block.box(11, 15, 7, 12, 16, 10),
            Block.box(9, 15, 7, 10, 16, 10),
            Block.box(10, 15, 9, 11, 16, 10)
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

