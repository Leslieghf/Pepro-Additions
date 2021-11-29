package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public class PeproBlock extends Block {
    public PeproBlock(FabricBlockSettings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
    }

    @SuppressWarnings("unused")
    public enum BlockstatePreset {
        NORMAL_BLOCK,
        ORIENTABLE_ALL
    }

    @SuppressWarnings("unused")
    public enum ItemModelPreset {
        ITEM_GENERATED
    }

    @SuppressWarnings("unused")
    public enum BlockModelPreset {
        CUBE_ALL,
        CROSS
    }

    @SuppressWarnings("unused")
    public enum LootTablePreset {
        NORMAL_TILEDROP,
        NORMAL_ORE
    }
}
