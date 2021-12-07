package net.ghfstudios.pepro.block.conduit;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ghfstudios.pepro.block.PeproBlockWithEntity;
import net.ghfstudios.pepro.block.entity.ConduitBlockEntity;
import net.ghfstudios.pepro.block.entity.PeproBlockEntities;
import net.ghfstudios.pepro.block.entity.UTSBlockEntity;
import net.ghfstudios.pepro.block.entity.UTSConsumerBlockEntity;
import net.ghfstudios.pepro.util.uts.UTS;
import net.ghfstudios.pepro.util.uts.UTSType;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
//Todo: Move Blockstate Cases to ConduitBlock code: Set the DirectionProperty via code, DirectionProperty only directly controls model application, basically blockstate.json as model interface for BLock class
public class ConduitBlock extends PeproBlockWithEntity implements BlockEntityProvider {
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

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getEquippedStack(EquipmentSlot.MAINHAND).isOf(Items.REDSTONE) && hand.equals(Hand.MAIN_HAND)) {
            sendCharge(state, world, pos, player, hand, hit, 1024);
            return ActionResult.CONSUME;
        }
        return ActionResult.FAIL;
    }

    private void sendCharge(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit, int charge) {
        BlockPos nearestConsumerPos = UTS.getConnectedConsumers(world, pos)[0].position;  //NORTH
        //BlockPos nearestConsumerPos = pos.add(0, 1, 0);
        System.out.println("Checking for consumer @ " + nearestConsumerPos);
        BlockEntity consumer = UTS.getBlockEntity(world, nearestConsumerPos);
        ((UTSConsumerBlockEntity) consumer).electricCharge += charge;
        ((UTSBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).update();
    }

    //Todo: Fix MachineBlock blockstate thingy property, maybe rollback to previous commit
    //Todo: Generify getNearestConsumer to getNearestUTSBlockEntity(transmissionType parameter, default to UTSType.TRADER)
    private BlockPos getNearestConsumer(BlockState state, World world, BlockPos pos, float linkMaxVelocity, float linkMaxCapacity) {
        if (UTS.getBlockEntity(world, pos) instanceof UTSBlockEntity) {
            System.out.println("Found UTS Block @ " + pos);
            if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).isOfType(UTSType.TRADER)) {
                //Todo: Fix cardinal dir cases, case wrap is *presumably* functional
                if (world.getBlockState(pos).get(Properties.NORTH)) {
                    //Todo: encapsulate block in "if (UTS.getBlockEntity(world, pos) instanceof UTSBlockEntity)"
                    if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferVelocity < linkMaxVelocity) {
                        linkMaxVelocity = ((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferVelocity;
                    }
                    if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferCapacity < linkMaxCapacity) {
                        linkMaxCapacity = ((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferCapacity;
                    }
                    BlockPos temp = getNearestConsumer(state, world, pos.add(0, 0, -1), linkMaxVelocity, linkMaxCapacity);
                    if (temp == null) {
                        System.out.println("HIT DEAD END AT " + pos);
                        return null;
                    }
                    return temp;
                } else if (world.getBlockState(pos).get(Properties.EAST)) {
                    if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferVelocity < linkMaxVelocity) {
                        linkMaxVelocity = ((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferVelocity;
                    }
                    if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferCapacity < linkMaxCapacity) {
                        linkMaxCapacity = ((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferCapacity;
                    }
                    BlockPos temp = getNearestConsumer(state, world, pos.add(1, 0, 0), linkMaxVelocity, linkMaxCapacity);
                    if (temp == null) {
                        System.out.println("HIT DEAD END AT " + pos);
                        return null;
                    }
                    return temp;
                } else if (world.getBlockState(pos).get(Properties.SOUTH)) {
                    if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferVelocity < linkMaxVelocity) {
                        linkMaxVelocity = ((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferVelocity;
                    }
                    if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferCapacity < linkMaxCapacity) {
                        linkMaxCapacity = ((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferCapacity;
                    }
                    BlockPos temp = getNearestConsumer(state, world, pos.add(0, 0, 1), linkMaxVelocity, linkMaxCapacity);
                    if (temp == null) {
                        System.out.println("HIT DEAD END AT " + pos);
                        return null;
                    }
                    return temp;
                } else if (world.getBlockState(pos).get(Properties.WEST)) {
                    if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferVelocity < linkMaxVelocity) {
                        linkMaxVelocity = ((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferVelocity;
                    }
                    if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferCapacity < linkMaxCapacity) {
                        linkMaxCapacity = ((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferCapacity;
                    }
                    BlockPos temp = getNearestConsumer(state, world, pos.add(-1, 0, 0), linkMaxVelocity, linkMaxCapacity);
                    if (temp == null) {
                        System.out.println("HIT DEAD END AT " + pos);
                        return null;
                    }
                    return temp;
                } else if (world.getBlockState(pos).get(Properties.UP)) {
                    if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferVelocity < linkMaxVelocity) {
                        linkMaxVelocity = ((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferVelocity;
                    }
                    if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferCapacity < linkMaxCapacity) {
                        linkMaxCapacity = ((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferCapacity;
                    }
                    BlockPos temp = getNearestConsumer(state, world, pos.add(0, 1, 0), linkMaxVelocity, linkMaxCapacity);
                    if (temp == null) {
                        System.out.println("HIT DEAD END AT " + pos);
                        return null;
                    }
                    return temp;
                } else if (world.getBlockState(pos).get(Properties.DOWN)) {
                    if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferVelocity < linkMaxVelocity) {
                        linkMaxVelocity = ((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferVelocity;
                    }
                    if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferCapacity < linkMaxCapacity) {
                        linkMaxCapacity = ((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).transferCapacity;
                    }
                    BlockPos temp = getNearestConsumer(state, world, pos.add(0, -1, 0), linkMaxVelocity, linkMaxCapacity);
                    if (temp == null) {
                        System.out.println("HIT DEAD END AT " + pos);
                        return null;
                    }
                    //Todo: Fix StackOverflow(Right-Click Redstone on Conduit, should show some Debug Logs and transfer Electric Charge) with Debug Mode and Breakpoints
                    return temp;
                }
            }

            if (((ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos))).isOfType(UTSType.CONSUMER)) {
                System.out.println("FOUND CONSUMER AT " + pos.toString());
                return pos;
            }
        }
        return null;
    }

    private ConduitBlockEntity getBlockEntity(World world, BlockPos pos) {
        return (ConduitBlockEntity) Objects.requireNonNull(world.getBlockEntity(pos));
    }


    //Todo: Add beacon Beam as "conduit beam" inside conduit, Beacons as transmitters, Something else as receiver
}
