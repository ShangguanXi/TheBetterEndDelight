package com.betterenddelight.registers.items;

import com.betterenddelight.registers.ItemRegister;
import net.minecraft.item.Item;
import org.betterx.betterend.item.material.EndToolMaterial;
import vectorwing.farmersdelight.common.item.KnifeItem;
import static vectorwing.farmersdelight.common.registry.ModItems.basicItem;

public class Knives {
    public static final Item THALLASIUM_KNIFE = ItemRegister.register("thallasium_knife",new KnifeItem(EndToolMaterial.THALLASIUM,0.5F, -2.0F,basicItem()));
    public static final Item TERMINITE_KNIFE = ItemRegister.register("terminite_knife",new KnifeItem(EndToolMaterial.TERMINITE,0.5F, -2.0F, basicItem()));
    public static final Item AETERNIUM_KNIFE = ItemRegister.register("aeternium_knife",new KnifeItem(EndToolMaterial.AETERNIUM,0.5F, -2.0F, basicItem()));


    public static void initialize() {

    }
}
