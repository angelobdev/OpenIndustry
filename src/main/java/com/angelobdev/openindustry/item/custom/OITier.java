package com.angelobdev.openindustry.item.custom;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import static com.angelobdev.openindustry.item.OIItems.*;

public enum OITier implements Tier {

    COPPER_TIER(160, 3, 10, 8f, 0.8f, Ingredient.of(COPPER_INGOT.get())),
    SILVER_TIER(280, 4, 12, 10f, 0.9f, Ingredient.of(SILVER_INGOT.get())),
    IRIDIUM_TIER(420, 5, 16, 12f, 1f, Ingredient.of(IRIDIUM_INGOT.get()));

    //CUSTOM CLASS
    private final int uses;
    private final int level;
    private final int enchantmentValue;
    private final float speed;
    private final float attackDamageBonus;
    private final Ingredient repairIngredient;

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
