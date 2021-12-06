package net.ghfstudios.pepro.block.entity;

import net.ghfstudios.pepro.util.uts.UTSType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public abstract class UTSTraderBlockEntity extends UTSBlockEntity{
    public UTSTraderBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState, new int[]{UTSType.TRADER.value});
    }

    @Override
    public abstract void update();
}
