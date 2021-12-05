package net.ghfstudios.pepro.block.entity;

import net.ghfstudios.pepro.block.uts.UTSType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public abstract class UTSBlockEntity extends PeproBlockEntity {
    public int[] transferTypes;

    public UTSBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState, int[] utsTypes) {
        super(blockEntityType, blockPos, blockState);
        transferTypes = utsTypes;
    }

    @Override
    public NbtCompound writeNbt(NbtCompound tag) {
        super.writeNbt(tag);
        return tag;
    }

    @Override
    public void readNbt(NbtCompound tag) {
        super.readNbt(tag);
    }

    @Override
    public abstract void update();

    public boolean isOfType(UTSType type) {
        for (int i = 0; i < transferTypes.length; i++) {
            if (transferTypes[i]==type.value) return true;
        }
        return false;
    }
}
