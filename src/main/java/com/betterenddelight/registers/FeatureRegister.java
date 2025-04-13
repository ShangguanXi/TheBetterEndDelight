package com.betterenddelight.registers;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.betterx.betterend.registry.EndBiomes;

import static com.betterenddelight.BetterEndDelight.makeKey;

public class FeatureRegister {
    public static final RegistryKey<PlacedFeature> ALOE_VERA = makeKey(RegistryKeys.PLACED_FEATURE, "aloe_vera_placed");


    public static void initialize() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(EndBiomes.UMBRELLA_JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION, ALOE_VERA);
           }
}
