package com.betterenddelight.generator;

import com.betterenddelight.registers.blocks.Crates;
import com.betterenddelight.registers.items.Foods;
import com.betterenddelight.registers.items.Knives;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ZhCnTranslationGenerator extends FabricLanguageProvider {
    protected ZhCnTranslationGenerator(FabricDataOutput dataOutput) {
        super(dataOutput,"zh_cn");
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.better_end_delight","更好的末地乐事");

        translationBuilder.add(Crates.BLOSSOM_BERRY_CRATE, "箱装百花果");
        translationBuilder.add(Crates.SHADOW_BERRY_CRATE, "箱装黯影浆果");

        translationBuilder.add(Knives.THALLASIUM_KNIFE, "末影铁刀");
        translationBuilder.add(Knives.TERMINITE_KNIFE, "终末合金刀");
        translationBuilder.add(Knives.AETERNIUM_KNIFE, "太古合金刀");
        translationBuilder.add(Foods.COOKED_END_FISH_SLICE,"熟末地鱼片");
        translationBuilder.add(Foods.END_FISH_SLICE,"生末地鱼片");
    }
}
