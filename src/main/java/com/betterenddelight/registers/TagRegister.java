package com.betterenddelight.registers;

import com.betterenddelight.BetterEndDelight;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.FarmersDelight;

public class TagRegister {

    public static final TagKey<Item> COOKED_END_FISH = itemTag("cooked_end_fish");
    public static final TagKey<Item> POLYPORE = itemTag("polypore");
    public static final TagKey<Block> ALOE_VERA_CAN_PLANT = blockTag("aloe_vera_can_plant");

    private static TagKey<Item> itemTag(String path) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(BetterEndDelight.MOD_ID, path));
    }
    private static TagKey<Block> blockTag(String path) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(BetterEndDelight.MOD_ID, path));
    }
    public static void initialize() {}

}
