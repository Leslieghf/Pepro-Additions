package net.ghfstudios.pepro.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.ghfstudios.pepro.block.PeproBlock;
import net.ghfstudios.pepro.block.PeproBlocks;
import net.minecraft.item.*;
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


    //Items
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


    //Methods
    private static PeproBlockItem register(PeproBlock block, ItemGroup group) {
        return Registry.register(Registry.ITEM, Registry.BLOCK.getId(block), new PeproBlockItem(block, (new PeproItem.Settings()).group(group)));
    }

    private static PeproItem register(String id, PeproItem item) {
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


        //Items
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
    }
}
