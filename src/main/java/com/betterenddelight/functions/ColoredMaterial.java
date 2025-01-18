package com.betterenddelight.functions;

import com.betterenddelight.BetterEndDelight;
import com.betterenddelight.registers.BlockRegister;
import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.item.DyeItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import org.betterx.bclib.recipes.BCLRecipeBuilder;
import org.betterx.bclib.util.BlocksHelper;
import org.betterx.betterend.BetterEnd;
import org.betterx.betterend.registry.EndBlocks;

import java.util.Map;
import java.util.function.Function;

public class ColoredMaterial{
    private static final Map<Integer, ItemConvertible> DYES = Maps.newHashMap();
    private static final Map<Integer, String> COLORS = Maps.newHashMap();
    private final Map<Integer, Block> colors;

    public ColoredMaterial(Function<FabricBlockSettings, Block> constructor, Block source) {
        this(constructor, source, COLORS, DYES);
    }

    public ColoredMaterial(Function<FabricBlockSettings, Block> constructor, Block source, Map<Integer, String> colors, Map<Integer, ItemConvertible> dyes) {
        this.colors = Maps.newHashMap();
        String id = Registries.BLOCK.getId(source).getPath();
        colors.forEach((color, name) -> {
            String blockName = id + "_" + name;
            Block block = constructor.apply(FabricBlockSettings.copyOf(source).mapColor(MapColor.BLACK));
            BlockRegister.registerWithItem(blockName, block);
            this.colors.put(color, block);
            BlocksHelper.addBlockColor(block, color);
        });
    }
    static {
        DyeColor[] var0 = DyeColor.values();
        int var1 = var0.length;

        for(int var2 = 0; var2 < var1; ++var2) {
            DyeColor color = var0[var2];
            int colorRGB = color.getMapColor().color;
            COLORS.put(colorRGB, color.getName());
            DYES.put(colorRGB, DyeItem.byColor(color));
        }

    }
}
