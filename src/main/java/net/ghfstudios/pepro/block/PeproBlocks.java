package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
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


    //Methods
    private static PeproBlock register(String id, PeproBlock block) {
        return Registry.register(Registry.BLOCK, new Identifier("pepro", id), block);
    }


    //Block registrations
    static {
        //////DON'T FORGET TO REGISTER THE BLOCKITEM @item/Items.java FOR INTENDED TILEDROPS//////
        DEV_MEASURE_GENERIC = register( "dev_measure_generic", new PeproDevBlock(FabricBlockSettings.of(Material.STONE)));
        AMETHYST_ORE = register( "amethyst_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.AMETHYST)));
        AQUAMARINE_ORE = register( "aquamarine_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.AMETHYST)));
        CITRINE_ORE = register( "citrine_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.AMETHYST)));
        GARNET_ORE = register( "garnet_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.AMETHYST)));
        OPAL_ORE = register( "opal_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.AMETHYST)));
        PERIDOT_ORE = register( "peridot_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.AMETHYST)));
        RUBY_ORE = register( "ruby_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.AMETHYST)));
        SAPPHIRE_ORE = register( "sapphire_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.AMETHYST)));
        TOPAZ_ORE = register( "topaz_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.AMETHYST)));
        ZIRCON_ORE = register( "zircon_ore", new PeproGemOreBlock(FabricBlockSettings.of(Material.AMETHYST)));

        /*
        Iterator var0 = Registry.BLOCK.iterator();

        while(var0.hasNext()) {
            Block block = (Block)var0.next();
            UnmodifiableIterator var2 = block.getStateManager().getStates().iterator();

            while(var2.hasNext()) {
                BlockState blockState = (BlockState)var2.next();
                Block.STATE_IDS.add(blockState);
            }

            block.getLootTableId();
        }
        */
    }
}
