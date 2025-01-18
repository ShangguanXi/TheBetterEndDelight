package com.betterenddelight.registers;

import com.betterenddelight.registers.items.Foods;
import com.betterenddelight.registers.items.Knives;
import com.betterenddelight.registers.items.Tools;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;

import static com.betterenddelight.BetterEndDelight.makeId;
import static com.betterenddelight.registers.ItemGroupRegister.BETTER_END_DELIGHT_GROUP;

public class ItemRegister{
    public static <T extends Item> T register(String path, T item) {
        return BETTER_END_DELIGHT_GROUP.register(Registries.ITEM, makeId(path), item);
    }
    public static void initialize() {
        Foods.initialize();
        Knives.initialize();
        Tools.initialize();
    }
}
