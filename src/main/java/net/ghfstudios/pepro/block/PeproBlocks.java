package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class PeproBlocks {
    public static final PeproBlock DEV_MEASURE_GENERIC;
    public static final PeproBlock AMETHYST_ORE;
    public static final PeproBlock AQUAMARINE_ORE;
    public static final PeproBlock CITRINE_ORE;
    public static final PeproBlock GARNET_ORE;
    public static final PeproBlock OPAL_ORE;
    public static final PeproBlock PERIDOT_ORE;
    public static final PeproBlock RUBY_ORE;
    public static final PeproBlock SAPPHIRE_ORE;
    public static final PeproBlock TOPAZ_ORE;
    public static final PeproBlock ZIRCON_ORE;


    private static PeproBlock register(String id, PeproBlock block) {
        return Registry.register(Registry.BLOCK, new Identifier("pepro", id), block);
    }


    static {
        DEV_MEASURE_GENERIC = register( "dev_measure_generic", new PeproDevBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0F, 3.0F)));
        AMETHYST_ORE = register( "amethyst_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)));
        AQUAMARINE_ORE = register( "aquamarine_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)));
        CITRINE_ORE = register( "citrine_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)));
        GARNET_ORE = register( "garnet_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)));
        OPAL_ORE = register( "opal_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)));
        PERIDOT_ORE = register( "peridot_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)));
        RUBY_ORE = register( "ruby_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)));
        SAPPHIRE_ORE = register( "sapphire_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)));
        TOPAZ_ORE = register( "topaz_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)));
        ZIRCON_ORE = register( "zircon_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)));
    }
}
