package net.ghfstudios.pepro.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class CompressionCraftingTableBlockEntity extends UTSConsumerBlockEntity{
    public CompressionCraftingTableBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(PeproBlockEntities.COMPRESSION_CRAFTING_TABLE_BLOCK_ENTITY, blockPos, blockState);
    }

    @Override
    public void update() {
        super.update();
        System.out.println("UPDATED BLOCK ENTITY! Charged to " + electricCharge + " Joules");
    }

    public static <E extends BlockEntity> void tick(World world, BlockPos blockPos, BlockState blockState, E e) {
    }


}
