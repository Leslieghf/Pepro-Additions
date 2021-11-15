package net.ghfstudios.pepro.world.gen.feature;

import com.mojang.datafixers.util.Function3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record PeproGeodeCrackConfig(double generateCrackChance, double baseCrackSize, int crackPointOffset) {
	public static final Codec<PeproGeodeCrackConfig> CODEC = RecordCodecBuilder.create((instance) -> instance.group(PeproGeodeFeatureConfig.RANGE.fieldOf("generate_crack_chance").orElse(1.0D).forGetter((peproGeodeCrackConfig) -> peproGeodeCrackConfig.generateCrackChance), Codec.doubleRange(0.0D, 5.0D).fieldOf("base_crack_size").orElse(2.0D).forGetter((peproGeodeCrackConfig) -> peproGeodeCrackConfig.baseCrackSize), Codec.intRange(0, 10).fieldOf("crack_point_offset").orElse(2).forGetter((peproGeodeCrackConfig) -> peproGeodeCrackConfig.crackPointOffset)).apply(instance, (Function3) (PeproGeodeCrackConfig::new)));

}
