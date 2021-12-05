package net.ghfstudios.pepro.block.entity;

import net.ghfstudios.pepro.block.uts.UTSType;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class ConduitBlockEntity extends UTSTraderBlockEntity {

    // Store the current value of the number
    public float transferVelocity = 230.0f;           //Volt
    public float transferCapacity = 16.0f;    //Amps


    public ConduitBlockEntity(BlockPos pos, BlockState state) {
        super(PeproBlockEntities.CONDUIT_BLOCK_ENTITY, pos, state);
    }

    public static void tick(World world, BlockPos pos, BlockState state, ConduitBlockEntity be) {
        be.transferVelocity++;
    }

    // Serialize the BlockEntity
    @Override
    public NbtCompound writeNbt(NbtCompound tag) {
        super.writeNbt(tag);

        // Save the current value of the number to the tag
        tag.putFloat("transferVelocity", transferVelocity);
        tag.putFloat("transferCapacity", transferCapacity);
        tag.putIntArray("transferTypes", transferTypes);

        return tag;
    }

    // Deserialize the BlockEntity
    @Override
    public void readNbt(NbtCompound tag) {
        super.readNbt(tag);
        transferVelocity = tag.getInt("transferVelocity");
        transferCapacity = tag.getFloat("transferCapacity");
        transferTypes = tag.getIntArray("transferTypes");
    }

    @Override
    public void update() {

    }
}
