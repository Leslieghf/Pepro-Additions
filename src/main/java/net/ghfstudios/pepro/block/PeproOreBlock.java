package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;

@SuppressWarnings("unused")
public class PeproOreBlock extends PeproBlock {
    private final UniformIntProvider experienceDropped;
    private final int xp_multiplier;


    public PeproOreBlock(FabricBlockSettings settings) {
        this(settings,1 , UniformIntProvider.create(0, 0), true);
    }

    public PeproOreBlock(FabricBlockSettings settings, boolean overrideDefaultSettings) {
        this(settings,1 , UniformIntProvider.create(0, 0), overrideDefaultSettings);
    }

    public PeproOreBlock(FabricBlockSettings settings, int xp_multiplier, boolean overrideDefaultSettings) {
        this(settings, xp_multiplier, UniformIntProvider.create(0, 0), overrideDefaultSettings);
    }

    public PeproOreBlock(FabricBlockSettings settings, int xp_multiplier, UniformIntProvider uniformIntProvider, boolean overrideDefaultSettings) {
        super(settings);
        this.xp_multiplier = xp_multiplier;
        this.experienceDropped = uniformIntProvider;
        if (!overrideDefaultSettings) {
            this.settings = settings
                    .strength(2f)
                    .breakByTool(FabricToolTags.PICKAXES, 2)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK);
        }
    }

    @SuppressWarnings("deprecation")
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            int i = this.experienceDropped.get(world.random);
            if (i > 0) {
                this.dropExperience(world, pos, i * xp_multiplier);
            }
        }

    }
}
