package net.ghfstudios.pepro.block.machines;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ghfstudios.pepro.block.PeproBlock;
import net.ghfstudios.pepro.block.PeproBlockWithEntity;
import net.ghfstudios.pepro.block.entity.PeproBlockEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */

//Todo: Create MachineBlock Children's' BlockEntities
public abstract class MachineBlock extends PeproBlockWithEntity {
    protected MachineBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return super.getTicker(world, state, type);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        BlockPos remotePos;
        BlockEntity localBlockEntity;
        BlockEntity remoteBlockEntity;
        BlockEntityType<?> localBlockEntityType = PeproBlockEntities.CONDUIT_BLOCK_ENTITY;
        BlockEntityType<?> remoteBlockEntityType;

        remotePos = pos.add(0, 0, -1);  //NORTH
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (localBlockEntityType.equals(remoteBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.SOUTH, true));
            }
        }

        remotePos = pos.add(1, 0, 0);  //EAST
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (localBlockEntityType.equals(remoteBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.WEST, true));
            }
        }

        remotePos = pos.add(0, 0, 1);  //SOUTH
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (localBlockEntityType.equals(remoteBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.NORTH, true));
            }
        }

        remotePos = pos.add(-1, 0, 0);  //WEST
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (localBlockEntityType.equals(remoteBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.EAST, true));
            }
        }

        remotePos = pos.add(0, 1, 0);  //UP
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (localBlockEntityType.equals(remoteBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.DOWN, true));
            }
        }

        remotePos = pos.add(0, -1, 0);  //DOWN
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (localBlockEntityType.equals(remoteBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.UP, true));
            }
        }
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);

        BlockPos remotePos;
        BlockEntity localBlockEntity;
        BlockEntity remoteBlockEntity;
        BlockEntityType<?> remoteBlockEntityType;
        BlockEntityType<?> localBlockEntityType = PeproBlockEntities.CONDUIT_BLOCK_ENTITY;

        remotePos = pos.add(0, 0, -1);  //NORTH
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (remoteBlockEntityType.equals(localBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.SOUTH, false));
            }
        }

        remotePos = pos.add(1, 0, 0);  //EAST
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (remoteBlockEntityType.equals(localBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.WEST, false));
            }
        }

        remotePos = pos.add(0, 0, 1);  //SOUTH
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (remoteBlockEntityType.equals(localBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.NORTH, false));
            }
        }

        remotePos = pos.add(-1, 0, 0);  //WEST
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (remoteBlockEntityType.equals(localBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.EAST, false));
            }
        }

        remotePos = pos.add(0, 1, 0);  //UP
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (remoteBlockEntityType.equals(localBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.DOWN, false));
            }
        }

        remotePos = pos.add(0, -1, 0);  //DOWN
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (remoteBlockEntityType.equals(localBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.UP, false));
            }
        }
    }
}
