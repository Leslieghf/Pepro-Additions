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
    
    public static final PeproBlock DEEPSLATE_AMETHYST_ORE;
    public static final PeproBlock DEEPSLATE_AQUAMARINE_ORE;
    public static final PeproBlock DEEPSLATE_CITRINE_ORE;
    public static final PeproBlock DEEPSLATE_GARNET_ORE;
    public static final PeproBlock DEEPSLATE_OPAL_ORE;
    public static final PeproBlock DEEPSLATE_PERIDOT_ORE;
    public static final PeproBlock DEEPSLATE_RUBY_ORE;
    public static final PeproBlock DEEPSLATE_SAPPHIRE_ORE;
    public static final PeproBlock DEEPSLATE_TOPAZ_ORE;
    public static final PeproBlock DEEPSLATE_ZIRCON_ORE;

    public static final PeproBlock VOID_OPAL_CLUSTER;
    public static final PeproBlock LOW_TEMPERATURE_DIAMOND_CLUSTER;

    public static final PeproBlock ALUMINIUM_ORE;
    public static final PeproBlock ANTIMONY_ORE;
    public static final PeproBlock BISMUTH_ORE;
    public static final PeproBlock BORON_ORE;
    public static final PeproBlock CADMIUM_ORE;
    public static final PeproBlock CARBON_ORE;
    public static final PeproBlock CHROMIUM_ORE;
    public static final PeproBlock COBALT_ORE;
    public static final PeproBlock GERMANIUM_ORE;
    public static final PeproBlock LEAD_ORE;
    public static final PeproBlock LITHIUM_ORE;
    public static final PeproBlock MANGANESE_ORE;
    public static final PeproBlock MAGNESIUM_ORE;
    public static final PeproBlock MERCURY_ORE;
    public static final PeproBlock MOLYBDENUM_ORE;
    public static final PeproBlock NICKEL_ORE;
    public static final PeproBlock NIOBIUM_ORE;
    public static final PeproBlock TIN_ORE;
    public static final PeproBlock TITANIUM_ORE;
    public static final PeproBlock TUNGSTEN_ORE;
    public static final PeproBlock TANTALUM_ORE;
    public static final PeproBlock PALLADIUM_ORE;
    public static final PeproBlock PHOSPHORUS_ORE;
    public static final PeproBlock PLATINUM_ORE;
    public static final PeproBlock SILICON_ORE;
    public static final PeproBlock SILVER_ORE;
    public static final PeproBlock SULFUR_ORE;
    public static final PeproBlock VANADIUM_ORE;
    public static final PeproBlock ZINC_ORE;

    public static final PeproBlock DEEPSLATE_ALUMINIUM_ORE;
    public static final PeproBlock DEEPSLATE_ANTIMONY_ORE;
    public static final PeproBlock DEEPSLATE_BISMUTH_ORE;
    public static final PeproBlock DEEPSLATE_BORON_ORE;
    public static final PeproBlock DEEPSLATE_CADMIUM_ORE;
    public static final PeproBlock DEEPSLATE_CARBON_ORE;
    public static final PeproBlock DEEPSLATE_CHROMIUM_ORE;
    public static final PeproBlock DEEPSLATE_COBALT_ORE;
    public static final PeproBlock DEEPSLATE_GERMANIUM_ORE;
    public static final PeproBlock DEEPSLATE_LEAD_ORE;
    public static final PeproBlock DEEPSLATE_LITHIUM_ORE;
    public static final PeproBlock DEEPSLATE_MANGANESE_ORE;
    public static final PeproBlock DEEPSLATE_MAGNESIUM_ORE;
    public static final PeproBlock DEEPSLATE_MERCURY_ORE;
    public static final PeproBlock DEEPSLATE_MOLYBDENUM_ORE;
    public static final PeproBlock DEEPSLATE_NICKEL_ORE;
    public static final PeproBlock DEEPSLATE_NIOBIUM_ORE;
    public static final PeproBlock DEEPSLATE_TIN_ORE;
    public static final PeproBlock DEEPSLATE_TITANIUM_ORE;
    public static final PeproBlock DEEPSLATE_TUNGSTEN_ORE;
    public static final PeproBlock DEEPSLATE_TANTALUM_ORE;
    public static final PeproBlock DEEPSLATE_PALLADIUM_ORE;
    public static final PeproBlock DEEPSLATE_PHOSPHORUS_ORE;
    public static final PeproBlock DEEPSLATE_PLATINUM_ORE;
    public static final PeproBlock DEEPSLATE_SILICON_ORE;
    public static final PeproBlock DEEPSLATE_SILVER_ORE;
    public static final PeproBlock DEEPSLATE_SULFUR_ORE;
    public static final PeproBlock DEEPSLATE_VANADIUM_ORE;
    public static final PeproBlock DEEPSLATE_ZINC_ORE;

    public static final PeproBlock ALUMINIUM_BLOCK;
    public static final PeproBlock ANTIMONY_BLOCK;
    public static final PeproBlock BISMUTH_BLOCK;
    public static final PeproBlock BORON_BLOCK;
    public static final PeproBlock CADMIUM_BLOCK;
    public static final PeproBlock CARBON_BLOCK;
    public static final PeproBlock CHROMIUM_BLOCK;
    public static final PeproBlock COBALT_BLOCK;
    public static final PeproBlock GERMANIUM_BLOCK;
    public static final PeproBlock LEAD_BLOCK;
    public static final PeproBlock LITHIUM_BLOCK;
    public static final PeproBlock MANGANESE_BLOCK;
    public static final PeproBlock MAGNESIUM_BLOCK;
    public static final PeproBlock MERCURY_BLOCK;
    public static final PeproBlock MOLYBDENUM_BLOCK;
    public static final PeproBlock NICKEL_BLOCK;
    public static final PeproBlock NIOBIUM_BLOCK;
    public static final PeproBlock TIN_BLOCK;
    public static final PeproBlock TITANIUM_BLOCK;
    public static final PeproBlock TUNGSTEN_BLOCK;
    public static final PeproBlock TANTALUM_BLOCK;
    public static final PeproBlock PALLADIUM_BLOCK;
    public static final PeproBlock PHOSPHORUS_BLOCK;
    public static final PeproBlock PLATINUM_BLOCK;
    public static final PeproBlock SILICON_BLOCK;
    public static final PeproBlock SILVER_BLOCK;
    public static final PeproBlock SULFUR_BLOCK;
    public static final PeproBlock VANADIUM_BLOCK;
    public static final PeproBlock ZINC_BLOCK;

    public static final PeproBlock AMETHYST_BLOCK;
    public static final PeproBlock AQUAMARINE_BLOCK;
    public static final PeproBlock CITRINE_BLOCK;
    public static final PeproBlock GARNET_BLOCK;
    public static final PeproBlock OPAL_BLOCK;
    public static final PeproBlock PERIDOT_BLOCK ;
    public static final PeproBlock RUBY_BLOCK;
    public static final PeproBlock SAPPHIRE_BLOCK;
    public static final PeproBlock TOPAZ_BLOCK;
    public static final PeproBlock ZIRCON_BLOCK;

    public static final PeproBlock VOID_OPAL_BLOCK;
    public static final PeproBlock LOW_TEMPERATURE_DIAMOND_BLOCK;
    
    
    
    private static PeproBlock register(String id, PeproBlock block) {
        return Registry.register(Registry.BLOCK, new Identifier("pepro", id), block);
    }


    static {
        DEV_MEASURE_GENERIC = register( "dev_measure_generic", new PeproDevBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0f, 3.0f)));
        AMETHYST_ORE = register( "amethyst_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        AQUAMARINE_ORE = register( "aquamarine_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        CITRINE_ORE = register( "citrine_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        GARNET_ORE = register( "garnet_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        OPAL_ORE = register( "opal_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        PERIDOT_ORE = register( "peridot_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        RUBY_ORE = register( "ruby_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        SAPPHIRE_ORE = register( "sapphire_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        TOPAZ_ORE = register( "topaz_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        ZIRCON_ORE = register( "zircon_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));

        DEEPSLATE_AMETHYST_ORE = register( "deepslate_amethyst_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_AQUAMARINE_ORE = register( "deepslate_aquamarine_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_CITRINE_ORE = register( "deepslate_citrine_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_GARNET_ORE = register( "deepslate_garnet_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_OPAL_ORE = register( "deepslate_opal_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_PERIDOT_ORE = register( "deepslate_peridot_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_RUBY_ORE = register( "deepslate_ruby_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_SAPPHIRE_ORE = register( "deepslate_sapphire_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_TOPAZ_ORE = register( "deepslate_topaz_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_ZIRCON_ORE = register( "deepslate_zircon_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).sounds(BlockSoundGroup.STONE).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7))); 
        
        VOID_OPAL_CLUSTER = register( "void_opal_cluster", new PeproBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(1.5f, 1.5f)));
        LOW_TEMPERATURE_DIAMOND_CLUSTER = register( "low_temperature_diamond_cluster", new PeproBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(1.5f, 1.5f)));

        ALUMINIUM_ORE = register( "aluminium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        ANTIMONY_ORE = register( "antimony_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        BISMUTH_ORE = register( "bismuth_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        BORON_ORE = register( "boron_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        CADMIUM_ORE = register( "cadmium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        CARBON_ORE = register( "carbon_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        CHROMIUM_ORE = register( "chromium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        COBALT_ORE = register( "cobalt_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        GERMANIUM_ORE = register( "germanium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        LEAD_ORE = register( "lead_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        LITHIUM_ORE = register( "lithium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        MANGANESE_ORE = register( "manganese_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        MAGNESIUM_ORE = register( "magnesium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        MERCURY_ORE = register( "mercury_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        NICKEL_ORE = register( "nickel_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        MOLYBDENUM_ORE = register( "molybdenum_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        NIOBIUM_ORE = register( "niobium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        TIN_ORE = register( "tin_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        TITANIUM_ORE = register( "titanium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        TUNGSTEN_ORE = register( "tungsten_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        TANTALUM_ORE = register( "tantalum_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        PALLADIUM_ORE = register( "palladium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        PHOSPHORUS_ORE = register( "phosphorus_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        PLATINUM_ORE = register( "platinum_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        SILICON_ORE = register( "silicon_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        SILVER_ORE = register( "silver_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        SULFUR_ORE = register( "sulfur_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        VANADIUM_ORE = register( "vanadium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));
        ZINC_ORE = register( "zinc_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));

        DEEPSLATE_ALUMINIUM_ORE = register( "deepslate_aluminium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_ANTIMONY_ORE = register( "deepslate_antimony_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_BISMUTH_ORE = register( "deepslate_bismuth_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_BORON_ORE = register( "deepslate_boron_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_CADMIUM_ORE = register( "deepslate_cadmium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_CARBON_ORE = register( "deepslate_carbon_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_CHROMIUM_ORE = register( "deepslate_chromium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_COBALT_ORE = register( "deepslate_cobalt_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_GERMANIUM_ORE = register( "deepslate_germanium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_LEAD_ORE = register( "deepslate_lead_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_LITHIUM_ORE = register( "deepslate_lithium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_MANGANESE_ORE = register( "deepslate_manganese_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_MAGNESIUM_ORE = register( "deepslate_magnesium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_MERCURY_ORE = register( "deepslate_mercury_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_MOLYBDENUM_ORE = register( "deepslate_molybdenum_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_NICKEL_ORE = register( "deepslate_nickel_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_NIOBIUM_ORE = register( "deepslate_niobium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_TIN_ORE = register( "deepslate_tin_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_TITANIUM_ORE = register( "deepslate_titanium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_TUNGSTEN_ORE = register( "deepslate_tungsten_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_TANTALUM_ORE = register( "deepslate_tantalum_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_PALLADIUM_ORE = register( "deepslate_palladium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_PHOSPHORUS_ORE = register( "deepslate_phosphorus_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_PLATINUM_ORE = register( "deepslate_platinum_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_SILICON_ORE = register( "deepslate_silicon_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_SILVER_ORE = register( "deepslate_silver_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_SULFUR_ORE = register( "deepslate_sulfur_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_VANADIUM_ORE = register( "deepslate_vanadium_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));
        DEEPSLATE_ZINC_ORE = register( "deepslate_zinc_ore", new PeproOreBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4.5f, 3.0f), UniformIntProvider.create(3, 7)));

        ALUMINIUM_BLOCK = register( "aluminium_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        ANTIMONY_BLOCK = register( "antimony_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        BISMUTH_BLOCK = register( "bismuth_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        BORON_BLOCK = register( "boron_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        CADMIUM_BLOCK = register( "cadmium_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        CARBON_BLOCK = register( "carbon_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        CHROMIUM_BLOCK = register( "chromium_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        COBALT_BLOCK = register( "cobalt_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        GERMANIUM_BLOCK = register( "germanium_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        LEAD_BLOCK = register( "lead_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        LITHIUM_BLOCK = register( "lithium_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        MANGANESE_BLOCK = register( "manganese_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        MAGNESIUM_BLOCK = register( "magnesium_block", new MagnesiumBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        MERCURY_BLOCK = register( "mercury_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        MOLYBDENUM_BLOCK = register( "molybdenum_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        NICKEL_BLOCK = register( "nickel_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        NIOBIUM_BLOCK = register( "niobium_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        TIN_BLOCK = register( "tin_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        TITANIUM_BLOCK = register( "titanium_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        TUNGSTEN_BLOCK = register( "tungsten_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        TANTALUM_BLOCK = register( "tantalum_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        PALLADIUM_BLOCK = register( "palladium_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        PHOSPHORUS_BLOCK = register( "phosphorus_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        PLATINUM_BLOCK = register( "platinum_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        SILICON_BLOCK = register( "silicon_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        SILVER_BLOCK = register( "silver_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        SULFUR_BLOCK = register( "sulfur_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        VANADIUM_BLOCK = register( "vanadium_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        ZINC_BLOCK = register( "zinc_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));

        AMETHYST_BLOCK = register( "amethyst_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        AQUAMARINE_BLOCK = register( "aquamarine_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        CITRINE_BLOCK = register( "citrine_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        GARNET_BLOCK = register( "garnet_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        OPAL_BLOCK = register( "opal_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        PERIDOT_BLOCK  = register( "peridot_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        RUBY_BLOCK = register( "ruby_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        SAPPHIRE_BLOCK = register( "sapphire_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        TOPAZ_BLOCK = register( "topaz_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        ZIRCON_BLOCK = register( "zircon_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));

        VOID_OPAL_BLOCK = register( "void_opal_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
        LOW_TEMPERATURE_DIAMOND_BLOCK = register( "low_temperature_diamond_block", new PeproBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(5f, 6f)));
    }
}
