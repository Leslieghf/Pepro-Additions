package net.ghfstudios.pepro.world.gen.feature;

import com.mojang.datafixers.util.Function13;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.FeatureConfig;

public class PeproGeodeFeatureConfig implements FeatureConfig {
	public static final Codec<Double> RANGE = Codec.doubleRange(0.0D, 1.0D);
	public static final Codec<PeproGeodeFeatureConfig> CODEC = RecordCodecBuilder.create((instance) -> {
			return instance.group(PeproGeodeLayerConfig.CODEC.fieldOf("blocks").forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.layerConfig;
		}), PeproGeodeLayerThicknessConfig.CODEC.fieldOf("layers").forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.layerThicknessConfig;
		}), PeproGeodeCrackConfig.CODEC.fieldOf("crack").forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.crackConfig;
		}), RANGE.fieldOf("use_potential_placements_chance").orElse(0.35D).forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.usePotentialPlacementsChance;
		}), RANGE.fieldOf("use_alternate_layer0_chance").orElse(0.0D).forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.useAlternateLayer0Chance;
		}), Codec.BOOL.fieldOf("placements_require_layer0_alternate").orElse(true).forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.placementsRequireLayer0Alternate;
		}), IntProvider.createValidatingCodec(1, 20).fieldOf("outer_wall_distance").orElse(UniformIntProvider.create(4, 5)).forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.outerWallDistance;
		}), IntProvider.createValidatingCodec(1, 20).fieldOf("distribution_points").orElse(UniformIntProvider.create(3, 4)).forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.distributionPoints;
		}), IntProvider.createValidatingCodec(0, 10).fieldOf("point_offset").orElse(UniformIntProvider.create(1, 2)).forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.pointOffset;
		}), Codec.INT.fieldOf("min_gen_offset").orElse(-16).forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.minGenOffset;
		}), Codec.INT.fieldOf("max_gen_offset").orElse(16).forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.maxGenOffset;
		}), RANGE.fieldOf("noise_multiplier").orElse(0.05D).forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.noiseMultiplier;
		}), Codec.INT.fieldOf("invalid_blocks_threshold").forGetter((peproGeodeFeatureConfig) -> {
			return peproGeodeFeatureConfig.invalidBlocksThreshold;
		})).apply(instance, (Function13)(PeproGeodeFeatureConfig :: new));
	});
	public final PeproGeodeLayerConfig layerConfig;
	public final PeproGeodeLayerThicknessConfig layerThicknessConfig;
	public final PeproGeodeCrackConfig crackConfig;
	public final double usePotentialPlacementsChance;
	public final double useAlternateLayer0Chance;
	public final boolean placementsRequireLayer0Alternate;
	public final IntProvider outerWallDistance;
	public final IntProvider distributionPoints;
	public final IntProvider pointOffset;
	public final int minGenOffset;
	public final int maxGenOffset;
	public final double noiseMultiplier;
	public final int invalidBlocksThreshold;

	public PeproGeodeFeatureConfig(PeproGeodeLayerConfig peproGeodeLayerConfig, PeproGeodeLayerThicknessConfig peproGeodeLayerThicknessConfig, PeproGeodeCrackConfig peproGeodeCrackConfig, double usePotentialPlacementsChance, double useAlternateLayer0Chance, boolean placementsRequireLayer0Alternate, IntProvider outerWallDistance, IntProvider distributionPoints, IntProvider pointOffset, int minGenOffset, int maxGenOffset, double noiseMultiplier, int invalidBlocksThreshold) {
		this.layerConfig = peproGeodeLayerConfig;
		this.layerThicknessConfig = peproGeodeLayerThicknessConfig;
		this.crackConfig = peproGeodeCrackConfig;
		this.usePotentialPlacementsChance = usePotentialPlacementsChance;
		this.useAlternateLayer0Chance = useAlternateLayer0Chance;
		this.placementsRequireLayer0Alternate = placementsRequireLayer0Alternate;
		this.outerWallDistance = outerWallDistance;
		this.distributionPoints = distributionPoints;
		this.pointOffset = pointOffset;
		this.minGenOffset = minGenOffset;
		this.maxGenOffset = maxGenOffset;
		this.noiseMultiplier = noiseMultiplier;
		this.invalidBlocksThreshold = invalidBlocksThreshold;
	}
}
