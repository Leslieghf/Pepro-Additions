package net.ghfstudios.pepro;

import net.fabricmc.api.ModInitializer;
import net.ghfstudios.pepro.block.PeproBlocks;
import net.ghfstudios.pepro.block.entity.PeproBlockEntities;
import net.ghfstudios.pepro.item.PeproItems;
import net.ghfstudios.pepro.particle.PeproParticleTypes;
import net.ghfstudios.pepro.world.gen.feature.PeproConfiguredFeatures;
import net.ghfstudios.pepro.world.gen.feature.PeproStructurePieceTypes;

public class Pepro implements ModInitializer {

    public static PeproBlocks peproBlocks;
    public static PeproItems peproItems;
    public static PeproParticleTypes peproParticleTypes;
    public static PeproConfiguredFeatures peproConfiguredFeatures;
    public static PeproStructurePieceTypes peproStructurePieceTypes;
    public static PeproBlockEntities peproBlockEntities;

    @SuppressWarnings("InstantiationOfUtilityClass")
    @Override
    public void onInitialize() {
        peproBlocks = new PeproBlocks();
        peproItems = new PeproItems();
        peproParticleTypes = new PeproParticleTypes();
        peproConfiguredFeatures = new PeproConfiguredFeatures();
        peproStructurePieceTypes = new PeproStructurePieceTypes();
        peproBlockEntities = new PeproBlockEntities();

        //ResourceBuilder resourceBuilder = new ResourceBuilder(ResourceBuilder.ResourceType.BLOCK_BLOCKSTATE);
        //resourceBuilder.CreateResource("block", "test_block", new Identifier("pepro", "block/test_block"));
    }
}
