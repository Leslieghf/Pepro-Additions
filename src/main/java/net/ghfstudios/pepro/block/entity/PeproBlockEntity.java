package net.ghfstudios.pepro.block.entity;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public abstract class PeproBlockEntity extends BlockEntity {

    public PeproBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public NbtCompound writeNbt(NbtCompound tag) {
        return null;
    }

    public void readNbt(NbtCompound tag) {
    }

    public void update() {
    }
}
