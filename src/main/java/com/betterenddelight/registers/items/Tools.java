package com.betterenddelight.registers.items;
import com.betterenddelight.items.FoodValues;
import com.betterenddelight.items.LumecornCudgel;
import com.betterenddelight.items.ModMaterials;
import com.betterenddelight.registers.ItemRegister;
import net.minecraft.item.Item;
import org.betterx.betterend.item.material.EndToolMaterial;
public class Tools {
    public static final Item LUMECORN_CUDGEL = ItemRegister.register("lumecorn_cudgel", new LumecornCudgel(ModMaterials.LUMECORN,1,-3F,new Item.Settings()));

    public static void initialize() {

    }
}
