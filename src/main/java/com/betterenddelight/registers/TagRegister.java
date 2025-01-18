package com.betterenddelight.registers;

import com.betterenddelight.BetterEndDelight;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.FarmersDelight;

public class TagRegister {

    public static final TagKey<Item> COOKED_END_FISH = itemTag("cooked_end_fish");

    private static TagKey<Item> itemTag(String path) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(BetterEndDelight.MOD_ID, path));
    }
    public static void initialize() {}

}
