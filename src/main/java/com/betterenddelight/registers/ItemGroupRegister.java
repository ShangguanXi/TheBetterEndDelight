package com.betterenddelight.registers;

import com.betterenddelight.registers.items.Knives;
import com.betterenddelight.util.ItemGroupWrapper;

import static com.betterenddelight.BetterEndDelight.makeId;

public class ItemGroupRegister {
    public static final ItemGroupWrapper BETTER_END_DELIGHT_GROUP = new ItemGroupWrapper(
            makeId("better_end_delight_group"),
            "itemGroup.better_end_delight",
            () -> Knives.THALLASIUM_KNIFE
    );

    public static void initialize() {

    }
}
