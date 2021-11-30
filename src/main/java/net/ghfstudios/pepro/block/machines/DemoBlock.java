package net.ghfstudios.pepro.block.machines;

import net.ghfstudios.pepro.block.entity.ConduitBlockEntity;
import net.ghfstudios.pepro.block.entity.PeproBlockEntities;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class DemoBlock extends BlockWithEntity implements BlockEntityProvider {
    public DemoBlock(Settings settings) {
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
        return checkType(type, PeproBlockEntities.CONDUIT_BLOCK_ENTITY, (world1, pos, state1, be) -> ConduitBlockEntity.tick(world1, pos, state1, be));
    }
}
