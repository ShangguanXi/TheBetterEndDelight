package com.betterenddelight.items;

import net.minecraft.item.FoodComponent;

public class FoodValues {
    public static final FoodComponent END_FISH_SLICE = new FoodComponent.Builder().hunger(1).saturationModifier(0.2F).snack().build();
    public static final FoodComponent COOKED_END_FISH_SLICE = new FoodComponent.Builder().hunger(3).saturationModifier(0.95F).snack().build();

}
