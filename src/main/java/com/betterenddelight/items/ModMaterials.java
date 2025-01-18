package com.betterenddelight.items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import org.betterx.betterend.registry.EndItems;

public class ModMaterials {
    public static final ToolMaterial LUMECORN = new ToolMaterial()
    {
        @Override
        public int getDurability() {
            return 50;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 2.0F;
        }

        @Override
        public float getAttackDamage() {
            return 1.0F;
        }

        @Override
        public int getMiningLevel() {
            return 0;
        }

        @Override
        public int getEnchantability() {
            return 3;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(EndItems.LUMECORN_ROD);
        }
    };
}
