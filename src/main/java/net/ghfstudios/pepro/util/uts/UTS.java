package net.ghfstudios.pepro.util.uts;

import net.ghfstudios.pepro.block.entity.PeproBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */

//Main Util Class of Leslieghf's Universal Transport System
public class UTS {
    public static BlockEntity getBlockEntity(World world, BlockPos pos) {
        return world.getBlockEntity(pos);
    }

    public static BlockState getBlockState(World world, BlockPos pos) {
        return world.getBlockState(pos);
    }

    //Todo: return BlockPos[] consumers, int distance, float maxTransferVelocity, float maxTransferCapacity as new (record) util class UTSConsumer
    public static UTSConsumer[] getConnectedConsumers(World world, BlockPos pos) {
        return new UTSConsumer[]{new UTSConsumer(pos.add(0, 1, 0), 1, 230, 15)};
    }

    private boolean typeComparator() {
        return false;
    }
}
