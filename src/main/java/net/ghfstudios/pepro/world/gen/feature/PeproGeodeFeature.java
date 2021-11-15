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
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class PeproGeodeFeature extends Feature<PeproGeodeFeatureConfig> {
	private static final Direction[] DIRECTIONS = Direction.values();

	public PeproGeodeFeature(Codec<PeproGeodeFeatureConfig> codec) {
		super(codec);
	}

	public boolean generate(FeatureContext<PeproGeodeFeatureConfig> context) {
		PeproGeodeFeatureConfig peproGeodeFeatureConfig = context.getConfig();
		Random random = context.getRandom();
		BlockPos blockPos = context.getOrigin();
		StructureWorldAccess structureWorldAccess = context.getWorld();
		int i = peproGeodeFeatureConfig.minGenOffset;
		int j = peproGeodeFeatureConfig.maxGenOffset;
		List<Pair<BlockPos, Integer>> list = Lists.newLinkedList();
		int k = peproGeodeFeatureConfig.distributionPoints.get(random);
		ChunkRandom chunkRandom = new ChunkRandom(structureWorldAccess.getSeed());
		DoublePerlinNoiseSampler doublePerlinNoiseSampler = DoublePerlinNoiseSampler.create(chunkRandom, -4, (1.0D));
		List<BlockPos> list2 = Lists.newLinkedList();
		double d = (double)k / (double)peproGeodeFeatureConfig.outerWallDistance.getMax();
		PeproGeodeLayerThicknessConfig peproGeodeLayerThicknessConfig = peproGeodeFeatureConfig.layerThicknessConfig;
		PeproGeodeLayerConfig peproGeodeLayerConfig = peproGeodeFeatureConfig.layerConfig;
		PeproGeodeCrackConfig peproGeodeCrackConfig = peproGeodeFeatureConfig.crackConfig;
		double e = 1.0D / Math.sqrt(peproGeodeLayerThicknessConfig.filling);
		double f = 1.0D / Math.sqrt(peproGeodeLayerThicknessConfig.innerLayer + d);
		double g = 1.0D / Math.sqrt(peproGeodeLayerThicknessConfig.middleLayer + d);
		double h = 1.0D / Math.sqrt(peproGeodeLayerThicknessConfig.outerLayer + d);
		double l = 1.0D / Math.sqrt(peproGeodeCrackConfig.baseCrackSize + random.nextDouble() / 2.0D + (k > 3 ? d : 0.0D));
		boolean bl = (double)random.nextFloat() < peproGeodeCrackConfig.generateCrackChance;
		int m = 0;

		int p;	//n
		int q;	//o
		BlockPos blockPos2;
		BlockState blockState;
		for(p = 0; p < k; ++p) {
			q = peproGeodeFeatureConfig.outerWallDistance.get(random);
			int r = peproGeodeFeatureConfig.outerWallDistance.get(random);	//p
			int s = peproGeodeFeatureConfig.outerWallDistance.get(random);	//q
			blockPos2 = blockPos.add(q, r, s);
			blockState = structureWorldAccess.getBlockState(blockPos2);
			if (blockState.isAir() || blockState.isIn(BlockTags.GEODE_INVALID_BLOCKS)) {
				++m;
				if (m > peproGeodeFeatureConfig.invalidBlocksThreshold) {
					return false;
				}
			}

			list.add(Pair.of(blockPos2, peproGeodeFeatureConfig.pointOffset.get(random)));
		}

		if (bl) {
			p = random.nextInt(4);
			q = k * 2 + 1;
			if (p == 0) {
				list2.add(blockPos.add(q, 7, 0));
				list2.add(blockPos.add(q, 5, 0));
				list2.add(blockPos.add(q, 1, 0));
			} else if (p == 1) {
				list2.add(blockPos.add(0, 7, q));
				list2.add(blockPos.add(0, 5, q));
				list2.add(blockPos.add(0, 1, q));
			} else if (p == 2) {
				list2.add(blockPos.add(q, 7, q));
				list2.add(blockPos.add(q, 5, q));
				list2.add(blockPos.add(q, 1, q));
			} else {
				list2.add(blockPos.add(0, 7, 0));
				list2.add(blockPos.add(0, 5, 0));
				list2.add(blockPos.add(0, 1, 0));
			}
		}

		{

			List<BlockPos> n = Lists.newArrayList();
			Predicate<BlockState> o = notInBlockTagPredicate(peproGeodeFeatureConfig.layerConfig.cannotReplace);
			Iterator<BlockPos> var48 = BlockPos.iterate(blockPos.add(i, i, i), blockPos.add(j, j, j)).iterator();

			while (true) {
				while (true) {
					double r;
					double s;
					BlockPos v;	//q
					do {
						if (!var48.hasNext()) {
							List<BlockState> w = peproGeodeLayerConfig.innerBlocks;	//p
							Iterator<BlockPos> var51 = n.iterator();

							while (true) {
								while (var51.hasNext()) {
									blockPos2 = var51.next();
									blockState = Util.getRandom(w, random);
									Direction[] var53 = DIRECTIONS;
									int var37 = var53.length;

									for (int var54 = 0; var54 < var37; ++var54) {
										Direction direction2 = var53[var54];
										if (blockState.contains(Properties.FACING)) {
											blockState = blockState.with(Properties.FACING, direction2);
										}

										BlockPos bl2 = blockPos2.offset(direction2);
										BlockState pair = structureWorldAccess.getBlockState(bl2);
										if (blockState.contains(Properties.WATERLOGGED)) {
											blockState = blockState.with(Properties.WATERLOGGED, pair.getFluidState().isStill());
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

						v = var48.next();
						double blockPos3 = doublePerlinNoiseSampler.sample( v.getX(), v.getY(), v.getZ()) * peproGeodeFeatureConfig.noiseMultiplier;
						r = 0.0D;
						s = 0.0D;

						Iterator var40;
						Pair pairm1;
						for (var40 = list.iterator(); var40.hasNext(); r += MathHelper.fastInverseSqrt(v.getSquaredDistance((Vec3i) pairm1.getFirst()) + (double) (Integer) pairm1.getSecond()) + blockPos3) {
							pairm1 = (Pair) var40.next();
						}

						BlockPos pair;
						for (var40 = list2.iterator(); var40.hasNext(); s += MathHelper.fastInverseSqrt(v.getSquaredDistance(pair) + (double) peproGeodeCrackConfig.crackPointOffset) + blockPos3) {
							pair = (BlockPos) var40.next();
						}
					} while (r < h);

					if (bl && s >= l && r < e) {
						this.setBlockStateIf(structureWorldAccess, v, Blocks.AIR.getDefaultState(), o);
						Direction[] var56 = DIRECTIONS;
						int var59 = var56.length;

						for (int var42 = 0; var42 < var59; ++var42) {
							Direction direction = var56[var42];
							BlockPos blockPos3 = v.offset(direction);
							FluidState fluidState = structureWorldAccess.getFluidState(blockPos3);
							if (!fluidState.isEmpty()) {
								structureWorldAccess.getFluidTickScheduler().schedule(blockPos3, fluidState.getFluid(), 0);
							}
						}
					} else if (r >= e) {
						this.setBlockStateIf(structureWorldAccess, v, peproGeodeLayerConfig.fillingProvider.getBlockState(random, v), o);
					} else if (r >= f) {
						boolean bl2 = (double) random.nextFloat() < peproGeodeFeatureConfig.useAlternateLayer0Chance;
						if (bl2) {
							this.setBlockStateIf(structureWorldAccess, v, peproGeodeLayerConfig.alternateInnerLayerProvider.getBlockState(random, v), o);
						} else {
							this.setBlockStateIf(structureWorldAccess, v, peproGeodeLayerConfig.innerLayerProvider.getBlockState(random, v), o);
						}

						if ((!peproGeodeFeatureConfig.placementsRequireLayer0Alternate || bl2) && (double) random.nextFloat() < peproGeodeFeatureConfig.usePotentialPlacementsChance) {
							n.add(v.toImmutable());
						}
					} else if (r >= g) {
						this.setBlockStateIf(structureWorldAccess, v, peproGeodeLayerConfig.middleLayerProvider.getBlockState(random, v), o);
					} else if (r >= h) {
						this.setBlockStateIf(structureWorldAccess, v, peproGeodeLayerConfig.outerLayerProvider.getBlockState(random, v), o);
					}
				}
			}
		}
	}
}
