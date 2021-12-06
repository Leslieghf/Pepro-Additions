package net.ghfstudios.pepro.block.entity;

import net.ghfstudios.pepro.util.uts.UTSType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public abstract class UTSConsumerBlockEntity extends UTSBlockEntity{
    public float electricCharge = 0.0f;

    public UTSConsumerBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState, new int[]{UTSType.CONSUMER.value});
    }

    @Override
    public NbtCompound writeNbt(NbtCompound tag) {
        super.writeNbt(tag);
        tag.putFloat("electricCharge", electricCharge);
        return tag;
    }

    @Override
    public void readNbt(NbtCompound tag) {
        super.readNbt(tag);
        this.electricCharge = tag.getFloat("electricCharge");
    }

    @Override
    public void update() {

    }
}
