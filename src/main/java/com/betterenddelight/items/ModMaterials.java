package com.betterenddelight.items;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Lazy;
import org.betterx.betterend.registry.EndItems;

import java.util.function.Supplier;

public enum ModMaterials implements ToolMaterial {
    LUMECORN(0, 50, 2.0F, 1.0F, 3, ()
            -> Ingredient.ofItems(EndItems.LUMECORN_ROD)),
    AMBER(0, 150, 2.0F, 2.0F, 8, ()
            -> Ingredient.ofItems(EndItems.LUMECORN_ROD));
    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
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

    @Override
    public @org.jetbrains.annotations.Nullable TagKey<Block> getTag() {
        return ToolMaterial.super.getTag();
    }
}
