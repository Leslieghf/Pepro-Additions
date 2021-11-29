package net.ghfstudios.pepro.world.gen.feature;

import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.FeatureConfig;

import java.util.stream.Stream;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public interface PeproFeatureConfig extends FeatureConfig {
    PeproDefaultFeatureConfig DEFAULT = PeproDefaultFeatureConfig.INSTANCE;

    default Stream<ConfiguredFeature<?, ?>> getDecoratedFeatures() {
        return Stream.empty();
    }
}
