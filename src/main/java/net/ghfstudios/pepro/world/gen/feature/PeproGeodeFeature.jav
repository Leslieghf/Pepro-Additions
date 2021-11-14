package net.ghfstudios.pepro.world.gen.feature;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BuddingAmethystBlock;
import net.minecraft.fluid.FluidState;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.ChunkRandom;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.GeodeCrackConfig;
import net.minecraft.world.gen.feature.GeodeFeatureConfig;
import net.minecraft.world.gen.feature.GeodeLayerConfig;
import net.minecraft.world.gen.feature.GeodeLayerThicknessConfig;
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class PeproGeodeFeature extends Feature<net.minecraft.world.gen.feature.GeodeFeatureConfig> {
	private static final Direction[] DIRECTIONS = Direction.values();

	public GeodeFeature(Codec<net.minecraft.world.gen.feature.GeodeFeatureConfig> codec) {
		super(codec);
	}

	public boolean generate(FeatureContext<net.minecraft.world.gen.feature.GeodeFeatureConfig> context) {
		net.minecraft.world.gen.feature.GeodeFeatureConfig geodeFeatureConfig = (GeodeFeatureConfig)context.getConfig();
		Random random = context.getRandom();
		BlockPos blockPos = context.getOrigin();
		StructureWorldAccess structureWorldAccess = context.getWorld();
		int i = geodeFeatureConfig.minGenOffset;
		int j = geodeFeatureConfig.maxGenOffset;
		List<Pair<BlockPos, Integer>> list = Lists.newLinkedList();
		int k = geodeFeatureConfig.distributionPoints.get(random);
		ChunkRandom chunkRandom = new ChunkRandom(structureWorldAccess.getSeed());
		DoublePerlinNoiseSampler doublePerlinNoiseSampler = DoublePerlinNoiseSampler.create(chunkRandom, -4, (double[])(1.0D));
		List<BlockPos> list2 = Lists.newLinkedList();
		double d = (double)k / (double)geodeFeatureConfig.outerWallDistance.getMax();
		GeodeLayerThicknessConfig geodeLayerThicknessConfig = geodeFeatureConfig.layerThicknessConfig;
		GeodeLayerConfig geodeLayerConfig = geodeFeatureConfig.layerConfig;
		GeodeCrackConfig geodeCrackConfig = geodeFeatureConfig.crackConfig;
		double e = 1.0D / Math.sqrt(geodeLayerThicknessConfig.filling);
		double f = 1.0D / Math.sqrt(geodeLayerThicknessConfig.innerLayer + d);
		double g = 1.0D / Math.sqrt(geodeLayerThicknessConfig.middleLayer + d);
		double h = 1.0D / Math.sqrt(geodeLayerThicknessConfig.outerLayer + d);
		double l = 1.0D / Math.sqrt(geodeCrackConfig.baseCrackSize + random.nextDouble() / 2.0D + (k > 3 ? d : 0.0D));
		boolean bl = (double)random.nextFloat() < geodeCrackConfig.generateCrackChance;
		int m = 0;

		int n;
		int o;
		BlockPos blockPos2;
		BlockState blockState;
		for(n = 0; n < k; ++n) {
			o = geodeFeatureConfig.outerWallDistance.get(random);
			int p = geodeFeatureConfig.outerWallDistance.get(random);
			int q = geodeFeatureConfig.outerWallDistance.get(random);
			blockPos2 = blockPos.add(o, p, q);
			blockState = structureWorldAccess.getBlockState(blockPos2);
			if (blockState.isAir() || blockState.isIn(BlockTags.GEODE_INVALID_BLOCKS)) {
				++m;
				if (m > geodeFeatureConfig.invalidBlocksThreshold) {
					return false;
				}
			}

			list.add(Pair.of(blockPos2, geodeFeatureConfig.pointOffset.get(random)));
		}

		if (bl) {
			n = random.nextInt(4);
			o = k * 2 + 1;
			if (n == 0) {
				list2.add(blockPos.add(o, 7, 0));
				list2.add(blockPos.add(o, 5, 0));
				list2.add(blockPos.add(o, 1, 0));
			} else if (n == 1) {
				list2.add(blockPos.add(0, 7, o));
				list2.add(blockPos.add(0, 5, o));
				list2.add(blockPos.add(0, 1, o));
			} else if (n == 2) {
				list2.add(blockPos.add(o, 7, o));
				list2.add(blockPos.add(o, 5, o));
				list2.add(blockPos.add(o, 1, o));
			} else {
				list2.add(blockPos.add(0, 7, 0));
				list2.add(blockPos.add(0, 5, 0));
				list2.add(blockPos.add(0, 1, 0));
			}
		}

		List<BlockPos> n = Lists.newArrayList();
		Predicate<BlockState> o = notInBlockTagPredicate(geodeFeatureConfig.layerConfig.cannotReplace);
		Iterator var48 = BlockPos.iterate(blockPos.add(i, i, i), blockPos.add(j, j, j)).iterator();

		while(true) {
			while(true) {
				double r;
				double s;
				BlockPos q;
				do {
					if (!var48.hasNext()) {
						List<BlockState> p = geodeLayerConfig.innerBlocks;
						Iterator var51 = n.iterator();

						while(true) {
							while(var51.hasNext()) {
								blockPos2 = (BlockPos)var51.next();
								blockState = (BlockState)Util.getRandom(p, random);
								Direction[] var53 = DIRECTIONS;
								int var37 = var53.length;

								for(int var54 = 0; var54 < var37; ++var54) {
									Direction direction2 = var53[var54];
									if (blockState.contains(Properties.FACING)) {
										blockState = (BlockState)blockState.with(Properties.FACING, direction2);
									}

									BlockPos bl2 = blockPos2.offset(direction2);
									BlockState pair = structureWorldAccess.getBlockState(bl2);
									if (blockState.contains(Properties.WATERLOGGED)) {
										blockState = (BlockState)blockState.with(Properties.WATERLOGGED, pair.getFluidState().isStill());
									}

									if (BuddingAmethystBlock.canGrowIn(pair)) {
										this.setBlockStateIf(structureWorldAccess, bl2, blockState, o);
										break;
									}
								}
							}

							return true;
						}
					}

					q = (BlockPos)var48.next();
					double blockPos2 = doublePerlinNoiseSampler.sample((double)q.getX(), (double)q.getY(), (double)q.getZ()) * geodeFeatureConfig.noiseMultiplier;
					r = 0.0D;
					s = 0.0D;

					Iterator var40;
					Pair pair;
					for(var40 = list.iterator(); var40.hasNext(); r += MathHelper.fastInverseSqrt(q.getSquaredDistance((Vec3i)pair.getFirst()) + (double)(Integer)pair.getSecond()) + blockPos2) {
						pair = (Pair)var40.next();
					}

					BlockPos pair;
					for(var40 = list2.iterator(); var40.hasNext(); s += MathHelper.fastInverseSqrt(q.getSquaredDistance(pair) + (double)geodeCrackConfig.crackPointOffset) + blockPos2) {
						pair = (BlockPos)var40.next();
					}
				} while(r < h);

				if (bl && s >= l && r < e) {
					this.setBlockStateIf(structureWorldAccess, q, Blocks.AIR.getDefaultState(), o);
					Direction[] var56 = DIRECTIONS;
					int var59 = var56.length;

					for(int var42 = 0; var42 < var59; ++var42) {
						Direction direction = var56[var42];
						BlockPos blockPos3 = q.offset(direction);
						FluidState fluidState = structureWorldAccess.getFluidState(blockPos3);
						if (!fluidState.isEmpty()) {
							structureWorldAccess.getFluidTickScheduler().schedule(blockPos3, fluidState.getFluid(), 0);
						}
					}
				} else if (r >= e) {
					this.setBlockStateIf(structureWorldAccess, q, geodeLayerConfig.fillingProvider.getBlockState(random, q), o);
				} else if (r >= f) {
					boolean bl2 = (double)random.nextFloat() < geodeFeatureConfig.useAlternateLayer0Chance;
					if (bl2) {
						this.setBlockStateIf(structureWorldAccess, q, geodeLayerConfig.alternateInnerLayerProvider.getBlockState(random, q), o);
					} else {
						this.setBlockStateIf(structureWorldAccess, q, geodeLayerConfig.innerLayerProvider.getBlockState(random, q), o);
					}

					if ((!geodeFeatureConfig.placementsRequireLayer0Alternate || bl2) && (double)random.nextFloat() < geodeFeatureConfig.usePotentialPlacementsChance) {
						n.add(q.toImmutable());
					}
				} else if (r >= g) {
					this.setBlockStateIf(structureWorldAccess, q, geodeLayerConfig.middleLayerProvider.getBlockState(random, q), o);
				} else if (r >= h) {
					this.setBlockStateIf(structureWorldAccess, q, geodeLayerConfig.outerLayerProvider.getBlockState(random, q), o);
				}
			}
		}
	}
}
