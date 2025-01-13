package com.betterenddelight.generator;

import com.betterenddelight.registers.blocks.Crates;
import com.betterenddelight.registers.items.Foods;
import com.betterenddelight.registers.items.Knives;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EnUsTranslationGenerator extends FabricLanguageProvider {
    protected EnUsTranslationGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.better_end_delight","The Better End Delight");

        translationBuilder.add(Crates.BLOSSOM_BERRY_CRATE, "Blossom Berry Crate");
        translationBuilder.add(Crates.SHADOW_BERRY_CRATE, "Shadow Berry Crate");

        translationBuilder.add(Knives.THALLASIUM_KNIFE, "Thallasium Knife");
        translationBuilder.add(Knives.TERMINITE_KNIFE, "Terminite Knife");
        translationBuilder.add(Knives.AETERNIUM_KNIFE, "Aeternium Knife");
        translationBuilder.add(Foods.COOKED_END_FISH_SLICE,"Cooked End Fish Slice");
        translationBuilder.add(Foods.END_FISH_SLICE,"End Fish Slice");

    }
}
