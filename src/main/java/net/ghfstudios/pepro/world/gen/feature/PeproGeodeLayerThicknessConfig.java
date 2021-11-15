package net.ghfstudios.pepro.world.gen.feature;

import com.mojang.datafixers.util.Function4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class PeproGeodeLayerThicknessConfig {
	private static final Codec<Double> RANGE = Codec.doubleRange(0.01D, 50.0D);
	public static final Codec<PeproGeodeLayerThicknessConfig> CODEC = RecordCodecBuilder.create((instance) -> {
		return instance.group(RANGE.fieldOf("filling").orElse(1.7D).forGetter((peproGeodeLayerThicknessConfig) -> {
			return peproGeodeLayerThicknessConfig.filling;
		}), RANGE.fieldOf("inner_layer").orElse(2.2D).forGetter((peproGeodeLayerThicknessConfig) -> {
			return peproGeodeLayerThicknessConfig.innerLayer;
		}), RANGE.fieldOf("middle_layer").orElse(3.2D).forGetter((peproGeodeLayerThicknessConfig) -> {
			return peproGeodeLayerThicknessConfig.middleLayer;
		}), RANGE.fieldOf("outer_layer").orElse(4.2D).forGetter((peproGeodeLayerThicknessConfig) -> {
			return peproGeodeLayerThicknessConfig.outerLayer;
		})).apply(instance, (Function4)(PeproGeodeLayerThicknessConfig::new));
	});
	public final double filling;
	public final double innerLayer;
	public final double middleLayer;
	public final double outerLayer;

	public PeproGeodeLayerThicknessConfig(double d, double e, double f, double g) {
		this.filling = d;
		this.innerLayer = e;
		this.middleLayer = f;
		this.outerLayer = g;
	}
}
