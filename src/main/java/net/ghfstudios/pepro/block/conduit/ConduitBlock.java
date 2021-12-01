package net.ghfstudios.pepro.block.conduit;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ghfstudios.pepro.block.entity.ConduitBlockEntity;
import net.ghfstudios.pepro.block.entity.PeproBlockEntities;
import net.minecraft.block.*;
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
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
//Todo: Move Blockstate Cases to ConduitBlock code
public class ConduitBlock extends BlockWithEntity implements BlockEntityProvider {
    public ConduitBlock(FabricBlockSettings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ConduitBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        // With inheriting from BlockWithEntity this defaults to INVISIBLE, so we need to change that!
        return BlockRenderType.MODEL;
    }
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, PeproBlockEntities.CONDUIT_BLOCK_ENTITY, ConduitBlockEntity::tick);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        super.appendProperties(stateManager);
        stateManager.add(Properties.HORIZONTAL_FACING);
        stateManager.add(Properties.NORTH);
        stateManager.add(Properties.EAST);
        stateManager.add(Properties.SOUTH);
        stateManager.add(Properties.WEST);
        stateManager.add(Properties.UP);
        stateManager.add(Properties.DOWN);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState()
                .with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite())
                .with(Properties.NORTH, false)
                .with(Properties.EAST, false)
                .with(Properties.SOUTH, false)
                .with(Properties.WEST, false)
                .with(Properties.UP, false)
                .with(Properties.DOWN, false);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        BlockPos remotePos;
        BlockEntity localBlockEntity;
        BlockEntity remoteBlockEntity;
        BlockEntityType<?> localBlockEntityType;
        BlockEntityType<?> remoteBlockEntityType;
        
        remotePos = pos.add(0, 0, -1);  //NORTH
        localBlockEntity = world.getBlockEntity(pos);
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            localBlockEntityType = localBlockEntity.getType();
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (localBlockEntityType.equals(remoteBlockEntityType)) {
                world.setBlockState(pos, world.getBlockState(pos).with(Properties.NORTH, true));
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.SOUTH, true));
            }
        }

        remotePos = pos.add(1, 0, 0);  //EAST
        localBlockEntity = world.getBlockEntity(pos);
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            localBlockEntityType = localBlockEntity.getType();
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (localBlockEntityType.equals(remoteBlockEntityType)) {
                world.setBlockState(pos, world.getBlockState(pos).with(Properties.EAST, true));
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.WEST, true));
            }
        }

        remotePos = pos.add(0, 0, 1);  //SOUTH
        localBlockEntity = world.getBlockEntity(pos);
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            localBlockEntityType = localBlockEntity.getType();
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (localBlockEntityType.equals(remoteBlockEntityType)) {
                world.setBlockState(pos, world.getBlockState(pos).with(Properties.SOUTH, true));
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.NORTH, true));
            }
        }

        remotePos = pos.add(-1, 0, 0);  //WEST
        localBlockEntity = world.getBlockEntity(pos);
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            localBlockEntityType = localBlockEntity.getType();
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (localBlockEntityType.equals(remoteBlockEntityType)) {
                world.setBlockState(pos, world.getBlockState(pos).with(Properties.WEST, true));
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.EAST, true));
            }
        }

        remotePos = pos.add(0, 1, 0);  //UP
        localBlockEntity = world.getBlockEntity(pos);
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            localBlockEntityType = localBlockEntity.getType();
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (localBlockEntityType.equals(remoteBlockEntityType)) {
                world.setBlockState(pos, world.getBlockState(pos).with(Properties.UP, true));
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.DOWN, true));
            }
        }

        remotePos = pos.add(0, -1, 0);  //DOWN
        localBlockEntity = world.getBlockEntity(pos);
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            localBlockEntityType = localBlockEntity.getType();
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (localBlockEntityType.equals(remoteBlockEntityType)) {
                world.setBlockState(pos, world.getBlockState(pos).with(Properties.DOWN, true));
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.UP, true));
            }
        }
    }
    
    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        //Todo: Fix this shit
        super.onBreak(world, pos, state, player);

        BlockPos remotePos;
        BlockEntity localBlockEntity;
        BlockEntity remoteBlockEntity;
        BlockEntityType<?> remoteBlockEntityType;
        BlockEntityType<?> localBlockEntityType = world.getBlockEntity(pos).getType();

        remotePos = pos.add(0, 0, -1);  //NORTH
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (remoteBlockEntityType.equals(localBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.SOUTH, true));
            }
        }

        remotePos = pos.add(1, 0, 0);  //EAST
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (remoteBlockEntityType.equals(localBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.WEST, true));
            }
        }

        remotePos = pos.add(0, 0, 1);  //SOUTH
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (remoteBlockEntityType.equals(localBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.NORTH, true));
            }
        }

        remotePos = pos.add(-1, 0, 0);  //WEST
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (remoteBlockEntityType.equals(localBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.EAST, true));
            }
        }

        remotePos = pos.add(0, 1, 0);  //UP
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (remoteBlockEntityType.equals(localBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.DOWN, true));
            }
        }

        remotePos = pos.add(0, -1, 0);  //DOWN
        remoteBlockEntity = world.getBlockEntity(remotePos);
        if ( remoteBlockEntity !=null) {
            remoteBlockEntityType = remoteBlockEntity.getType();
            if (remoteBlockEntityType.equals(localBlockEntityType)) {
                world.setBlockState(remotePos, world.getBlockState(remotePos).with(Properties.UP, true));
            }
        }
    }


    //Todo: Add beacon Beam as "conduit beam" inside conduit, Beacons as transmitters, Something else as receiver
}
