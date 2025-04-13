package com.betterenddelight.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import org.betterx.betterend.effects.EndStatusEffects;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.FoodValues.MEDIUM_DURATION;

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
    public static final FoodComponent COOKED_POLYPORE = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build();

    public static final FoodComponent NEON_CACTUS_SLICE = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().build();
    public static final FoodComponent COOKED_NEON_CACTUS_SLICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).alwaysEdible().build();

    public static final FoodComponent AMARANITA_MUSHROOM_RICE = new FoodComponent.Builder().hunger(12).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build(); ;

    public static final FoodComponent SHADOW_WALKER_MEAT_RAW = new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(EndStatusEffects.END_VEIL,1200, 0), 1.0F).build(); ;
    public static final FoodComponent SHADOW_WALKER_MEAT_COOKED = new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(EndStatusEffects.END_VEIL, 1200, 0), 1.0F).build(); ;

    public static final FoodComponent ENDSHADE_BARBECUE_STICK = new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(EndStatusEffects.END_VEIL, 1200, 0), 1.0F).build(); ;

    public static final FoodComponent COOKED_SMALL_JELLYSHROOM = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build(); ;
    public static final FoodComponent SHADOW_WALKER_SANDWICH = new FoodComponent.Builder().hunger(12).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(EndStatusEffects.END_VEIL, 1600, 0),1.0F).build();

}
