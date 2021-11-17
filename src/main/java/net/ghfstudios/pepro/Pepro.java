package net.ghfstudios.pepro;

import net.fabricmc.api.ModInitializer;
import net.ghfstudios.mcjsonutils.ResourceBuilder;
import net.ghfstudios.pepro.block.PeproBlocks;
import net.ghfstudios.pepro.item.PeproItems;
import net.ghfstudios.pepro.particle.PeproParticleTypes;
import net.ghfstudios.pepro.world.gen.feature.PeproConfiguredFeatures;
import net.minecraft.util.Identifier;

public class Pepro implements ModInitializer {

    public static PeproBlocks peproBlocks;
    public static PeproItems peproItems;
    public static PeproParticleTypes peproParticleTypes;
    public static PeproConfiguredFeatures peproConfiguredFeatures;

    @SuppressWarnings("InstantiationOfUtilityClass")
    @Override
    public void onInitialize() {
        peproBlocks = new PeproBlocks();
        peproItems = new PeproItems();
        peproParticleTypes = new PeproParticleTypes();
        peproConfiguredFeatures = new PeproConfiguredFeatures();

        ResourceBuilder resourceBuilder = new ResourceBuilder(ResourceBuilder.ResourceType.BLOCK_BLOCKSTATE);
        resourceBuilder.CreateResource("block", "test_block", new Identifier("pepro", "block/test_block"));
    }
}
