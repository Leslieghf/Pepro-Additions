package net.ghfstudios.pepro.world.gen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.FeatureConfig;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class PeproDefaultFeatureConfig implements PeproFeatureConfig {
    public static final PeproDefaultFeatureConfig INSTANCE = new PeproDefaultFeatureConfig();
    public static final Codec<PeproDefaultFeatureConfig> CODEC = Codec.unit(() -> {
        return INSTANCE;
    });
}
