package net.ghfstudios.pepro.world.gen.feature;

import com.mojang.serialization.Codec;
import net.ghfstudios.pepro.structure.EndDungeonGenerator;
import net.minecraft.structure.MarginedStructureStart;
import net.minecraft.structure.StrongholdGenerator;
import net.minecraft.structure.StructureManager;
import net.minecraft.structure.StructurePiece;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.world.HeightLimitView;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.gen.ChunkRandom;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.StructureFeature;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class EndDungeonFeature extends StructureFeature<EndDungeonFeatureConfig> {
    public EndDungeonFeature(Codec<EndDungeonFeatureConfig> codec) {
        super(codec);
    }

    public StructureFeature.StructureStartFactory<EndDungeonFeatureConfig> getStructureStartFactory() {
        return EndDungeonFeature.Start::new;
    }

    protected boolean shouldStartAt(ChunkGenerator chunkGenerator, BiomeSource biomeSource, long l, ChunkRandom chunkRandom, ChunkPos chunkPos, Biome biome, ChunkPos chunkPos2, EndDungeonFeatureConfig defaultFeatureConfig, HeightLimitView heightLimitView) {
        return chunkGenerator.isStrongholdStartingChunk(chunkPos);
    }

    public static class Start extends MarginedStructureStart<EndDungeonFeatureConfig> {
        private final long seed;

        public Start(StructureFeature<EndDungeonFeatureConfig> structureFeature, ChunkPos chunkPos, int i, long l) {
            super(structureFeature, chunkPos, i, l);
            this.seed = l;
        }

        public void init(DynamicRegistryManager dynamicRegistryManager, ChunkGenerator chunkGenerator, StructureManager structureManager, ChunkPos chunkPos, Biome biome, EndDungeonFeatureConfig endDungeonFeatureConfig, HeightLimitView heightLimitView) {
            int x = chunkPos.x * 16;
            int z = chunkPos.z * 16;
            int y = chunkGenerator.getHeight(x, z, Heightmap.Type.WORLD_SURFACE_WG, heightLimitView);
            BlockPos pos = new BlockPos(x, y, z);
            BlockRotation rotation = BlockRotation.random(this.random);
            EndDungeonGenerator.addPieces(structureManager, pos, rotation, this.children);
            this.setBoundingBoxFromChildren();
        }
    }
}
