package net.ghfstudios.pepro.world.gen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.world.gen.feature.FeatureConfig;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class EndDungeonFeatureConfig implements PeproFeatureConfig {
    public static final EndDungeonFeatureConfig INSTANCE = new EndDungeonFeatureConfig();
    public static final Codec<EndDungeonFeatureConfig> CODEC = Codec.unit(() -> {
        return INSTANCE;
    });
}
