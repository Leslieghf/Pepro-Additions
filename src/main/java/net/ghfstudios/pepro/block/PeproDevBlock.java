package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.sound.BlockSoundGroup;

public class PeproDevBlock extends PeproBlock{
    public PeproDevBlock(FabricBlockSettings settings) {
        //////WARNING: "settings" IS OVERWRITTEN HERE//////
        super(settings
                .strength(2f)
                .breakByTool(FabricToolTags.PICKAXES, 0)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
        );
    }
}
