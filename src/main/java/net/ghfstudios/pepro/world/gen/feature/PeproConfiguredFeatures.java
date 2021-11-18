package net.ghfstudios.pepro.world.gen.feature;

import com.google.common.collect.ImmutableList;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.ghfstudios.pepro.block.PeproBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class PeproConfiguredFeatures {
    public static final ConfiguredFeature<?, ?> AQUAMARINE_GEODE;
    public static final ConfiguredFeature<?, ?> CITRINE_GEODE;
    public static final ConfiguredFeature<?, ?> GARNET_GEODE;
    public static final ConfiguredFeature<?, ?> OPAL_GEODE;
    public static final ConfiguredFeature<?, ?> PERIDOT_GEODE;
    public static final ConfiguredFeature<?, ?> RUBY_GEODE;
    public static final ConfiguredFeature<?, ?> SAPPHIRE_GEODE;
    public static final ConfiguredFeature<?, ?> TOPAZ_GEODE;
    public static final ConfiguredFeature<?, ?> ZIRCON_GEODE;

    static DataPool.Builder<BlockState> pool() {
        return DataPool.builder();
    }

    private static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String id, ConfiguredFeature<FC, ?> configuredFeature) {
        ConfiguredFeature<FC, ?> returnConfiguredFeature = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("pepro", id), configuredFeature);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("pepro", id)));
        return returnConfiguredFeature;
    }

    static {
        AQUAMARINE_GEODE = register("aquamarine_geode", (Feature.GEODE.configure(new GeodeFeatureConfig(new GeodeLayerConfig(new SimpleBlockStateProvider(States.AIR), new SimpleBlockStateProvider(States.AQUAMARINE_BLOCK), new SimpleBlockStateProvider(States.BUDDING_AQUAMARINE), new SimpleBlockStateProvider(States.CALCITE), new SimpleBlockStateProvider(States.SMOOTH_BASALT), ImmutableList.of(PeproBlocks.SMALL_AQUAMARINE_BUD.getDefaultState(), PeproBlocks.MEDIUM_AQUAMARINE_BUD.getDefaultState(), PeproBlocks.LARGE_AQUAMARINE_BUD.getDefaultState(), PeproBlocks.AQUAMARINE_CLUSTER.getDefaultState()), BlockTags.FEATURES_CANNOT_REPLACE.getId(), BlockTags.GEODE_INVALID_BLOCKS.getId()), new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackConfig(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformIntProvider.create(4, 6), UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2), -16, 16, 0.05D, 1)).uniformRange(YOffset.aboveBottom(6), YOffset.fixed(46))).applyChance(53).spreadHorizontally());
        CITRINE_GEODE = register("citrine_geode", (Feature.GEODE.configure(new GeodeFeatureConfig(new GeodeLayerConfig(new SimpleBlockStateProvider(States.AIR), new SimpleBlockStateProvider(States.CITRINE_BLOCK), new SimpleBlockStateProvider(States.BUDDING_CITRINE), new SimpleBlockStateProvider(States.CALCITE), new SimpleBlockStateProvider(States.SMOOTH_BASALT), ImmutableList.of(PeproBlocks.SMALL_CITRINE_BUD.getDefaultState(), PeproBlocks.MEDIUM_CITRINE_BUD.getDefaultState(), PeproBlocks.LARGE_CITRINE_BUD.getDefaultState(), PeproBlocks.CITRINE_CLUSTER.getDefaultState()), BlockTags.FEATURES_CANNOT_REPLACE.getId(), BlockTags.GEODE_INVALID_BLOCKS.getId()), new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackConfig(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformIntProvider.create(4, 6), UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2), -16, 16, 0.05D, 1)).uniformRange(YOffset.aboveBottom(6), YOffset.fixed(46))).applyChance(53).spreadHorizontally());
        GARNET_GEODE = register("garnet_geode", (Feature.GEODE.configure(new GeodeFeatureConfig(new GeodeLayerConfig(new SimpleBlockStateProvider(States.AIR), new SimpleBlockStateProvider(States.GARNET_BLOCK), new SimpleBlockStateProvider(States.BUDDING_GARNET), new SimpleBlockStateProvider(States.CALCITE), new SimpleBlockStateProvider(States.SMOOTH_BASALT), ImmutableList.of(PeproBlocks.SMALL_GARNET_BUD.getDefaultState(), PeproBlocks.MEDIUM_GARNET_BUD.getDefaultState(), PeproBlocks.LARGE_GARNET_BUD.getDefaultState(), PeproBlocks.GARNET_CLUSTER.getDefaultState()), BlockTags.FEATURES_CANNOT_REPLACE.getId(), BlockTags.GEODE_INVALID_BLOCKS.getId()), new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackConfig(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformIntProvider.create(4, 6), UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2), -16, 16, 0.05D, 1)).uniformRange(YOffset.aboveBottom(6), YOffset.fixed(46))).applyChance(53).spreadHorizontally());
        OPAL_GEODE = register("opal_geode", (Feature.GEODE.configure(new GeodeFeatureConfig(new GeodeLayerConfig(new SimpleBlockStateProvider(States.AIR), new SimpleBlockStateProvider(States.OPAL_BLOCK), new SimpleBlockStateProvider(States.BUDDING_OPAL), new SimpleBlockStateProvider(States.CALCITE), new SimpleBlockStateProvider(States.SMOOTH_BASALT), ImmutableList.of(PeproBlocks.SMALL_OPAL_BUD.getDefaultState(), PeproBlocks.MEDIUM_OPAL_BUD.getDefaultState(), PeproBlocks.LARGE_OPAL_BUD.getDefaultState(), PeproBlocks.OPAL_CLUSTER.getDefaultState()), BlockTags.FEATURES_CANNOT_REPLACE.getId(), BlockTags.GEODE_INVALID_BLOCKS.getId()), new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackConfig(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformIntProvider.create(4, 6), UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2), -16, 16, 0.05D, 1)).uniformRange(YOffset.aboveBottom(6), YOffset.fixed(46))).applyChance(53).spreadHorizontally());
        PERIDOT_GEODE = register("peridot_geode", (Feature.GEODE.configure(new GeodeFeatureConfig(new GeodeLayerConfig(new SimpleBlockStateProvider(States.AIR), new SimpleBlockStateProvider(States.PERIDOT_BLOCK), new SimpleBlockStateProvider(States.BUDDING_PERIDOT), new SimpleBlockStateProvider(States.CALCITE), new SimpleBlockStateProvider(States.SMOOTH_BASALT), ImmutableList.of(PeproBlocks.SMALL_PERIDOT_BUD.getDefaultState(), PeproBlocks.MEDIUM_PERIDOT_BUD.getDefaultState(), PeproBlocks.LARGE_PERIDOT_BUD.getDefaultState(), PeproBlocks.PERIDOT_CLUSTER.getDefaultState()), BlockTags.FEATURES_CANNOT_REPLACE.getId(), BlockTags.GEODE_INVALID_BLOCKS.getId()), new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackConfig(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformIntProvider.create(4, 6), UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2), -16, 16, 0.05D, 1)).uniformRange(YOffset.aboveBottom(6), YOffset.fixed(46))).applyChance(53).spreadHorizontally());
        RUBY_GEODE = register("ruby_geode", (Feature.GEODE.configure(new GeodeFeatureConfig(new GeodeLayerConfig(new SimpleBlockStateProvider(States.AIR), new SimpleBlockStateProvider(States.RUBY_BLOCK), new SimpleBlockStateProvider(States.BUDDING_RUBY), new SimpleBlockStateProvider(States.CALCITE), new SimpleBlockStateProvider(States.SMOOTH_BASALT), ImmutableList.of(PeproBlocks.SMALL_RUBY_BUD.getDefaultState(), PeproBlocks.MEDIUM_RUBY_BUD.getDefaultState(), PeproBlocks.LARGE_RUBY_BUD.getDefaultState(), PeproBlocks.RUBY_CLUSTER.getDefaultState()), BlockTags.FEATURES_CANNOT_REPLACE.getId(), BlockTags.GEODE_INVALID_BLOCKS.getId()), new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackConfig(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformIntProvider.create(4, 6), UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2), -16, 16, 0.05D, 1)).uniformRange(YOffset.aboveBottom(6), YOffset.fixed(46))).applyChance(53).spreadHorizontally());
        SAPPHIRE_GEODE = register("sapphire_geode", (Feature.GEODE.configure(new GeodeFeatureConfig(new GeodeLayerConfig(new SimpleBlockStateProvider(States.AIR), new SimpleBlockStateProvider(States.SAPPHIRE_BLOCK), new SimpleBlockStateProvider(States.BUDDING_SAPPHIRE), new SimpleBlockStateProvider(States.CALCITE), new SimpleBlockStateProvider(States.SMOOTH_BASALT), ImmutableList.of(PeproBlocks.SMALL_SAPPHIRE_BUD.getDefaultState(), PeproBlocks.MEDIUM_SAPPHIRE_BUD.getDefaultState(), PeproBlocks.LARGE_SAPPHIRE_BUD.getDefaultState(), PeproBlocks.SAPPHIRE_CLUSTER.getDefaultState()), BlockTags.FEATURES_CANNOT_REPLACE.getId(), BlockTags.GEODE_INVALID_BLOCKS.getId()), new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackConfig(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformIntProvider.create(4, 6), UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2), -16, 16, 0.05D, 1)).uniformRange(YOffset.aboveBottom(6), YOffset.fixed(46))).applyChance(53).spreadHorizontally());
        TOPAZ_GEODE = register("topaz_geode", (Feature.GEODE.configure(new GeodeFeatureConfig(new GeodeLayerConfig(new SimpleBlockStateProvider(States.AIR), new SimpleBlockStateProvider(States.TOPAZ_BLOCK), new SimpleBlockStateProvider(States.BUDDING_TOPAZ), new SimpleBlockStateProvider(States.CALCITE), new SimpleBlockStateProvider(States.SMOOTH_BASALT), ImmutableList.of(PeproBlocks.SMALL_TOPAZ_BUD.getDefaultState(), PeproBlocks.MEDIUM_TOPAZ_BUD.getDefaultState(), PeproBlocks.LARGE_TOPAZ_BUD.getDefaultState(), PeproBlocks.TOPAZ_CLUSTER.getDefaultState()), BlockTags.FEATURES_CANNOT_REPLACE.getId(), BlockTags.GEODE_INVALID_BLOCKS.getId()), new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackConfig(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformIntProvider.create(4, 6), UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2), -16, 16, 0.05D, 1)).uniformRange(YOffset.aboveBottom(6), YOffset.fixed(46))).applyChance(53).spreadHorizontally());
        ZIRCON_GEODE = register("zircon_geode", (Feature.GEODE.configure(new GeodeFeatureConfig(new GeodeLayerConfig(new SimpleBlockStateProvider(States.AIR), new SimpleBlockStateProvider(States.ZIRCON_BLOCK), new SimpleBlockStateProvider(States.BUDDING_ZIRCON), new SimpleBlockStateProvider(States.CALCITE), new SimpleBlockStateProvider(States.SMOOTH_BASALT), ImmutableList.of(PeproBlocks.SMALL_ZIRCON_BUD.getDefaultState(), PeproBlocks.MEDIUM_ZIRCON_BUD.getDefaultState(), PeproBlocks.LARGE_ZIRCON_BUD.getDefaultState(), PeproBlocks.ZIRCON_CLUSTER.getDefaultState()), BlockTags.FEATURES_CANNOT_REPLACE.getId(), BlockTags.GEODE_INVALID_BLOCKS.getId()), new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackConfig(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformIntProvider.create(4, 6), UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2), -16, 16, 0.05D, 1)).uniformRange(YOffset.aboveBottom(6), YOffset.fixed(46))).applyChance(53).spreadHorizontally());
    }

    public static final class States {
        private static final BlockState AIR;
        private static final BlockState CALCITE;
        private static final BlockState SMOOTH_BASALT;
        private static final BlockState TUFF;

        private static final BlockState AQUAMARINE_BLOCK;
        private static final BlockState BUDDING_AQUAMARINE;

        private static final BlockState CITRINE_BLOCK;
        private static final BlockState BUDDING_CITRINE;

        private static final BlockState GARNET_BLOCK;
        private static final BlockState BUDDING_GARNET;

        private static final BlockState OPAL_BLOCK;
        private static final BlockState BUDDING_OPAL;

        private static final BlockState PERIDOT_BLOCK;
        private static final BlockState BUDDING_PERIDOT;

        private static final BlockState RUBY_BLOCK;
        private static final BlockState BUDDING_RUBY;

        private static final BlockState SAPPHIRE_BLOCK;
        private static final BlockState BUDDING_SAPPHIRE;

        private static final BlockState TOPAZ_BLOCK;
        private static final BlockState BUDDING_TOPAZ;

        private static final BlockState ZIRCON_BLOCK;
        private static final BlockState BUDDING_ZIRCON;

        static {
            AIR = Blocks.AIR.getDefaultState();
            CALCITE = Blocks.CALCITE.getDefaultState();
            SMOOTH_BASALT = Blocks.SMOOTH_BASALT.getDefaultState();
            TUFF = Blocks.TUFF.getDefaultState();

            AQUAMARINE_BLOCK = PeproBlocks.AQUAMARINE_BLOCK.getDefaultState();
            BUDDING_AQUAMARINE = PeproBlocks.BUDDING_AQUAMARINE.getDefaultState();

            CITRINE_BLOCK = PeproBlocks.CITRINE_BLOCK.getDefaultState();
            BUDDING_CITRINE = PeproBlocks.BUDDING_CITRINE.getDefaultState();

            GARNET_BLOCK = PeproBlocks.GARNET_BLOCK.getDefaultState();
            BUDDING_GARNET = PeproBlocks.BUDDING_GARNET.getDefaultState();

            OPAL_BLOCK = PeproBlocks.OPAL_BLOCK.getDefaultState();
            BUDDING_OPAL = PeproBlocks.BUDDING_OPAL.getDefaultState();

            PERIDOT_BLOCK = PeproBlocks.PERIDOT_BLOCK.getDefaultState();
            BUDDING_PERIDOT = PeproBlocks.BUDDING_PERIDOT.getDefaultState();

            RUBY_BLOCK = PeproBlocks.RUBY_BLOCK.getDefaultState();
            BUDDING_RUBY = PeproBlocks.BUDDING_RUBY.getDefaultState();

            SAPPHIRE_BLOCK = PeproBlocks.SAPPHIRE_BLOCK.getDefaultState();
            BUDDING_SAPPHIRE = PeproBlocks.BUDDING_SAPPHIRE.getDefaultState();

            TOPAZ_BLOCK = PeproBlocks.TOPAZ_BLOCK.getDefaultState();
            BUDDING_TOPAZ = PeproBlocks.BUDDING_TOPAZ.getDefaultState();

            ZIRCON_BLOCK = PeproBlocks.ZIRCON_BLOCK.getDefaultState();
            BUDDING_ZIRCON = PeproBlocks.BUDDING_ZIRCON.getDefaultState();
        }
    }
}
