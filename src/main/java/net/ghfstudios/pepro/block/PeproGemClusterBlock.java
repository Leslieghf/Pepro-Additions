package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class PeproGemClusterBlock extends PeproGemBlock implements Waterloggable {

    private final UniformIntProvider experienceDropped;

    public static final BooleanProperty WATERLOGGED;
    public static final DirectionProperty FACING;
    protected final VoxelShape NORTH_SHAPE;
    protected final VoxelShape SOUTH_SHAPE;
    protected final VoxelShape EAST_SHAPE;
    protected final VoxelShape WEST_SHAPE;
    protected final VoxelShape UP_SHAPE;
    protected final VoxelShape DOWN_SHAPE;

    @Override @SuppressWarnings("deprecation")
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            int i = this.experienceDropped.get(world.random);
            if (i > 0) {
                this.dropExperience(world, pos, i);
            }
        }

    }

    public PeproGemClusterBlock(int i, int j, FabricBlockSettings settings) {
        this(i, j, settings, UniformIntProvider.create(0, 0));
        BlockRenderLayerMap.INSTANCE.putBlock(this, RenderLayer.getCutout());
    }

    public PeproGemClusterBlock(int i, int j, FabricBlockSettings settings, UniformIntProvider uniformIntProvider) {
        super(settings);
        BlockRenderLayerMap.INSTANCE.putBlock(this, RenderLayer.getCutout());
        this.experienceDropped = uniformIntProvider;

        this.setDefaultState(this.getDefaultState().with(WATERLOGGED, false).with(FACING, Direction.UP));
        this.UP_SHAPE = Block.createCuboidShape(j, 0.0D, j, 16 - j, i, 16 - j);
        this.DOWN_SHAPE = Block.createCuboidShape(j, 16 - i, j, 16 - j, 16.0D, 16 - j);
        this.NORTH_SHAPE = Block.createCuboidShape(j, j, 16 - i, 16 - j, 16 - j, 16.0D);
        this.SOUTH_SHAPE = Block.createCuboidShape(j, j, 0.0D, 16 - j, 16 - j, i);
        this.EAST_SHAPE = Block.createCuboidShape(0.0D, j, j, i, 16 - j, 16 - j);
        this.WEST_SHAPE = Block.createCuboidShape(16 - i, j, j, 16.0D, 16 - j, 16 - j);
    }


    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        switch(direction) {
            case NORTH:
                return this.NORTH_SHAPE;
            case SOUTH:
                return this.SOUTH_SHAPE;
            case EAST:
                return this.EAST_SHAPE;
            case WEST:
                return this.WEST_SHAPE;
            case DOWN:
                return this.DOWN_SHAPE;
            case UP:
            default:
                return this.UP_SHAPE;
        }
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = state.get(FACING);
        BlockPos blockPos = pos.offset(direction.getOpposite());
        return world.getBlockState(blockPos).isSideSolidFullSquare(world, blockPos, direction);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.getFluidTickScheduler().schedule(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return direction == state.get(FACING).getOpposite() && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        WorldAccess worldAccess = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        return this.getDefaultState().with(WATERLOGGED, worldAccess.getFluidState(blockPos).getFluid() == Fluids.WATER).with(FACING, ctx.getSide());
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, FACING);
    }

    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.DESTROY;
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
        FACING = Properties.FACING;
    }
}
