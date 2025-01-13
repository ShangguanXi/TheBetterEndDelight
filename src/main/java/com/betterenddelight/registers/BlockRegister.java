package com.betterenddelight.registers;

import com.betterenddelight.registers.blocks.Crates;
import com.betterenddelight.registers.items.Knives;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static com.betterenddelight.BetterEndDelight.makeId;
import static com.betterenddelight.registers.ItemGroupRegister.BETTER_END_DELIGHT_GROUP;

public class BlockRegister {

    public static <T extends Block> T register(String path, T block) {
        return Registry.register(Registries.BLOCK, makeId(path), block);
    }
    public static <T extends Block> T registerWithItem(String path, T block) {
        var identifier = makeId(path);
        BETTER_END_DELIGHT_GROUP.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, identifier, block);
    }
    public static void initialize() {
        Crates.initialize();
    }

}
