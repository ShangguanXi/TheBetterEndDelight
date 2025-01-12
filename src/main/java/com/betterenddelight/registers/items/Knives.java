package com.betterenddelight.registers.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import org.betterx.betterend.item.material.EndToolMaterial;
import vectorwing.farmersdelight.common.item.KnifeItem;

import static com.betterenddelight.BetterEndDelight.makeId;
import static com.betterenddelight.registers.ItemGroupRegister.BETTER_END_DELIGHT_GROUP;
import static vectorwing.farmersdelight.common.registry.ModItems.basicItem;

public class Knives {
    public static final Item THALLASIUM_KNIFE = register("thallasium_knife",new KnifeItem(EndToolMaterial.THALLASIUM,0.5F, -2.0F, basicItem()));

    public static <T extends Item> T register(String path, T item) {
        return BETTER_END_DELIGHT_GROUP.register(Registries.ITEM, makeId(path), item);
    }
    public static void initialize() {

    }
}
