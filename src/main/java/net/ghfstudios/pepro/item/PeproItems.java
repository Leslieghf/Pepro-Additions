package net.ghfstudios.pepro.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.ghfstudios.pepro.block.PeproBlock;
import net.ghfstudios.pepro.block.PeproBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class PeproItems {

    //BlockItems
    public static final BlockItem DEV_MEASURE_GENERIC;
    
    public static final BlockItem AMETHYST_ORE;
    public static final BlockItem AQUAMARINE_ORE;
    public static final BlockItem CITRINE_ORE;
    public static final BlockItem GARNET_ORE;
    public static final BlockItem OPAL_ORE;
    public static final BlockItem PERIDOT_ORE ;
    public static final BlockItem RUBY_ORE;
    public static final BlockItem SAPPHIRE_ORE;
    public static final BlockItem TOPAZ_ORE;
    public static final BlockItem ZIRCON_ORE;

    public static final BlockItem DEEPSLATE_AMETHYST_ORE;
    public static final BlockItem DEEPSLATE_AQUAMARINE_ORE;
    public static final BlockItem DEEPSLATE_CITRINE_ORE;
    public static final BlockItem DEEPSLATE_GARNET_ORE;
    public static final BlockItem DEEPSLATE_OPAL_ORE;
    public static final BlockItem DEEPSLATE_PERIDOT_ORE ;
    public static final BlockItem DEEPSLATE_RUBY_ORE;
    public static final BlockItem DEEPSLATE_SAPPHIRE_ORE;
    public static final BlockItem DEEPSLATE_TOPAZ_ORE;
    public static final BlockItem DEEPSLATE_ZIRCON_ORE;

    public static final BlockItem AQUAMARINE_BLOCK;
    public static final BlockItem CITRINE_BLOCK;
    public static final BlockItem GARNET_BLOCK;
    public static final BlockItem OPAL_BLOCK;
    public static final BlockItem PERIDOT_BLOCK ;
    public static final BlockItem RUBY_BLOCK;
    public static final BlockItem SAPPHIRE_BLOCK;
    public static final BlockItem TOPAZ_BLOCK;
    public static final BlockItem ZIRCON_BLOCK;

    public static final BlockItem VOID_OPAL_BLOCK;
    public static final BlockItem LOW_TEMPERATURE_DIAMOND_BLOCK;

    public static final BlockItem AQUAMARINE_CLUSTER;
    public static final BlockItem CITRINE_CLUSTER;
    public static final BlockItem GARNET_CLUSTER;
    public static final BlockItem OPAL_CLUSTER;
    public static final BlockItem PERIDOT_CLUSTER;
    public static final BlockItem RUBY_CLUSTER;
    public static final BlockItem SAPPHIRE_CLUSTER;
    public static final BlockItem TOPAZ_CLUSTER;
    public static final BlockItem ZIRCON_CLUSTER;

    public static final BlockItem VOID_OPAL_CLUSTER;
    public static final BlockItem LOW_TEMPERATURE_DIAMOND_CLUSTER;

    public static final BlockItem BUDDING_AQUAMARINE;
    public static final BlockItem BUDDING_CITRINE;
    public static final BlockItem BUDDING_GARNET;
    public static final BlockItem BUDDING_OPAL;
    public static final BlockItem BUDDING_PERIDOT;
    public static final BlockItem BUDDING_RUBY;
    public static final BlockItem BUDDING_SAPPHIRE;
    public static final BlockItem BUDDING_TOPAZ;
    public static final BlockItem BUDDING_ZIRCON;

    public static final BlockItem SMALL_AQUAMARINE_BUD;
    public static final BlockItem SMALL_CITRINE_BUD;
    public static final BlockItem SMALL_GARNET_BUD;
    public static final BlockItem SMALL_OPAL_BUD;
    public static final BlockItem SMALL_PERIDOT_BUD;
    public static final BlockItem SMALL_RUBY_BUD;
    public static final BlockItem SMALL_SAPPHIRE_BUD;
    public static final BlockItem SMALL_TOPAZ_BUD;
    public static final BlockItem SMALL_ZIRCON_BUD;

    public static final BlockItem MEDIUM_AQUAMARINE_BUD;
    public static final BlockItem MEDIUM_CITRINE_BUD;
    public static final BlockItem MEDIUM_GARNET_BUD;
    public static final BlockItem MEDIUM_OPAL_BUD;
    public static final BlockItem MEDIUM_PERIDOT_BUD;
    public static final BlockItem MEDIUM_RUBY_BUD;
    public static final BlockItem MEDIUM_SAPPHIRE_BUD;
    public static final BlockItem MEDIUM_TOPAZ_BUD;
    public static final BlockItem MEDIUM_ZIRCON_BUD;

    public static final BlockItem LARGE_AQUAMARINE_BUD;
    public static final BlockItem LARGE_CITRINE_BUD;
    public static final BlockItem LARGE_GARNET_BUD;
    public static final BlockItem LARGE_OPAL_BUD;
    public static final BlockItem LARGE_PERIDOT_BUD;
    public static final BlockItem LARGE_RUBY_BUD;
    public static final BlockItem LARGE_SAPPHIRE_BUD;
    public static final BlockItem LARGE_TOPAZ_BUD;
    public static final BlockItem LARGE_ZIRCON_BUD;


    public static final BlockItem ALUMINIUM_ORE;
    public static final BlockItem ANTIMONY_ORE;
    public static final BlockItem BISMUTH_ORE;
    public static final BlockItem BORON_ORE;
    public static final BlockItem CADMIUM_ORE;
    public static final BlockItem CARBON_ORE;
    public static final BlockItem CHROMIUM_ORE;
    public static final BlockItem COBALT_ORE;
    public static final BlockItem GERMANIUM_ORE;
    public static final BlockItem LEAD_ORE;
    public static final BlockItem LITHIUM_ORE;
    public static final BlockItem MANGANESE_ORE;
    public static final BlockItem MAGNESIUM_ORE;
    public static final BlockItem MERCURY_ORE;
    public static final BlockItem MOLYBDENUM_ORE;
    public static final BlockItem NICKEL_ORE;
    public static final BlockItem NIOBIUM_ORE;
    public static final BlockItem TIN_ORE;
    public static final BlockItem TITANIUM_ORE;
    public static final BlockItem TUNGSTEN_ORE;
    public static final BlockItem TANTALUM_ORE;
    public static final BlockItem PALLADIUM_ORE;
    public static final BlockItem PHOSPHORUS_ORE;
    public static final BlockItem PLATINUM_ORE;
    public static final BlockItem SILICON_ORE;
    public static final BlockItem SILVER_ORE;
    public static final BlockItem SULFUR_ORE;
    public static final BlockItem VANADIUM_ORE;
    public static final BlockItem ZINC_ORE;

    public static final BlockItem DEEPSLATE_ALUMINIUM_ORE;
    public static final BlockItem DEEPSLATE_ANTIMONY_ORE;
    public static final BlockItem DEEPSLATE_BISMUTH_ORE;
    public static final BlockItem DEEPSLATE_BORON_ORE;
    public static final BlockItem DEEPSLATE_CADMIUM_ORE;
    public static final BlockItem DEEPSLATE_CARBON_ORE;
    public static final BlockItem DEEPSLATE_CHROMIUM_ORE;
    public static final BlockItem DEEPSLATE_COBALT_ORE;
    public static final BlockItem DEEPSLATE_GERMANIUM_ORE;
    public static final BlockItem DEEPSLATE_LEAD_ORE;
    public static final BlockItem DEEPSLATE_LITHIUM_ORE;
    public static final BlockItem DEEPSLATE_MANGANESE_ORE;
    public static final BlockItem DEEPSLATE_MAGNESIUM_ORE;
    public static final BlockItem DEEPSLATE_MERCURY_ORE;
    public static final BlockItem DEEPSLATE_MOLYBDENUM_ORE;
    public static final BlockItem DEEPSLATE_NICKEL_ORE;
    public static final BlockItem DEEPSLATE_NIOBIUM_ORE;
    public static final BlockItem DEEPSLATE_TIN_ORE;
    public static final BlockItem DEEPSLATE_TITANIUM_ORE;
    public static final BlockItem DEEPSLATE_TUNGSTEN_ORE;
    public static final BlockItem DEEPSLATE_TANTALUM_ORE;
    public static final BlockItem DEEPSLATE_PALLADIUM_ORE;
    public static final BlockItem DEEPSLATE_PHOSPHORUS_ORE;
    public static final BlockItem DEEPSLATE_PLATINUM_ORE;
    public static final BlockItem DEEPSLATE_SILICON_ORE;
    public static final BlockItem DEEPSLATE_SILVER_ORE;
    public static final BlockItem DEEPSLATE_SULFUR_ORE;
    public static final BlockItem DEEPSLATE_VANADIUM_ORE;
    public static final BlockItem DEEPSLATE_ZINC_ORE;
    
    public static final BlockItem ALUMINIUM_BLOCK;
    public static final BlockItem ANTIMONY_BLOCK;
    public static final BlockItem BISMUTH_BLOCK;
    public static final BlockItem BORON_BLOCK;
    public static final BlockItem CADMIUM_BLOCK;
    public static final BlockItem CARBON_BLOCK;
    public static final BlockItem CHROMIUM_BLOCK;
    public static final BlockItem COBALT_BLOCK;
    public static final BlockItem GERMANIUM_BLOCK;
    public static final BlockItem LEAD_BLOCK;
    public static final BlockItem LITHIUM_BLOCK;
    public static final BlockItem MANGANESE_BLOCK;
    public static final BlockItem MAGNESIUM_BLOCK;
    public static final BlockItem MERCURY_BLOCK;
    public static final BlockItem MOLYBDENUM_BLOCK;
    public static final BlockItem NICKEL_BLOCK;
    public static final BlockItem NIOBIUM_BLOCK;
    public static final BlockItem TIN_BLOCK;
    public static final BlockItem TITANIUM_BLOCK;
    public static final BlockItem TUNGSTEN_BLOCK;
    public static final BlockItem TANTALUM_BLOCK;
    public static final BlockItem PALLADIUM_BLOCK;
    public static final BlockItem PHOSPHORUS_BLOCK;
    public static final BlockItem PLATINUM_BLOCK;
    public static final BlockItem SILICON_BLOCK;
    public static final BlockItem SILVER_BLOCK;
    public static final BlockItem SULFUR_BLOCK;
    public static final BlockItem VANADIUM_BLOCK;
    public static final BlockItem ZINC_BLOCK;

    public static final BlockItem COMPRESSION_CRAFTING_TABLE;
    public static final BlockItem WAX_INJECTOR;
    public static final BlockItem WAX_ASSEMBLER;
    public static final BlockItem SLURRY_COATER;
    public static final BlockItem STUCCOER;
    public static final BlockItem DEWAXER;
    public static final BlockItem CASTER;
    public static final BlockItem SHELL_REMOVER;
    public static final BlockItem OFFCUTTER;
    public static final BlockItem FINISHER;
    public static final BlockItem INSPECTOR;

    public static final BlockItem CONDUIT;









    public static final PeproItem AMETHYST;
    public static final PeproItem AQUAMARINE;
    public static final PeproItem CITRINE;
    public static final PeproItem GARNET;
    public static final PeproItem OPAL;
    public static final PeproItem PERIDOT;
    public static final PeproItem RUBY;
    public static final PeproItem SAPPHIRE;
    public static final PeproItem TOPAZ;
    public static final PeproItem ZIRCON;

    public static final PeproItem VOID_OPAL;
    public static final PeproItem LOW_TEMPERATURE_DIAMOND;

    public static final PeproItem RAW_ALUMINIUM;
    public static final PeproItem RAW_ANTIMONY;
    public static final PeproItem RAW_BISMUTH;
    public static final PeproItem RAW_BORON;
    public static final PeproItem RAW_CADMIUM;
    public static final PeproItem RAW_CARBON;
    public static final PeproItem RAW_CHROMIUM;
    public static final PeproItem RAW_COBALT;
    public static final PeproItem RAW_GERMANIUM;
    public static final PeproItem RAW_LEAD;
    public static final PeproItem RAW_LITHIUM;
    public static final PeproItem RAW_MANGANESE;
    public static final PeproItem RAW_MAGNESIUM;
    public static final PeproItem RAW_MERCURY;
    public static final PeproItem RAW_MOLYBDENUM;
    public static final PeproItem RAW_NICKEL;
    public static final PeproItem RAW_NIOBIUM;
    public static final PeproItem RAW_TIN;
    public static final PeproItem RAW_TITANIUM;
    public static final PeproItem RAW_TUNGSTEN;
    public static final PeproItem RAW_TANTALUM;
    public static final PeproItem RAW_PALLADIUM;
    public static final PeproItem RAW_PHOSPHORUS;
    public static final PeproItem RAW_PLATINUM;
    public static final PeproItem RAW_SILICON;
    public static final PeproItem RAW_SILVER;
    public static final PeproItem RAW_SULFUR;
    public static final PeproItem RAW_VANADIUM;
    public static final PeproItem RAW_ZINC;
    
    public static final PeproItem ALUMINIUM_INGOT;
    public static final PeproItem ANTIMONY_INGOT;
    public static final PeproItem BISMUTH_INGOT;
    public static final PeproItem BORON_INGOT;
    public static final PeproItem CADMIUM_INGOT;
    public static final PeproItem CARBON_INGOT;
    public static final PeproItem CHROMIUM_INGOT;
    public static final PeproItem COBALT_INGOT;
    public static final PeproItem GERMANIUM_INGOT;
    public static final PeproItem LEAD_INGOT;
    public static final PeproItem LITHIUM_INGOT;
    public static final PeproItem MANGANESE_INGOT;
    public static final PeproItem MAGNESIUM_INGOT;
    public static final PeproItem MERCURY_INGOT;
    public static final PeproItem MOLYBDENUM_INGOT;
    public static final PeproItem NICKEL_INGOT;
    public static final PeproItem NIOBIUM_INGOT;
    public static final PeproItem TIN_INGOT;
    public static final PeproItem TITANIUM_INGOT;
    public static final PeproItem TUNGSTEN_INGOT;
    public static final PeproItem TANTALUM_INGOT;
    public static final PeproItem PALLADIUM_INGOT;
    public static final PeproItem PHOSPHORUS_INGOT;
    public static final PeproItem PLATINUM_INGOT;
    public static final PeproItem SILICON_INGOT;
    public static final PeproItem SILVER_INGOT;
    public static final PeproItem SULFUR_INGOT;
    public static final PeproItem VANADIUM_INGOT;
    public static final PeproItem ZINC_INGOT;

    public static final PeproItem AMALGAM_INGOT;
    public static final PeproItem ALNICO_INGOT;
    public static final PeproItem BABBIT_INGOT;
    public static final PeproItem BILLON_INGOT;
    public static final PeproItem BRASS_INGOT;
    public static final PeproItem BRONZE_INGOT;
    public static final PeproItem CAST_IRON_INGOT;
    public static final PeproItem DURALUMIN_INGOT;
    public static final PeproItem ELECTRUM_INGOT;
    public static final PeproItem GERMAN_SILVER_INGOT;
    public static final PeproItem GUNMETAL_INGOT;
    public static final PeproItem MAGNOX_INGOT;
    public static final PeproItem PEWTER_INGOT;
    public static final PeproItem ROSE_GOLD_INGOT;
    public static final PeproItem SOLDER_INGOT;
    public static final PeproItem STERLING_SILVER_INGOT;
    public static final PeproItem WHITE_GOLD_INGOT;
    public static final PeproItem WOODS_METAL_INGOT;


    public static final PeproItem BASIC_STAINLESS_STEEL_INGOT;
    public static final PeproItem STERILE_STAINLESS_STEEL_INGOT;
    public static final PeproItem RESISTANT_STAINLESS_STEEL_INGOT;
    public static final PeproItem CRUDE_STEEL_INGOT;
    public static final PeproItem LOW_CARBON_STEEL_INGOT;
    public static final PeproItem MEDIUM_CARBON_STEEL_INGOT;
    public static final PeproItem HIGH_CARBON_STEEL_INGOT;
    public static final PeproItem ULTRA_HIGH_CARBON_STEEL_INGOT;
    public static final PeproItem CARBON_NANOTUBE_INFUSED_STEEL_INGOT;

    public static final PeproItem CRYSTALLINE_PROTOSTRUCTURE;
    public static final PeproItem SMALL_CRYSTAL_MATRIX;
    public static final PeproItem MEDIUM_CRYSTAL_MATRIX;
    public static final PeproItem LARGE_CRYSTAL_MATRIX;
    public static final PeproItem DENSE_CRYSTAL_MATRIX;
    public static final PeproItem ULTRA_DENSE_CRYSTAL_MATRIX;
    public static final PeproItem QUANTUM_CRYSTAL_MATRIX;
    public static final PeproItem ENTANGLED_QUANTUM_CRYSTAL_MATRIX;

    public static final PeproItem CARBON_NANOTUBE;
    public static final Item CARBON_NANOTUBE_SWORD;
    public static final Item CARBON_NANOTUBE_SHOVEL;
    public static final Item CARBON_NANOTUBE_PICKAXE;
    public static final Item CARBON_NANOTUBE_AXE;
    public static final Item CARBON_NANOTUBE_HOE;

    public static final Item QUANTUM_DECIMATOR;

    //////CHANGE TO CUSTOM PEPRO TOOL ITEM CLASSES//////




    //Methods
    private static PeproBlockItem register(PeproBlock block, ItemGroup group) {
        return Registry.register(Registry.ITEM, Registry.BLOCK.getId(block), new PeproBlockItem(block, (new PeproItem.Settings()).group(group)));
    }

    private static PeproBlockItem register(Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, Registry.BLOCK.getId(block), new PeproBlockItem(block, (new PeproItem.Settings()).group(group)));
    }

    private static PeproItem register(String id, PeproItem item) {
        return Registry.register(Registry.ITEM, new Identifier("pepro", id), item);
    }

    private static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("pepro", id), item);
    }

    //Item registrations
    static {
        //BlockItems
        DEV_MEASURE_GENERIC = register(PeproBlocks.DEV_MEASURE_GENERIC, ItemGroup.MISC);
        AMETHYST_ORE = register(PeproBlocks.AMETHYST_ORE, ItemGroup.BUILDING_BLOCKS);
        AQUAMARINE_ORE = register(PeproBlocks.AQUAMARINE_ORE, ItemGroup.BUILDING_BLOCKS);
        CITRINE_ORE = register(PeproBlocks.CITRINE_ORE, ItemGroup.BUILDING_BLOCKS);
        GARNET_ORE = register(PeproBlocks.GARNET_ORE, ItemGroup.BUILDING_BLOCKS);
        OPAL_ORE = register(PeproBlocks.OPAL_ORE, ItemGroup.BUILDING_BLOCKS);
        PERIDOT_ORE = register(PeproBlocks.PERIDOT_ORE, ItemGroup.BUILDING_BLOCKS);
        RUBY_ORE = register(PeproBlocks.RUBY_ORE, ItemGroup.BUILDING_BLOCKS);
        SAPPHIRE_ORE = register(PeproBlocks.SAPPHIRE_ORE, ItemGroup.BUILDING_BLOCKS);
        TOPAZ_ORE = register(PeproBlocks.TOPAZ_ORE, ItemGroup.BUILDING_BLOCKS);
        ZIRCON_ORE = register(PeproBlocks.ZIRCON_ORE, ItemGroup.BUILDING_BLOCKS);

        DEEPSLATE_AMETHYST_ORE = register(PeproBlocks.DEEPSLATE_AMETHYST_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_AQUAMARINE_ORE = register(PeproBlocks.DEEPSLATE_AQUAMARINE_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_CITRINE_ORE = register(PeproBlocks.DEEPSLATE_CITRINE_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_GARNET_ORE = register(PeproBlocks.DEEPSLATE_GARNET_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_OPAL_ORE = register(PeproBlocks.DEEPSLATE_OPAL_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_PERIDOT_ORE  = register(PeproBlocks.DEEPSLATE_PERIDOT_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_RUBY_ORE = register(PeproBlocks.DEEPSLATE_RUBY_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_SAPPHIRE_ORE = register(PeproBlocks.DEEPSLATE_SAPPHIRE_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_TOPAZ_ORE = register(PeproBlocks.DEEPSLATE_TOPAZ_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_ZIRCON_ORE = register(PeproBlocks.DEEPSLATE_ZIRCON_ORE, ItemGroup.BUILDING_BLOCKS);

        AQUAMARINE_BLOCK = register(PeproBlocks.AQUAMARINE_BLOCK, ItemGroup.BUILDING_BLOCKS);
        CITRINE_BLOCK = register(PeproBlocks.CITRINE_BLOCK, ItemGroup.BUILDING_BLOCKS);
        GARNET_BLOCK = register(PeproBlocks.GARNET_BLOCK, ItemGroup.BUILDING_BLOCKS);
        OPAL_BLOCK = register(PeproBlocks.OPAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
        PERIDOT_BLOCK  = register(PeproBlocks.PERIDOT_BLOCK, ItemGroup.BUILDING_BLOCKS);
        RUBY_BLOCK = register(PeproBlocks.RUBY_BLOCK, ItemGroup.BUILDING_BLOCKS);
        SAPPHIRE_BLOCK = register(PeproBlocks.SAPPHIRE_BLOCK, ItemGroup.BUILDING_BLOCKS);
        TOPAZ_BLOCK = register(PeproBlocks.TOPAZ_BLOCK, ItemGroup.BUILDING_BLOCKS);
        ZIRCON_BLOCK = register(PeproBlocks.ZIRCON_BLOCK, ItemGroup.BUILDING_BLOCKS);

        VOID_OPAL_BLOCK = register(PeproBlocks.VOID_OPAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
        LOW_TEMPERATURE_DIAMOND_BLOCK = register(PeproBlocks.LOW_TEMPERATURE_DIAMOND_BLOCK, ItemGroup.BUILDING_BLOCKS);

        AQUAMARINE_CLUSTER = register(PeproBlocks.AQUAMARINE_CLUSTER, ItemGroup.BUILDING_BLOCKS);
        CITRINE_CLUSTER = register(PeproBlocks.CITRINE_CLUSTER, ItemGroup.BUILDING_BLOCKS);
        GARNET_CLUSTER = register(PeproBlocks.GARNET_CLUSTER, ItemGroup.BUILDING_BLOCKS);
        OPAL_CLUSTER = register(PeproBlocks.OPAL_CLUSTER, ItemGroup.BUILDING_BLOCKS);
        PERIDOT_CLUSTER = register(PeproBlocks.PERIDOT_CLUSTER, ItemGroup.BUILDING_BLOCKS);
        RUBY_CLUSTER = register(PeproBlocks.RUBY_CLUSTER, ItemGroup.BUILDING_BLOCKS);
        SAPPHIRE_CLUSTER = register(PeproBlocks.SAPPHIRE_CLUSTER, ItemGroup.BUILDING_BLOCKS);
        TOPAZ_CLUSTER = register(PeproBlocks.TOPAZ_CLUSTER, ItemGroup.BUILDING_BLOCKS);
        ZIRCON_CLUSTER = register(PeproBlocks.ZIRCON_CLUSTER, ItemGroup.BUILDING_BLOCKS);
        
        VOID_OPAL_CLUSTER = register(PeproBlocks.VOID_OPAL_CLUSTER, ItemGroup.BUILDING_BLOCKS);
        LOW_TEMPERATURE_DIAMOND_CLUSTER = register(PeproBlocks.LOW_TEMPERATURE_DIAMOND_CLUSTER, ItemGroup.BUILDING_BLOCKS);
        
        BUDDING_AQUAMARINE = register(PeproBlocks.BUDDING_AQUAMARINE, ItemGroup.BUILDING_BLOCKS);
        BUDDING_CITRINE = register(PeproBlocks.BUDDING_CITRINE, ItemGroup.BUILDING_BLOCKS);
        BUDDING_GARNET = register(PeproBlocks.BUDDING_GARNET, ItemGroup.BUILDING_BLOCKS);
        BUDDING_OPAL = register(PeproBlocks.BUDDING_OPAL, ItemGroup.BUILDING_BLOCKS);
        BUDDING_PERIDOT = register(PeproBlocks.BUDDING_PERIDOT, ItemGroup.BUILDING_BLOCKS);
        BUDDING_RUBY = register(PeproBlocks.BUDDING_RUBY, ItemGroup.BUILDING_BLOCKS);
        BUDDING_SAPPHIRE = register(PeproBlocks.BUDDING_SAPPHIRE, ItemGroup.BUILDING_BLOCKS);
        BUDDING_TOPAZ = register(PeproBlocks.BUDDING_TOPAZ, ItemGroup.BUILDING_BLOCKS);
        BUDDING_ZIRCON = register(PeproBlocks.BUDDING_ZIRCON, ItemGroup.BUILDING_BLOCKS);

        SMALL_AQUAMARINE_BUD = register(PeproBlocks.SMALL_AQUAMARINE_BUD, ItemGroup.BUILDING_BLOCKS);
        SMALL_CITRINE_BUD = register(PeproBlocks.SMALL_CITRINE_BUD, ItemGroup.BUILDING_BLOCKS);
        SMALL_GARNET_BUD = register(PeproBlocks.SMALL_GARNET_BUD, ItemGroup.BUILDING_BLOCKS);
        SMALL_OPAL_BUD = register(PeproBlocks.SMALL_OPAL_BUD, ItemGroup.BUILDING_BLOCKS);
        SMALL_PERIDOT_BUD = register(PeproBlocks.SMALL_PERIDOT_BUD, ItemGroup.BUILDING_BLOCKS);
        SMALL_RUBY_BUD = register(PeproBlocks.SMALL_RUBY_BUD, ItemGroup.BUILDING_BLOCKS);
        SMALL_SAPPHIRE_BUD = register(PeproBlocks.SMALL_SAPPHIRE_BUD, ItemGroup.BUILDING_BLOCKS);
        SMALL_TOPAZ_BUD = register(PeproBlocks.SMALL_TOPAZ_BUD, ItemGroup.BUILDING_BLOCKS);
        SMALL_ZIRCON_BUD = register(PeproBlocks.SMALL_ZIRCON_BUD, ItemGroup.BUILDING_BLOCKS);

        MEDIUM_AQUAMARINE_BUD = register(PeproBlocks.MEDIUM_AQUAMARINE_BUD, ItemGroup.BUILDING_BLOCKS);
        MEDIUM_CITRINE_BUD = register(PeproBlocks.MEDIUM_CITRINE_BUD, ItemGroup.BUILDING_BLOCKS);
        MEDIUM_GARNET_BUD = register(PeproBlocks.MEDIUM_GARNET_BUD, ItemGroup.BUILDING_BLOCKS);
        MEDIUM_OPAL_BUD = register(PeproBlocks.MEDIUM_OPAL_BUD, ItemGroup.BUILDING_BLOCKS);
        MEDIUM_PERIDOT_BUD = register(PeproBlocks.MEDIUM_PERIDOT_BUD, ItemGroup.BUILDING_BLOCKS);
        MEDIUM_RUBY_BUD = register(PeproBlocks.MEDIUM_RUBY_BUD, ItemGroup.BUILDING_BLOCKS);
        MEDIUM_SAPPHIRE_BUD = register(PeproBlocks.MEDIUM_SAPPHIRE_BUD, ItemGroup.BUILDING_BLOCKS);
        MEDIUM_TOPAZ_BUD = register(PeproBlocks.MEDIUM_TOPAZ_BUD, ItemGroup.BUILDING_BLOCKS);
        MEDIUM_ZIRCON_BUD = register(PeproBlocks.MEDIUM_ZIRCON_BUD, ItemGroup.BUILDING_BLOCKS);

        LARGE_AQUAMARINE_BUD = register(PeproBlocks.LARGE_AQUAMARINE_BUD, ItemGroup.BUILDING_BLOCKS);
        LARGE_CITRINE_BUD = register(PeproBlocks.LARGE_CITRINE_BUD, ItemGroup.BUILDING_BLOCKS);
        LARGE_GARNET_BUD = register(PeproBlocks.LARGE_GARNET_BUD, ItemGroup.BUILDING_BLOCKS);
        LARGE_OPAL_BUD = register(PeproBlocks.LARGE_OPAL_BUD, ItemGroup.BUILDING_BLOCKS);
        LARGE_PERIDOT_BUD = register(PeproBlocks.LARGE_PERIDOT_BUD, ItemGroup.BUILDING_BLOCKS);
        LARGE_RUBY_BUD = register(PeproBlocks.LARGE_RUBY_BUD, ItemGroup.BUILDING_BLOCKS);
        LARGE_SAPPHIRE_BUD = register(PeproBlocks.LARGE_SAPPHIRE_BUD, ItemGroup.BUILDING_BLOCKS);
        LARGE_TOPAZ_BUD = register(PeproBlocks.LARGE_TOPAZ_BUD, ItemGroup.BUILDING_BLOCKS);
        LARGE_ZIRCON_BUD = register(PeproBlocks.LARGE_ZIRCON_BUD, ItemGroup.BUILDING_BLOCKS);

        
        ALUMINIUM_ORE = register(PeproBlocks.ALUMINIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        ANTIMONY_ORE = register(PeproBlocks.ANTIMONY_ORE, ItemGroup.BUILDING_BLOCKS);
        BISMUTH_ORE = register(PeproBlocks.BISMUTH_ORE, ItemGroup.BUILDING_BLOCKS);
        BORON_ORE = register(PeproBlocks.BORON_ORE, ItemGroup.BUILDING_BLOCKS);
        CADMIUM_ORE = register(PeproBlocks.CADMIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        CARBON_ORE = register(PeproBlocks.CARBON_ORE, ItemGroup.BUILDING_BLOCKS);
        CHROMIUM_ORE = register(PeproBlocks.CHROMIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        COBALT_ORE = register(PeproBlocks.COBALT_ORE, ItemGroup.BUILDING_BLOCKS);
        GERMANIUM_ORE = register(PeproBlocks.GERMANIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        LEAD_ORE = register(PeproBlocks.LEAD_ORE, ItemGroup.BUILDING_BLOCKS);
        LITHIUM_ORE = register(PeproBlocks.LITHIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        MANGANESE_ORE = register(PeproBlocks.MANGANESE_ORE, ItemGroup.BUILDING_BLOCKS);
        MAGNESIUM_ORE = register(PeproBlocks.MAGNESIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        MERCURY_ORE = register(PeproBlocks.MERCURY_ORE, ItemGroup.BUILDING_BLOCKS);
        MOLYBDENUM_ORE = register(PeproBlocks.MOLYBDENUM_ORE, ItemGroup.BUILDING_BLOCKS);
        NICKEL_ORE = register(PeproBlocks.NICKEL_ORE, ItemGroup.BUILDING_BLOCKS);
        NIOBIUM_ORE = register(PeproBlocks.NIOBIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        TIN_ORE = register(PeproBlocks.TIN_ORE, ItemGroup.BUILDING_BLOCKS);
        TITANIUM_ORE = register(PeproBlocks.TITANIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        TUNGSTEN_ORE = register(PeproBlocks.TUNGSTEN_ORE, ItemGroup.BUILDING_BLOCKS);
        TANTALUM_ORE = register(PeproBlocks.TANTALUM_ORE, ItemGroup.BUILDING_BLOCKS);
        PALLADIUM_ORE = register(PeproBlocks.PALLADIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        PHOSPHORUS_ORE = register(PeproBlocks.PHOSPHORUS_ORE, ItemGroup.BUILDING_BLOCKS);
        PLATINUM_ORE = register(PeproBlocks.PLATINUM_ORE, ItemGroup.BUILDING_BLOCKS);
        SILICON_ORE = register(PeproBlocks.SILICON_ORE, ItemGroup.BUILDING_BLOCKS);
        SILVER_ORE = register(PeproBlocks.SILVER_ORE, ItemGroup.BUILDING_BLOCKS);
        SULFUR_ORE = register(PeproBlocks.SULFUR_ORE, ItemGroup.BUILDING_BLOCKS);
        VANADIUM_ORE = register(PeproBlocks.VANADIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        ZINC_ORE = register(PeproBlocks.ZINC_ORE, ItemGroup.BUILDING_BLOCKS);

        DEEPSLATE_ALUMINIUM_ORE = register(PeproBlocks.DEEPSLATE_ALUMINIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_ANTIMONY_ORE = register(PeproBlocks.DEEPSLATE_ANTIMONY_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_BISMUTH_ORE = register(PeproBlocks.DEEPSLATE_BISMUTH_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_BORON_ORE = register(PeproBlocks.DEEPSLATE_BORON_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_CADMIUM_ORE = register(PeproBlocks.DEEPSLATE_CADMIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_CARBON_ORE = register(PeproBlocks.DEEPSLATE_CARBON_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_CHROMIUM_ORE = register(PeproBlocks.DEEPSLATE_CHROMIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_COBALT_ORE = register(PeproBlocks.DEEPSLATE_COBALT_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_GERMANIUM_ORE = register(PeproBlocks.DEEPSLATE_GERMANIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_LEAD_ORE = register(PeproBlocks.DEEPSLATE_LEAD_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_LITHIUM_ORE = register(PeproBlocks.DEEPSLATE_LITHIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_MANGANESE_ORE = register(PeproBlocks.DEEPSLATE_MANGANESE_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_MAGNESIUM_ORE = register(PeproBlocks.DEEPSLATE_MAGNESIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_MERCURY_ORE = register(PeproBlocks.DEEPSLATE_MERCURY_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_MOLYBDENUM_ORE = register(PeproBlocks.DEEPSLATE_MOLYBDENUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_NICKEL_ORE = register(PeproBlocks.DEEPSLATE_NICKEL_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_NIOBIUM_ORE = register(PeproBlocks.DEEPSLATE_NIOBIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_TIN_ORE = register(PeproBlocks.DEEPSLATE_TIN_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_TITANIUM_ORE = register(PeproBlocks.DEEPSLATE_TITANIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_TUNGSTEN_ORE = register(PeproBlocks.DEEPSLATE_TUNGSTEN_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_TANTALUM_ORE = register(PeproBlocks.DEEPSLATE_TANTALUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_PALLADIUM_ORE = register(PeproBlocks.DEEPSLATE_PALLADIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_PHOSPHORUS_ORE = register(PeproBlocks.DEEPSLATE_PHOSPHORUS_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_PLATINUM_ORE = register(PeproBlocks.DEEPSLATE_PLATINUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_SILICON_ORE = register(PeproBlocks.DEEPSLATE_SILICON_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_SILVER_ORE = register(PeproBlocks.DEEPSLATE_SILVER_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_SULFUR_ORE = register(PeproBlocks.DEEPSLATE_SULFUR_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_VANADIUM_ORE = register(PeproBlocks.DEEPSLATE_VANADIUM_ORE, ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_ZINC_ORE = register(PeproBlocks.DEEPSLATE_ZINC_ORE, ItemGroup.BUILDING_BLOCKS);

        ALUMINIUM_BLOCK = register(PeproBlocks.ALUMINIUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        ANTIMONY_BLOCK = register(PeproBlocks.ANTIMONY_BLOCK, ItemGroup.BUILDING_BLOCKS);
        BISMUTH_BLOCK = register(PeproBlocks.BISMUTH_BLOCK, ItemGroup.BUILDING_BLOCKS);
        BORON_BLOCK = register(PeproBlocks.BORON_BLOCK, ItemGroup.BUILDING_BLOCKS);
        CADMIUM_BLOCK = register(PeproBlocks.CADMIUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        CARBON_BLOCK = register(PeproBlocks.CARBON_BLOCK, ItemGroup.BUILDING_BLOCKS);
        CHROMIUM_BLOCK = register(PeproBlocks.CHROMIUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        COBALT_BLOCK = register(PeproBlocks.COBALT_BLOCK, ItemGroup.BUILDING_BLOCKS);
        GERMANIUM_BLOCK = register(PeproBlocks.GERMANIUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        LEAD_BLOCK = register(PeproBlocks.LEAD_BLOCK, ItemGroup.BUILDING_BLOCKS);
        LITHIUM_BLOCK = register(PeproBlocks.LITHIUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        MANGANESE_BLOCK = register(PeproBlocks.MANGANESE_BLOCK, ItemGroup.BUILDING_BLOCKS);
        MAGNESIUM_BLOCK = register(PeproBlocks.MAGNESIUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        MERCURY_BLOCK = register(PeproBlocks.MERCURY_BLOCK, ItemGroup.BUILDING_BLOCKS);
        MOLYBDENUM_BLOCK = register(PeproBlocks.MOLYBDENUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        NICKEL_BLOCK = register(PeproBlocks.NICKEL_BLOCK, ItemGroup.BUILDING_BLOCKS);
        NIOBIUM_BLOCK = register(PeproBlocks.NIOBIUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        TIN_BLOCK = register(PeproBlocks.TIN_BLOCK, ItemGroup.BUILDING_BLOCKS);
        TITANIUM_BLOCK = register(PeproBlocks.TITANIUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        TUNGSTEN_BLOCK = register(PeproBlocks.TUNGSTEN_BLOCK, ItemGroup.BUILDING_BLOCKS);
        TANTALUM_BLOCK = register(PeproBlocks.TANTALUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        PALLADIUM_BLOCK = register(PeproBlocks.PALLADIUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        PHOSPHORUS_BLOCK = register(PeproBlocks.PHOSPHORUS_BLOCK, ItemGroup.BUILDING_BLOCKS);
        PLATINUM_BLOCK = register(PeproBlocks.PLATINUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        SILICON_BLOCK = register(PeproBlocks.SILICON_BLOCK, ItemGroup.BUILDING_BLOCKS);
        SILVER_BLOCK = register(PeproBlocks.SILVER_BLOCK, ItemGroup.BUILDING_BLOCKS);
        SULFUR_BLOCK = register(PeproBlocks.SULFUR_BLOCK, ItemGroup.BUILDING_BLOCKS);
        VANADIUM_BLOCK = register(PeproBlocks.VANADIUM_BLOCK, ItemGroup.BUILDING_BLOCKS);
        ZINC_BLOCK = register(PeproBlocks.ZINC_BLOCK, ItemGroup.BUILDING_BLOCKS);

        COMPRESSION_CRAFTING_TABLE = register(PeproBlocks.COMPRESSION_CRAFTING_TABLE, ItemGroup.BUILDING_BLOCKS);
        WAX_INJECTOR = register(PeproBlocks.WAX_INJECTOR, ItemGroup.BUILDING_BLOCKS);
        WAX_ASSEMBLER = register(PeproBlocks.WAX_ASSEMBLER, ItemGroup.BUILDING_BLOCKS);
        SLURRY_COATER = register(PeproBlocks.SLURRY_COATER, ItemGroup.BUILDING_BLOCKS);
        STUCCOER = register(PeproBlocks.STUCCOER, ItemGroup.BUILDING_BLOCKS);
        DEWAXER = register(PeproBlocks.DEWAXER, ItemGroup.BUILDING_BLOCKS);
        CASTER = register(PeproBlocks.CASTER, ItemGroup.BUILDING_BLOCKS);
        SHELL_REMOVER = register(PeproBlocks.SHELL_REMOVER, ItemGroup.BUILDING_BLOCKS);
        OFFCUTTER = register(PeproBlocks.OFFCUTTER, ItemGroup.BUILDING_BLOCKS);
        FINISHER = register(PeproBlocks.FINISHER, ItemGroup.BUILDING_BLOCKS);
        INSPECTOR = register(PeproBlocks.INSPECTOR, ItemGroup.BUILDING_BLOCKS);

        CONDUIT = register((Block) PeproBlocks.CONDUIT, ItemGroup.BUILDING_BLOCKS);









        AMETHYST = register("amethyst", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        AQUAMARINE = register("aquamarine", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        CITRINE = register("citrine", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        GARNET = register("garnet", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        OPAL = register("opal", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        PERIDOT = register("peridot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RUBY = register("ruby", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        SAPPHIRE = register("sapphire", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        TOPAZ = register("topaz", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        ZIRCON = register("zircon", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));

        VOID_OPAL = register("void_opal", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        LOW_TEMPERATURE_DIAMOND = register("low_temperature_diamond", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));

        RAW_ALUMINIUM = register("raw_aluminium", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_ANTIMONY = register("raw_antimony", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_BISMUTH = register("raw_bismuth", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_BORON = register("raw_boron", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_CADMIUM = register("raw_cadmium", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_CARBON = register("raw_carbon", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_CHROMIUM = register("raw_chromium", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_COBALT = register("raw_cobalt", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_GERMANIUM = register("raw_germanium", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_LEAD = register("raw_lead", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_LITHIUM = register("raw_lithium", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_MANGANESE = register("raw_manganese", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_MAGNESIUM = register("raw_magnesium", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_MERCURY = register("raw_mercury", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_MOLYBDENUM = register("raw_molybdenum", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_NICKEL = register("raw_nickel", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_NIOBIUM = register("raw_niobium", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_TIN = register("raw_tin", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_TITANIUM = register("raw_titanium", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_TUNGSTEN = register("raw_tungsten", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_TANTALUM = register("raw_tantalum", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_PALLADIUM = register("raw_palladium", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_PHOSPHORUS = register("raw_phosphorus", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_PLATINUM = register("raw_platinum", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_SILICON = register("raw_silicon", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_SILVER = register("raw_silver", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_SULFUR = register("raw_sulfur", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_VANADIUM = register("raw_vanadium", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RAW_ZINC = register("raw_zinc", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));

        ALUMINIUM_INGOT = register("aluminium_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        ANTIMONY_INGOT = register("antimony_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        BISMUTH_INGOT = register("bismuth_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        BORON_INGOT = register("boron_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        CADMIUM_INGOT = register("cadmium_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        CARBON_INGOT = register("carbon_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        CHROMIUM_INGOT = register("chromium_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        COBALT_INGOT = register("cobalt_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        GERMANIUM_INGOT = register("germanium_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        LEAD_INGOT = register("lead_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        LITHIUM_INGOT = register("lithium_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        MANGANESE_INGOT = register("manganese_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        MAGNESIUM_INGOT = register("magnesium_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        MERCURY_INGOT = register("mercury_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        MOLYBDENUM_INGOT = register("molybdenum_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        NICKEL_INGOT = register("nickel_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        NIOBIUM_INGOT = register("niobium_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        TIN_INGOT = register("tin_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        TITANIUM_INGOT = register("titanium_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        TUNGSTEN_INGOT = register("tungsten_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        TANTALUM_INGOT = register("tantalum_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        PALLADIUM_INGOT = register("palladium_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        PHOSPHORUS_INGOT = register("phosphorus_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        PLATINUM_INGOT = register("platinum_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        SILICON_INGOT = register("silicon_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        SILVER_INGOT = register("silver_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        SULFUR_INGOT = register("sulfur_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        VANADIUM_INGOT = register("vanadium_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        ZINC_INGOT = register("zinc_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        
        AMALGAM_INGOT = register("amalgam_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        ALNICO_INGOT = register("alnico_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        BABBIT_INGOT = register("babbit_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        BILLON_INGOT = register("billon_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        BRASS_INGOT = register("brass_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        BRONZE_INGOT = register("bronze_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        CAST_IRON_INGOT = register("cast_iron_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        DURALUMIN_INGOT = register("duralumin_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        ELECTRUM_INGOT = register("electrum_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        GERMAN_SILVER_INGOT = register("german_silver_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        GUNMETAL_INGOT = register("gunmetal_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        MAGNOX_INGOT = register("magnox_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        PEWTER_INGOT = register("pewter_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        ROSE_GOLD_INGOT = register("rose_gold_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        SOLDER_INGOT = register("solder_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        STERLING_SILVER_INGOT = register("sterling_silver_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        WHITE_GOLD_INGOT = register("white_gold_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        WOODS_METAL_INGOT = register("woods_metal_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));


        BASIC_STAINLESS_STEEL_INGOT = register("basic_stainless_steel_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        STERILE_STAINLESS_STEEL_INGOT = register("sterile_stainless_steel_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        RESISTANT_STAINLESS_STEEL_INGOT = register("resistant_stainless_steel_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        CRUDE_STEEL_INGOT = register("crude_steel_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        LOW_CARBON_STEEL_INGOT = register("low_carbon_steel_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        MEDIUM_CARBON_STEEL_INGOT = register("medium_carbon_steel_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        HIGH_CARBON_STEEL_INGOT = register("high_carbon_steel_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        ULTRA_HIGH_CARBON_STEEL_INGOT = register("ultra_high_carbon_steel_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        CARBON_NANOTUBE_INFUSED_STEEL_INGOT = register("carbon_nanotube_infused_steel_ingot", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));

        CRYSTALLINE_PROTOSTRUCTURE = register("crystalline_protostructure", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        SMALL_CRYSTAL_MATRIX = register("small_crystal_matrix", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        MEDIUM_CRYSTAL_MATRIX = register("medium_crystal_matrix", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        LARGE_CRYSTAL_MATRIX = register("large_crystal_matrix", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        DENSE_CRYSTAL_MATRIX = register("dense_crystal_matrix", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        ULTRA_DENSE_CRYSTAL_MATRIX = register("ultra_dense_crystal_matrix", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        QUANTUM_CRYSTAL_MATRIX = register("quantum_crystal_matrix", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        ENTANGLED_QUANTUM_CRYSTAL_MATRIX = register("entangled_quantum_crystal_matrix", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));

        CARBON_NANOTUBE = register("carbon_nanotube", new PeproItem(new FabricItemSettings().group(ItemGroup.MATERIALS)));
        CARBON_NANOTUBE_SWORD = register("carbon_nanotube_sword", (new PeproSwordItem(PeproToolMaterials.CARBON_NANOTUBE, 3, -2.0F, (new Item.Settings()).group(ItemGroup.COMBAT).fireproof())));
        CARBON_NANOTUBE_SHOVEL = register("carbon_nanotube_shovel", (new PeproShovelItem(PeproToolMaterials.CARBON_NANOTUBE, 1.5F, -2.6F, (new Item.Settings()).group(ItemGroup.TOOLS).fireproof())));
        CARBON_NANOTUBE_PICKAXE = register("carbon_nanotube_pickaxe", (new PeproPickaxeItem(PeproToolMaterials.CARBON_NANOTUBE, 1, -2.4F, (new Item.Settings()).group(ItemGroup.TOOLS).fireproof())));
        CARBON_NANOTUBE_AXE = register("carbon_nanotube_axe", (new PeproAxeItem(PeproToolMaterials.CARBON_NANOTUBE, 5.0F, -2.6F, (new Item.Settings()).group(ItemGroup.TOOLS).fireproof())));
        CARBON_NANOTUBE_HOE = register("carbon_nanotube_hoe", (new PeproHoeItem(PeproToolMaterials.CARBON_NANOTUBE, -5, 0.4F, (new Item.Settings()).group(ItemGroup.TOOLS).fireproof())));
        QUANTUM_DECIMATOR = register("quantum_decimator", (new QuantumDecimatorItem(PeproToolMaterials.QUANTUM_MATRIX, 9, -3.0F, (new Item.Settings()).group(ItemGroup.TOOLS).fireproof())));


    }
}
