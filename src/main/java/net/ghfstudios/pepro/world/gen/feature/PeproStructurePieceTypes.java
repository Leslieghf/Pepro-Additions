package net.ghfstudios.pepro.world.gen.feature;


import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.ghfstudios.pepro.structure.EndDungeonGenerator;
import net.minecraft.structure.StructurePieceType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import net.minecraft.world.gen.feature.StructureFeature;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class PeproStructurePieceTypes {
    public static final StructurePieceType MY_PIECE = EndDungeonGenerator.Corridor::new;
    private static final StructureFeature<EndDungeonFeatureConfig> MY_STRUCTURE = new EndDungeonFeature(EndDungeonFeatureConfig.CODEC);
    private static final ConfiguredStructureFeature<?, ?> MY_CONFIGURED = MY_STRUCTURE.configure(EndDungeonFeatureConfig.INSTANCE);

    public PeproStructurePieceTypes() {
        Registry.register(Registry.STRUCTURE_PIECE, new Identifier("pepro", "my_piece"), MY_PIECE);
        FabricStructureBuilder.create(new Identifier("pepro", "my_structure"), MY_STRUCTURE)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(32, 8, 12345)
                .adjustsSurface()
                .register();

        RegistryKey<ConfiguredStructureFeature<?, ?>> myConfigured = RegistryKey.of(Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                new Identifier("pepro", "my_structure"));
        BuiltinRegistries.add(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, myConfigured.getValue(), MY_CONFIGURED);

        BiomeModifications.addStructure(BiomeSelectors.all(), myConfigured);
    }
}
