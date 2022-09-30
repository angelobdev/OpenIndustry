package com.angelobdev.openindustry.item.custom;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import static com.angelobdev.openindustry.item.ItemsHolder.COPPER_INGOT;

public enum OITier implements Tier {

    COPPER_TIER(128, 3, 10, 12f, 2f, Ingredient.of(COPPER_INGOT.get()));

    //CUSTOM CLASS
    private int uses, level, enchantmentValue;
    private float speed, attackDamageBonus;
    private Ingredient repairIngredient;

    OITier(int uses, int level, int enchantmentValue, float speed, float attackDamageBonus, Ingredient repairIngredient) {
        this.uses = uses;
        this.level = level;
        this.enchantmentValue = enchantmentValue;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
