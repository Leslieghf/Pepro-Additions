package net.ghfstudios.pepro.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.ghfstudios.pepro.particle.PeproParticleTypes;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class PeproClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        /* Adds our particle textures to vanilla's Texture Atlas so it can be shown properly.
         * Modify the namespace and particle id accordingly.
         *
         * This is only used if you plan to add your own textures for the particle. Otherwise, remove  this.*/
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("pepro", "particle/hell_flame"));
        }));

        /* Registers our particle client-side.
         * First argument is our particle's instance, created previously on ExampleMod.
         * Second argument is the particle's factory. The factory controls how the particle behaves.
         * In this example, we'll use FlameParticle's Factory.*/
        ParticleFactoryRegistry.getInstance().register(PeproParticleTypes.HELL_FLAME, FlameParticle.Factory::new);
    }
}
