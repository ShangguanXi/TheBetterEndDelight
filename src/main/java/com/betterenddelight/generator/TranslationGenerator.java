package com.betterenddelight.generator;

import com.betterenddelight.registers.blocks.Crates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class TranslationGenerator extends FabricLanguageProvider {
    protected TranslationGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(Crates.BLOSSOM_BERRY_CRATE, "Blossom Berry Crate");
    }
}
