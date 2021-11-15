package net.ghfstudios.pepro;

import com.mojang.serialization.Codec;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.ghfstudios.pepro.block.PeproBlocks;
import net.ghfstudios.pepro.item.PeproItems;
import net.ghfstudios.pepro.particle.PeproParticleTypes;
import net.ghfstudios.pepro.world.gen.feature.PeproGeodeCrackConfig;
import net.ghfstudios.pepro.world.gen.feature.PeproGeodeFeature;
import net.ghfstudios.pepro.world.gen.feature.PeproGeodeFeatureConfig;
import net.minecraft.world.gen.GenerationStep;


public class Pepro implements ModInitializer {

    public static PeproBlocks peproBlocks;
    public static PeproItems peproItems;
    public static PeproParticleTypes peproParticleTypes;

    @SuppressWarnings("InstantiationOfUtilityClass")
    @Override
    public void onInitialize() {
        peproBlocks = new PeproBlocks();
        peproItems = new PeproItems();
        peproParticleTypes = new PeproParticleTypes();
    }
}
