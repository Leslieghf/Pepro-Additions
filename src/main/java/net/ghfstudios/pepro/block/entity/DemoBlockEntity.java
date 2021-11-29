package net.ghfstudios.pepro.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class DemoBlockEntity extends BlockEntity {

    // Store the current value of the number
    private int lifetime = 0;
    public float electricCapacity = 1024.0f;    //Watts
    public float electricCharge = 1024.0f;    //Watts


    public DemoBlockEntity(BlockPos pos, BlockState state) {
        super(PeproBlockEntities.DEMO_BLOCK_ENTITY, pos, state);
    }

    public static void tick(World world, BlockPos pos, BlockState state, DemoBlockEntity be) {
        be.lifetime++;

    }

    // Serialize the BlockEntity
    @Override
    public NbtCompound writeNbt(NbtCompound tag) {
        super.writeNbt(tag);

        // Save the current value of the number to the tag
        tag.putInt("lifetime", lifetime);
        tag.putFloat("electricCapacity", electricCapacity);
        tag.putFloat("electricCharge", electricCharge);

        return tag;
    }

    // Deserialize the BlockEntity
    @Override
    public void readNbt(NbtCompound tag) {
        super.readNbt(tag);
        lifetime = tag.getInt("lifetime");
        electricCapacity = tag.getFloat("electricCapacity");
        electricCharge = tag.getFloat("electricCharge");
    }

    public void changeNeighbourNbt() {
        //Todo: Implement
    }
}
