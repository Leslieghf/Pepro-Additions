package net.ghfstudios.pepro.world.gen.feature;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;

public class PeproFeatures implements ModInitializer {
    /*private static final Feature<PeproGeodeFeatureConfig> PEPRO_GEODE = new PeproGeodeFeature(PeproGeodeFeatureConfig.CODEC);
    public static final ConfiguredFeature<?, ?> PEPRO_AQUAMARINE_GEODE = PEPRO_GEODE.configure(new PeproGeodeFeatureConfig(
                    new PeproGeodeLayerConfig(),
                    new PeproGeodeLayerThicknessConfig(),
                    new PeproGeodeCrackConfig(),

              */
    @Override
    public void onInitialize() {
        //GEODE = register("geode", new GeodeFeature(GeodeFeatureConfig.CODEC));
        //Registry.register(Registry.FEATURE, new Identifier("pepro", "geode"), SPIRAL);
    }
}