package net.ghfstudios.pepro.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.ghfstudios.pepro.block.PeproBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class PeproBlockEntities {
    public static BlockEntityType<ConduitBlockEntity> CONDUIT_BLOCK_ENTITY;

    static {
        CONDUIT_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "pepro:conduit_block_entity", FabricBlockEntityTypeBuilder.create(ConduitBlockEntity::new, PeproBlocks.CONDUIT).build(null));
    }
}
