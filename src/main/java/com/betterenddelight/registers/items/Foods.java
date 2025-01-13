package com.betterenddelight.registers.items;

import com.betterenddelight.items.FoodValues;
import com.betterenddelight.registers.ItemRegister;
import net.minecraft.item.Item;
public class Foods {
    public static final Item END_FISH_SLICE = ItemRegister.register("end_fish_slice", new Item(new Item.Settings().food(FoodValues.END_FISH_SLICE)));
    public static final Item COOKED_END_FISH_SLICE = ItemRegister.register("cooked_end_fish_slice", new Item(new Item.Settings().food(FoodValues.COOKED_END_FISH_SLICE)));

    public static void initialize() {

    }
}
