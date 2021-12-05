package net.ghfstudios.pepro.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class CompressionCraftingTableBlockEntity extends UTSConsumerBlockEntity{
    public CompressionCraftingTableBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    @Override
    public void update() {
        super.update();
        System.out.println("UPDATED BLOCK ENTITY! Charged to " + electricCharge + " Joules");
    }
}
