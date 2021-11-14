package net.ghfstudios.pepro.particle;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;

public class PeproParticleEffect implements ParticleEffect {
    @Override
    public ParticleType<?> getType() {
        return null;
    }

    @Override
    public void write(PacketByteBuf buf) {

    }

    @Override
    public String asString() {
        return null;
    }
}
