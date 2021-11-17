package net.ghfstudios.pepro.world.gen.feature;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class PeproFeatures implements ModInitializer {
    private static final Feature<SpiralFeatureConfig> SPIRAL = new SpiralFeature(SpiralFeatureConfig.CODEC);

    public static final ConfiguredFeature<?, ?> STONE_SPIRAL = SPIRAL.configure(new SpiralFeatureConfig(ConstantIntProvider.create(15), new SimpleBlockStateProvider(Blocks.STONE.getDefaultState())))
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.OCEAN_FLOOR_WG)))
            .spreadHorizontally()
            .applyChance(5);

    @Override
    public void onInitialize() {
        Registry.register(Registry.FEATURE, new Identifier("pepro", "spiral"), SPIRAL);

        RegistryKey<ConfiguredFeature<?, ?>> stoneSpiral = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("pepro", "stone_spiral"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, stoneSpiral.getValue(), STONE_SPIRAL);
    }
}
