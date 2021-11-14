package net.ghfstudios.pepro.particle;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PeproParticleTypes implements ModInitializer {

    @Override
    public void onInitialize() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier("pepro", "hell_flame"), HELL_FLAME);
    }
    public static final DefaultParticleType HELL_FLAME = FabricParticleTypes.simple();
}
