package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.sound.BlockSoundGroup;

public class PeproGemOreBlock extends PeproOreBlock {

    public PeproGemOreBlock(FabricBlockSettings settings) {
        //////WARNING: "settings" IS OVERWRITTEN HERE//////
        super(settings
                .strength(3f)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .requiresTool()
                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
        );
    }
}
