package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class PeproGemOreBlock extends PeproOreBlock {
    public PeproGemOreBlock(FabricBlockSettings settings) {
        this(settings, UniformIntProvider.create(0, 0));
    }

    public PeproGemOreBlock(FabricBlockSettings settings, UniformIntProvider uniformIntProvider) {
        super(settings, uniformIntProvider);
    }
}
