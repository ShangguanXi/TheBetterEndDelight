package com.betterenddelight.registers.items;

import com.betterenddelight.items.FoodValues;
import com.betterenddelight.items.Popsicle;
import com.betterenddelight.registers.ItemRegister;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.StewItem;
import org.betterx.betterend.registry.EndItems;
import vectorwing.farmersdelight.common.item.PopsicleItem;

public class Foods {

    public static final Item END_FISH_SLICE = ItemRegister.register("end_fish_slice", new Item(new Item.Settings().food(FoodValues.END_FISH_SLICE)));
    public static final Item COOKED_END_FISH_SLICE = ItemRegister.register("cooked_end_fish_slice", new Item(new Item.Settings().food(FoodValues.COOKED_END_FISH_SLICE)));
    public static final Item END_FISH_ROLL = ItemRegister.register("end_fish_roll", new Item(new Item.Settings().food(FoodValues.END_FISH_ROLL)));

    public static final Item CAVE_PUMPKIN_PIE_SLICE = ItemRegister.register("cave_pumpkin_pie_slice", new Item(new Item.Settings().food(FoodValues.CAVE_PUMPKIN_PIE_SLICE)));

    public static final Item BLOSSOM_BERRY_POPSICLE = ItemRegister.register("blossom_berry_popsicle", new Popsicle(new Item.Settings().food(FoodValues.BLOSSOM_BERRY_POPSICLE)));
    public static final Item SHADOW_BERRY_POPSICLE = ItemRegister.register("shadow_berry_popsicle", new Popsicle(new Item.Settings().food(FoodValues.SHADOW_BERRY_POPSICLE)));

    public static final Item BLOSSOM_BERRY_CHEESECAKE_SLICE = ItemRegister.register("blossom_berry_cheesecake_slice", new Item(new Item.Settings().food(FoodValues.PIE_SLICE)));
    public static final Item SHADOW_BERRY_CHEESECAKE_SLICE = ItemRegister.register("shadow_berry_cheesecake_slice", new Item(new Item.Settings().food(FoodValues.PIE_SLICE)));

    public static final Item END_FISH_SANDWICH = ItemRegister.register("end_fish_sandwich", new Item(new Item.Settings().food(FoodValues.END_FISH_SANDWICH)));
    public static final Item END_FISH_WRAP = ItemRegister.register("end_fish_wrap", new Item(new Item.Settings().food(FoodValues.END_FISH_WRAP)));

    public static final Item GELATINE_SAUCE = ItemRegister.register("gelatine_sauce", new StewItem(new Item.Settings().food(FoodValues.GELATINE_SAUCE).maxCount(16)));

    public static final Item GLOW_BERRY_JELLY = ItemRegister.register("glow_berry_jelly", new StewItem(new Item.Settings().food(EndItems.SWEET_BERRY_JELLY.getFoodComponent())));

    public static void initialize() {

    }
}
