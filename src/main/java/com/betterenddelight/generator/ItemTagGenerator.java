package com.betterenddelight.generator;

import com.betterenddelight.registers.TagRegister;
import com.betterenddelight.registers.blocks.Cabinets;
import com.betterenddelight.registers.blocks.Crates;
import com.betterenddelight.registers.blocks.WildCrops;
import com.betterenddelight.registers.items.Foods;
import com.betterenddelight.registers.items.Knives;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagEntry;
import org.betterx.betterend.registry.EndBlocks;
import org.betterx.betterend.registry.EndItems;
import org.betterx.betterend.registry.EndTags;
import vectorwing.farmersdelight.common.tag.ConventionalTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ItemTagGenerator extends  FabricTagProvider.ItemTagProvider {


    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        this.CommonTags();
        this.MinecraftTags();
        this.BetterEndDelightTags();
        this.FarmersDelightTags();
    }

    private void BetterEndDelightTags() {
        getOrCreateTagBuilder(TagRegister.COOKED_END_FISH)
                .add(EndItems.END_FISH_COOKED)
                .add(Foods.COOKED_END_FISH_SLICE);
        getOrCreateTagBuilder(TagRegister.POLYPORE)
                .add(EndBlocks.PURPLE_POLYPORE.asItem())
                .add(EndBlocks.AURANT_POLYPORE.asItem());
    }

    private void MinecraftTags() {
        getOrCreateTagBuilder(ItemTags.FISHES)
                .add(Foods.END_FISH_SLICE)
                .add(Foods.COOKED_END_FISH_SLICE);
    }

    private void CommonTags(){
        getOrCreateTagBuilder(ConventionalTags.TOOLS_KNIVES)
                .add(Knives.THALLASIUM_KNIFE)
                .add(Knives.TERMINITE_KNIFE)
                .add(Knives.AETERNIUM_KNIFE);
        getOrCreateTagBuilder(ConventionalTags.FOODS_RAW_FISHES)
                .add(Foods.END_FISH_SLICE)
                .add(EndItems.END_FISH_RAW);
        getOrCreateTagBuilder(ConventionalTags.FOODS_COOKED_FISHES)
                .add(Foods.COOKED_END_FISH_SLICE)
                .add(EndItems.END_FISH_COOKED);

    }
    private void FarmersDelightTags() {


        getOrCreateTagBuilder(ModTags.KNIVES)
                .add(Knives.THALLASIUM_KNIFE)
                .add(Knives.TERMINITE_KNIFE)
                .add(Knives.AETERNIUM_KNIFE)
                .add(Knives.AMBER_KNIFE);
        getOrCreateTagBuilder(ModTags.CABINETS)
                .add(Knives.THALLASIUM_KNIFE)
                .add(Knives.TERMINITE_KNIFE)
                .add(Knives.AETERNIUM_KNIFE)
                .add(Cabinets.DRAGON_TREE_CABINET.asItem())
                .add(Cabinets.END_LOTUS_CABINET.asItem())
                .add(Cabinets.HELIX_TREE_CABINET.asItem())
                .add(Cabinets.JELLYSHROOM_CABINET.asItem())
                .add(Cabinets.LACUGROVE_CABINET.asItem())
                .add(Cabinets.LUCERNIA_CABINET.asItem())
                .add(Cabinets.MOSSY_GLOWSHROOM_CABINET.asItem())
                .add(Cabinets.TENANEA_CABINET.asItem())
                .add(Cabinets.PYTHADENDRON_CABINET.asItem())
                .add(Cabinets.UMBRELLA_TREE_CABINET.asItem());
        getOrCreateTagBuilder(ModTags.WILD_CROPS_ITEM)
                .add(WildCrops.WILD_ALOE_VERA.asItem());
    }

}
