package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class PeproBlock extends Block {
    public PeproBlock(FabricBlockSettings settings) {
        super(settings);
    }

    @SuppressWarnings("unused")
    public enum BlockstatePreset {
        NORMAL_BLOCK,
        ORIENTABLE_ALL
    }

    @SuppressWarnings("unused")
    public enum ItemModelPreset {
        ITEM_GENERATED
    }

    @SuppressWarnings("unused")
    public enum BlockModelPreset {
        CUBE_ALL,
        CROSS
    }

    @SuppressWarnings("unused")
    public enum LootTablePreset {
        NORMAL_TILEDROP,
        NORMAL_ORE
    }
}
