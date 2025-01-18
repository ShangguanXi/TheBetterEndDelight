package com.betterenddelight.items;

import net.minecraft.item.FoodComponent;

public class FoodValues {
    public static final FoodComponent END_FISH_SLICE = new FoodComponent.Builder().hunger(1).saturationModifier(0.2F).snack().build();
    public static final FoodComponent END_FISH_ROLL = new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build();
    public static final FoodComponent COOKED_END_FISH_SLICE = new FoodComponent.Builder().hunger(3).saturationModifier(0.95F).snack().build();
    public static final FoodComponent CAVE_PUMPKIN_PIE_SLICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).snack().build();
    public static final FoodComponent BLOSSOM_BERRY_POPSICLE = new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).snack().alwaysEdible().build();
    public static final FoodComponent SHADOW_BERRY_POPSICLE = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).snack().alwaysEdible().build();
    public static final FoodComponent PIE_SLICE = vectorwing.farmersdelight.common.FoodValues.PIE_SLICE;
    public static final FoodComponent END_FISH_SANDWICH = new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).build();
    public static final FoodComponent END_FISH_WRAP = new FoodComponent.Builder().hunger(9).saturationModifier(0.8f).build();
    public static final FoodComponent GELATINE_SAUCE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();

}
