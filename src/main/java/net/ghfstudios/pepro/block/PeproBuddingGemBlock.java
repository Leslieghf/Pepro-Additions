package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ghfstudios.pepro.util.PeproLogger;
import net.ghfstudios.pepro.util.exception.PeproRuntimeException;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.Random;

public class PeproBuddingGemBlock extends PeproGemBlock{
    public static final int GROW_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public PeproBuddingGemBlock(FabricBlockSettings settings) {
        super(settings);
    }

    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.DESTROY;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            PeproBlock smallBudType = null;
            PeproBlock mediumBudType = null;
            PeproBlock largeBudType = null;
            PeproBlock clusterType = null;
            if (PeproBlocks.BUDDING_AQUAMARINE.equals(this)) {
                smallBudType = PeproBlocks.SMALL_AQUAMARINE_BUD;
                mediumBudType = PeproBlocks.MEDIUM_AQUAMARINE_BUD;
                largeBudType = PeproBlocks.LARGE_AQUAMARINE_BUD;
                clusterType = PeproBlocks.AQUAMARINE_CLUSTER;
            } else if (PeproBlocks.BUDDING_CITRINE.equals(this)) {
                smallBudType = PeproBlocks.SMALL_CITRINE_BUD;
                mediumBudType = PeproBlocks.MEDIUM_CITRINE_BUD;
                largeBudType = PeproBlocks.LARGE_CITRINE_BUD;
                clusterType = PeproBlocks.CITRINE_CLUSTER;
            } else if (PeproBlocks.BUDDING_GARNET.equals(this)) {
                smallBudType = PeproBlocks.SMALL_GARNET_BUD;
                mediumBudType = PeproBlocks.MEDIUM_GARNET_BUD;
                largeBudType = PeproBlocks.LARGE_GARNET_BUD;
                clusterType = PeproBlocks.GARNET_CLUSTER;
            } else if (PeproBlocks.BUDDING_OPAL.equals(this)) {
                smallBudType = PeproBlocks.SMALL_OPAL_BUD;
                mediumBudType = PeproBlocks.MEDIUM_OPAL_BUD;
                largeBudType = PeproBlocks.LARGE_OPAL_BUD;
                clusterType = PeproBlocks.OPAL_CLUSTER;
            } else if (PeproBlocks.BUDDING_PERIDOT.equals(this)) {
                smallBudType = PeproBlocks.SMALL_PERIDOT_BUD;
                mediumBudType = PeproBlocks.MEDIUM_PERIDOT_BUD;
                largeBudType = PeproBlocks.LARGE_PERIDOT_BUD;
                clusterType = PeproBlocks.PERIDOT_CLUSTER;
            } else if (PeproBlocks.BUDDING_RUBY.equals(this)) {
                smallBudType = PeproBlocks.SMALL_RUBY_BUD;
                mediumBudType = PeproBlocks.MEDIUM_RUBY_BUD;
                largeBudType = PeproBlocks.LARGE_RUBY_BUD;
                clusterType = PeproBlocks.RUBY_CLUSTER;
            } else if (PeproBlocks.BUDDING_SAPPHIRE.equals(this)) {
                smallBudType = PeproBlocks.SMALL_SAPPHIRE_BUD;
                mediumBudType = PeproBlocks.MEDIUM_SAPPHIRE_BUD;
                largeBudType = PeproBlocks.LARGE_SAPPHIRE_BUD;
                clusterType = PeproBlocks.SAPPHIRE_CLUSTER;
            } else if (PeproBlocks.BUDDING_TOPAZ.equals(this)) {
                smallBudType = PeproBlocks.SMALL_TOPAZ_BUD;
                mediumBudType = PeproBlocks.MEDIUM_TOPAZ_BUD;
                largeBudType = PeproBlocks.LARGE_TOPAZ_BUD;
                clusterType = PeproBlocks.TOPAZ_CLUSTER;
            } else if (PeproBlocks.BUDDING_ZIRCON.equals(this)) {
                smallBudType = PeproBlocks.SMALL_ZIRCON_BUD;
                mediumBudType = PeproBlocks.MEDIUM_ZIRCON_BUD;
                largeBudType = PeproBlocks.LARGE_ZIRCON_BUD;
                clusterType = PeproBlocks.ZIRCON_CLUSTER;
            } else {
                try {
                    throw new PeproRuntimeException("@" + this.getName() + ": Random ticked on budding gem block, but that block is not registered as a valid budding gem block");
                } catch (PeproRuntimeException e) {
                    PeproLogger.Log(e.getLocalizedMessage());
                    e.printStackTrace();
                }
            }

            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = world.getBlockState(blockPos);
            Block block = null;
            if (canGrowIn(blockState)) {
                block = smallBudType;
            } else if (blockState.isOf(smallBudType) && blockState.get(AmethystClusterBlock.FACING) == direction) {
                block = mediumBudType;
            } else if (blockState.isOf(mediumBudType) && blockState.get(AmethystClusterBlock.FACING) == direction) {
                block = largeBudType;
            } else if (blockState.isOf(largeBudType) && blockState.get(AmethystClusterBlock.FACING) == direction) {
                block = clusterType;
            }

            if (block != null) {
                BlockState blockState2 = (BlockState)((BlockState)block.getDefaultState().with(AmethystClusterBlock.FACING, direction)).with(AmethystClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
                world.setBlockState(blockPos, blockState2);
            }

        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }
}
