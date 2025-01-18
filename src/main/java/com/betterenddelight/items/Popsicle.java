package com.betterenddelight.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import vectorwing.farmersdelight.common.item.PopsicleItem;

public class Popsicle extends PopsicleItem {
    public Popsicle(Settings properties) {
        super(properties);
    }
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode ? itemStack : new ItemStack(Items.STICK);
    }
}
