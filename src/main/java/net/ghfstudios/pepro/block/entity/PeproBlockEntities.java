package net.ghfstudios.pepro.block.entity;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.ghfstudios.pepro.block.PeproBlock;
import net.ghfstudios.pepro.block.PeproBlocks;
import net.ghfstudios.pepro.block.machines.WaxInjectorBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class PeproBlockEntities {
    public static BlockEntityType<DemoBlockEntity> DEMO_BLOCK_ENTITY;

    static {
        DEMO_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "pepro:demo_block_entity", FabricBlockEntityTypeBuilder.create(DemoBlockEntity::new, DEMO_BLOCK).build(null));
    }
}
