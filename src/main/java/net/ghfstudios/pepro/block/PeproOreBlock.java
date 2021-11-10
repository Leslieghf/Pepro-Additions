package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;

@SuppressWarnings("unused")
public class PeproOreBlock extends PeproBlock {

    private final UniformIntProvider experienceDropped;

    public PeproOreBlock(FabricBlockSettings settings) {
        this(settings, UniformIntProvider.create(0, 0));
    }

    public PeproOreBlock(FabricBlockSettings settings, UniformIntProvider uniformIntProvider) {
        super(settings);
        this.experienceDropped = uniformIntProvider;
    }

    @Override @SuppressWarnings("deprecation")
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            int i = this.experienceDropped.get(world.random);
            if (i > 0) {
                this.dropExperience(world, pos, i);
            }
        }

    }
}
