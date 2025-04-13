package com.betterenddelight.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.utility.TextUtils;

import java.util.List;

public class StickFood extends Item {
    private final boolean hasFoodEffectTooltip;
    private final boolean hasCustomTooltip;
    public StickFood(Settings settings) {
        super(settings);
        this.hasFoodEffectTooltip = false;
        this.hasCustomTooltip = false;
    };
    public StickFood(Settings settings, boolean hasFoodEffectTooltip) {
        super(settings);
        this.hasFoodEffectTooltip = hasFoodEffectTooltip;
        this.hasCustomTooltip = false;
    };
    public StickFood(Settings settings, boolean hasFoodEffectTooltip, boolean hasCustomTooltip) {
        super(settings);
        this.hasFoodEffectTooltip = hasFoodEffectTooltip;
        this.hasCustomTooltip = hasCustomTooltip;
    }
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode ? itemStack : new ItemStack(Items.STICK);
    }
    public void appendTooltip(ItemStack stack, @Nullable World level, List<Text> tooltip, TooltipContext isAdvanced) {
        if (this.hasCustomTooltip) {
            MutableText textEmpty = TextUtils.getTranslation("tooltip." + String.valueOf(stack.toString()));
            tooltip.add(textEmpty.formatted(Formatting.BLUE));
        }

        if (this.hasFoodEffectTooltip) {
            TextUtils.addFoodEffectTooltip(stack, tooltip, 1.0F);
        }

    }
}
