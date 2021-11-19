package net.ghfstudios.pepro.item;

import net.minecraft.block.Block;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.Tag;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class PeproMiningToolItem extends MiningToolItem {
    protected PeproMiningToolItem(float f, float g, ToolMaterial toolMaterial, Tag<Block> tag, Settings settings) {
        super(f, g, toolMaterial, tag, settings);
    }
}
