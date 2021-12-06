package net.ghfstudios.pepro.block.machines;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ghfstudios.pepro.block.entity.CompressionCraftingTableBlockEntity;
import net.ghfstudios.pepro.block.entity.ConduitBlockEntity;
import net.ghfstudios.pepro.block.entity.PeproBlockEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.listener.GameEventListener;
import org.jetbrains.annotations.Nullable;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */

//Todo: Extract methods appendProperties and getPlacementState from superclass in all MachineBlock subclasses
public class CompressionCraftingTableBlock extends MachineBlock implements BlockEntityProvider {
    public CompressionCraftingTableBlock(FabricBlockSettings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CompressionCraftingTableBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, PeproBlockEntities.COMPRESSION_CRAFTING_TABLE_BLOCK_ENTITY, CompressionCraftingTableBlockEntity::tick);
    }
}
