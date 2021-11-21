package net.ghfstudios.pepro.item;

import net.ghfstudios.pepro.entity.projectile.thrown.QuantumDecimatorEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.PotionEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public class QuantumDecimatorItem extends PeproHammerItem{
    public QuantumDecimatorItem(ToolMaterial toolMaterial, int i, float f, Settings settings) {
        super(toolMaterial, i, f, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        //Todo
        return super.useOnBlock(context);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (!world.isClient) {
            QuantumDecimatorEntity quantumDecimatorEntity = new QuantumDecimatorEntity(world, user);
            quantumDecimatorEntity.setItem(itemStack);
            quantumDecimatorEntity.setProperties(user, user.getPitch(), user.getYaw(), -20.0F, 0.5F, 1.0F);
            quantumDecimatorEntity.dropStack(itemStack);
            world.spawnEntity(quantumDecimatorEntity);
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}