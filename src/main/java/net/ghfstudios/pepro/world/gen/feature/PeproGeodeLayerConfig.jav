package net.ghfstudios.pepro.world.gen.feature;

import com.mojang.datafixers.util.Function8;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.world.gen.feature.GeodeLayerConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class PeproGeodeLayerConfig {
	public final BlockStateProvider fillingProvider;
	public final BlockStateProvider innerLayerProvider;
	public final BlockStateProvider alternateInnerLayerProvider;
	public final BlockStateProvider middleLayerProvider;
	public final BlockStateProvider outerLayerProvider;
	public final List<BlockState> innerBlocks;
	public final Identifier cannotReplace;
	public final Identifier invalidBlocks;
	public static final Codec<GeodeLayerConfig> CODEC = RecordCodecBuilder.create((instance) -> {
		return instance.group(BlockStateProvider.TYPE_CODEC.fieldOf("filling_provider").forGetter((geodeLayerConfig) -> {
			return geodeLayerConfig.fillingProvider;
		}), BlockStateProvider.TYPE_CODEC.fieldOf("inner_layer_provider").forGetter((geodeLayerConfig) -> {
			return geodeLayerConfig.innerLayerProvider;
		}), BlockStateProvider.TYPE_CODEC.fieldOf("alternate_inner_layer_provider").forGetter((geodeLayerConfig) -> {
			return geodeLayerConfig.alternateInnerLayerProvider;
		}), BlockStateProvider.TYPE_CODEC.fieldOf("middle_layer_provider").forGetter((geodeLayerConfig) -> {
			return geodeLayerConfig.middleLayerProvider;
		}), BlockStateProvider.TYPE_CODEC.fieldOf("outer_layer_provider").forGetter((geodeLayerConfig) -> {
			return geodeLayerConfig.outerLayerProvider;
		}), Codecs.nonEmptyList(BlockState.CODEC.listOf()).fieldOf("inner_placements").forGetter((geodeLayerConfig) -> {
			return geodeLayerConfig.innerBlocks;
		}), Identifier.CODEC.fieldOf("cannot_replace").forGetter((geodeLayerConfig) -> {
			return geodeLayerConfig.cannotReplace;
		}), Identifier.CODEC.fieldOf("invalid_blocks").forGetter((geodeLayerConfig) -> {
			return geodeLayerConfig.invalidBlocks;
		})).apply(instance, (Function8)(GeodeLayerConfig::new));
	});

	public GeodeLayerConfig(BlockStateProvider blockStateProvider, BlockStateProvider blockStateProvider2, BlockStateProvider blockStateProvider3, BlockStateProvider blockStateProvider4, BlockStateProvider blockStateProvider5, List<BlockState> list, Identifier identifier, Identifier identifier2) {
		this.fillingProvider = blockStateProvider;
		this.innerLayerProvider = blockStateProvider2;
		this.alternateInnerLayerProvider = blockStateProvider3;
		this.middleLayerProvider = blockStateProvider4;
		this.outerLayerProvider = blockStateProvider5;
		this.innerBlocks = list;
		this.cannotReplace = identifier;
		this.invalidBlocks = identifier2;
	}
}
