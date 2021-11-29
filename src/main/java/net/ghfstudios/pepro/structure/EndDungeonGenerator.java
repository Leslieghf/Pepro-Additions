package net.ghfstudios.pepro.structure;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.structure.*;
import net.minecraft.structure.processor.BlockIgnoreStructureProcessor;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.ChunkGenerator;

import java.util.List;
import java.util.Random;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class EndDungeonGenerator {
    private static final Identifier IGLOO_TOP = new Identifier("igloo/top");

    public static void addPieces(StructureManager manager, BlockPos pos, BlockRotation rotation, List<StructurePiece> pieces) {
        pieces.add(new Corridor(manager, pos, IGLOO_TOP, rotation));
    }

    public abstract static class Piece extends StructurePiece {

        public Piece(StructurePieceType structurePieceType, int i, BlockBox blockBox) {
            super(structurePieceType, i, blockBox);
        }

        public Piece(StructurePieceType structurePieceType, NbtCompound nbtCompound) {
            super(structurePieceType, nbtCompound);
        }

        public Piece() {
            super(null, null);
        }

        protected void handleMetadata(String metadata, BlockPos pos, ServerWorldAccess serverWorldAccess, Random random,
                                      BlockBox boundingBox) {
        }
    }

    public static class Corridor extends Piece  {
        private final BlockRotation rotation;
        private final Identifier template;

        public Corridor(StructureManager structureManager, NbtCompound nbtCompound) {
            super(StructurePieceType.IGLOO, nbtCompound);
            this.template = new Identifier(nbtCompound.getString("Template"));
            this.rotation = BlockRotation.valueOf(nbtCompound.getString("Rot"));
            this.initializeStructureData(structureManager);
        }

        public Corridor(StructureManager structureManager, BlockPos pos, Identifier template, BlockRotation rotation) {
            super(StructurePieceType.IGLOO, 0, new BlockBox(pos));
            this.rotation = rotation;
            this.template = template;

            this.initializeStructureData(structureManager);
        }

        public Corridor(ServerWorld serverWorld, NbtCompound nbtCompound) {
            this.rotation = null;
            this.template = null;
        }

        private void initializeStructureData(StructureManager structureManager) {
            Structure structure = structureManager.getStructureOrBlank(this.template);
            StructurePlacementData placementData = (new StructurePlacementData())
                    .setRotation(this.rotation)
                    .setMirror(BlockMirror.NONE)
                    .addProcessor(BlockIgnoreStructureProcessor.IGNORE_STRUCTURE_BLOCKS);
            this.setStructureData(structure, boundingBox, placementData);
        }

        //Todo: Fix this shit
        private void setStructureData(Structure structure, BlockBox box, StructurePlacementData placementData) {
            //this.structure = structure;
            this.boundingBox = box;
            //this.placementData = placementData;
        }

        @Override
        protected void handleMetadata(String metadata, BlockPos pos, ServerWorldAccess serverWorldAccess, Random random,
                                      BlockBox boundingBox) {
        }

        @Override
        protected void writeNbt(ServerWorld world, NbtCompound nbt) {
            //super.writeNbt(world, nbt);
        }

        @Override
        public boolean generate(StructureWorldAccess world, StructureAccessor structureAccessor, ChunkGenerator chunkGenerator, Random random, BlockBox boundingBox, ChunkPos chunkPos, BlockPos pos) {
            return false;
        }
    }
}
