package net.ghfstudios.pepro.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

/**
 * @author Leslie-John Richardson
 * @disclaimer null
 */
public enum PeproToolMaterials implements ToolMaterial {
    CARBON_NANOTUBE(PeproMiningLevels.CARBON_NANOTUBE, 2890, 12.0F, 5.5F, 22, () -> Ingredient.ofItems(PeproItems.CARBON_NANOTUBE)),
    QUANTUM_MATRIX(PeproMiningLevels.QUANTUM_MATRIX, 4690, 14.0F, 7F, 25, () -> Ingredient.ofItems(PeproItems.QUANTUM_CRYSTAL_MATRIX));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    PeproToolMaterials(int j, int k, float f, float g, int l, Supplier<Ingredient> supplier) {
        this.miningLevel = j;
        this.itemDurability = k;
        this.miningSpeed = f;
        this.attackDamage = g;
        this.enchantability = l;
        this.repairIngredient = new Lazy(supplier);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
