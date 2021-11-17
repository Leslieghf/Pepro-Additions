package net.ghfstudios.pepro.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

/**
 * @author Leslie-John Richardson
 */

public class MagnesiumBlock extends PeproBlock{
    public static final BooleanProperty UNSTABLE;
    private static float explosionPower;

    public MagnesiumBlock(FabricBlockSettings settings, float explosionPower) {
        super(settings);
        MagnesiumBlock.explosionPower = explosionPower;

    }

    public MagnesiumBlock(FabricBlockSettings settings) {
        super(settings);
        explosionPower = 6.0f;
    }

    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {
        explode(world, pos, null);
    }

    private static void explode(World world, BlockPos pos, @Nullable LivingEntity igniter) {
        if (!world.isClient) {
            world.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), explosionPower, Explosion.DestructionType.BREAK);
        }
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (!itemStack.isOf(Items.FLINT_AND_STEEL) && !itemStack.isOf(Items.FIRE_CHARGE)) {
            return super.onUse(state, world, pos, player, hand, hit);
        } else {
            explode(world, pos, player);
            world.setBlockState(pos, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
            Item item = itemStack.getItem();
            if (!player.isCreative()) {
                if (itemStack.isOf(Items.FLINT_AND_STEEL)) {
                    itemStack.damage(1, player, (Consumer<LivingEntity>)((playerx) -> {
                        playerx.sendToolBreakStatus(hand);
                    }));
                } else {
                    itemStack.decrement(1);
                }
            }

            player.incrementStat(Stats.USED.getOrCreateStat(item));
            return ActionResult.success(world.isClient);
        }
    }

    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        if (!world.isClient) {
            BlockPos blockPos = hit.getBlockPos();
            Entity entity = projectile.getOwner();
            if (projectile.isOnFire() && projectile.canModifyAt(world, blockPos)) {
                explode(world, blockPos, (LivingEntity) entity);
                world.removeBlock(blockPos, false);
            }
        }

    }

    public boolean shouldDropItemsOnExplosion(Explosion explosion) {
        return false;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(UNSTABLE);
    }

    static {
        UNSTABLE = Properties.UNSTABLE;
    }
}
