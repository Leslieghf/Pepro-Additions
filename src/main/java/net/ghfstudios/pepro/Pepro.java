package net.ghfstudios.pepro;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.ghfstudios.pepro.block.PeproBlocks;
import net.ghfstudios.pepro.item.PeproItems;
import net.ghfstudios.pepro.particle.PeproParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.registry.Registry;


public class Pepro implements ModInitializer {

    public static PeproBlocks peproBlocks;
    public static PeproItems peproItems;
    public static PeproParticleTypes peproParticleTypes;

    @SuppressWarnings("InstantiationOfUtilityClass")
    @Override
    public void onInitialize() {
        peproBlocks = new PeproBlocks();
        peproItems = new PeproItems();
        peproParticleTypes = new PeproParticleTypes();
    }
}
