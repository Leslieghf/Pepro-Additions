package net.ghfstudios.pepro.entity.projectile.thrown;

import net.ghfstudios.pepro.item.PeproItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class QuantumDecimatorEntity extends ThrownItemEntity {
    protected Entity owner;

    public QuantumDecimatorEntity(EntityType<? extends QuantumDecimatorEntity> entityType, World world) {
        super(entityType, world);
    }

    public QuantumDecimatorEntity(World world, LivingEntity livingEntity) {
        super(EntityType.SNOWBALL, livingEntity, world);
        owner = livingEntity;
    }

    public QuantumDecimatorEntity(World world, double d, double e, double f) {
        super(EntityType.SNOWBALL, d, e, f, world);
    }

    protected Item getDefaultItem() {
        return PeproItems.QUANTUM_DECIMATOR;
    }

    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return (itemStack.isEmpty() ? ParticleTypes.ITEM_SNOWBALL : new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack));
    }

    public void handleStatus(byte status) {
        if (status == 3) {
            ParticleEffect particleEffect = this.getParticleParameters();

            for(int i = 0; i < 8; ++i) {
                this.world.addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
            }
        }

    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = 10;
        entity.damage(DamageSource.thrownProjectile(this, this.getOwner()), (float)i);

        LightningEntity lightningEntity = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
        lightningEntity.setPosition(entityHitResult.getPos());
        world.spawnEntity(lightningEntity);
    }

    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);

        LightningEntity lightningEntity = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
        lightningEntity.setPosition(hitResult.getPos());
        world.spawnEntity(lightningEntity);

        if (!this.world.isClient) {
            this.world.sendEntityStatus(this, (byte)3);
            this.discard();
        }

    }
}