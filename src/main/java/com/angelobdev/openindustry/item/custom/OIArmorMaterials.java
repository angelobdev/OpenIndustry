package com.angelobdev.openindustry.item.custom;

import com.angelobdev.openindustry.OpenIndustry;
import com.angelobdev.openindustry.item.OIItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum OIArmorMaterials implements ArmorMaterial {

    //ARMOR MATERIALS
    COPPER("copper", 12, new int[]{ 1, 2, 3, 1 }, 12, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(OIItems.COPPER_INGOT.get())),
    SILVER("silver", 14, new int[]{ 2, 3, 4, 1 }, 14, SoundEvents.ARMOR_EQUIP_IRON, 0.8F, 0.2F, () -> Ingredient.of(OIItems.SILVER_INGOT.get())),
    IRIDIUM("iridium", 16, new int[]{ 2, 4, 6, 2 }, 16, SoundEvents.ARMOR_EQUIP_IRON, 1.4F, 0.4F, () -> Ingredient.of(OIItems.IRIDIUM_INGOT.get()));

    //CUSTOM ARMOR MATERIAL
    private static final int[] HEALTH_PER_SLOT = new int[]{ 13, 15, 16, 11 };
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Ingredient repairIngredient;

    OIArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient.get();
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public @NotNull SoundEvent getEquipSound() {
        return this.sound;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }

    public @NotNull String getName() {
        return OpenIndustry.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
