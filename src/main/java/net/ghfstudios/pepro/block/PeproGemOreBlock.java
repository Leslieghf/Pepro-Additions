package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class PeproGemOreBlock extends PeproBlock {

    private final UniformIntProvider experienceDropped;
    private final int xp_multiplier;

    public PeproGemOreBlock(FabricBlockSettings settings) {
        //////WARNING: "settings" IS OVERWRITTEN HERE//////
        this(settings
                .strength(3f)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .requiresTool()
                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                ,2
        );
    }

    public PeproGemOreBlock(FabricBlockSettings settings, int xp_multiplier) {
        this(settings, xp_multiplier, UniformIntProvider.create(0, 0));
    }

    public PeproGemOreBlock(FabricBlockSettings settings, int xp_multiplier, UniformIntProvider uniformIntProvider) {
        super(settings
                .strength(2f)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .requiresTool()
                .sounds(BlockSoundGroup.AMETHYST_BLOCK));
        this.xp_multiplier = xp_multiplier;
        this.experienceDropped = uniformIntProvider;
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
