package com.betterenddelight.generator;

import com.betterenddelight.registers.blocks.*;
import com.betterenddelight.registers.items.Foods;
import com.betterenddelight.registers.items.Knives;
import com.betterenddelight.registers.items.Tools;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ZhCnTranslationGenerator extends FabricLanguageProvider {
    protected ZhCnTranslationGenerator(FabricDataOutput dataOutput) {
        super(dataOutput,"zh_cn");
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.better_end_delight","更好的末地乐事");

        translationBuilder.add(PetalCarpetBlocks.HYDRALUX_PETAL_CARPET_BLOCK, "水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_white", "白色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_orange", "橙色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_magenta", "品红色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_light_blue", "淡蓝色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_yellow", "黄色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_lime", "黄绿色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_pink", "粉红色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_gray", "灰色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_light_gray", "淡灰色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_cyan", "青色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_purple", "紫色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_blue", "蓝色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_brown", "棕色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_green", "绿色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_red", "红色水生烛光花瓣毯");
        translationBuilder.add("block.betterenddelight.hydralux_petal_carpet_block_black", "黑色水生烛光花瓣毯");
        translationBuilder.add("farmersdelight.tooltip.milk_jelly", "清除1个效果");
        translationBuilder.add(Cabinets.DRAGON_TREE_CABINET,"龙鳞木橱柜");
        translationBuilder.add(Cabinets.END_LOTUS_CABINET,"末地莲木橱柜");
        translationBuilder.add(Cabinets.HELIX_TREE_CABINET,"螺旋树木橱柜");
        translationBuilder.add(Cabinets.JELLYSHROOM_CABINET,"果冻菌橱柜");
        translationBuilder.add(Cabinets.LACUGROVE_CABINET,"湖树木橱柜");
        translationBuilder.add(Cabinets.LUCERNIA_CABINET,"灯笼木橱柜");
        translationBuilder.add(Cabinets.MOSSY_GLOWSHROOM_CABINET,"苔光菇橱柜");
        translationBuilder.add(Cabinets.TENANEA_CABINET,"十纹木橱柜");
        translationBuilder.add(Cabinets.PYTHADENDRON_CABINET,"紫颂木橱柜");
        translationBuilder.add(Cabinets.UMBRELLA_TREE_CABINET,"胶伞树木橱柜");

        translationBuilder.add(Crates.BLOSSOM_BERRY_CRATE, "箱装绽花浆果");
        translationBuilder.add(Crates.SHADOW_BERRY_CRATE, "箱装黯影浆果");
        translationBuilder.add(Crates.LUMECORN_ROD_CRATE, "箱装流明玉米棒");

        translationBuilder.add(Crates.HYDRALUX_PETAL_BAG, "袋装水生烛光花瓣");
        translationBuilder.add(Crates.AMBER_ROOT_RAW_BAG, "袋装琥珀根");
        translationBuilder.add(Crates.CHORUS_MUSHROOM_RAW_BAG, "袋装紫颂蘑菇");

        translationBuilder.add(Pies.BLOSSOM_BERRY_CHEESECAKE, "绽花浆果芝士派");
        translationBuilder.add(Foods.BLOSSOM_BERRY_CHEESECAKE_SLICE, "绽花浆果芝士派切片");
        translationBuilder.add(Pies.SHADOW_BERRY_CHEESECAKE, "黯影浆果芝士派");
        translationBuilder.add(Foods.SHADOW_BERRY_CHEESECAKE_SLICE, "黯影浆果芝士派切片");

        translationBuilder.add(Knives.THALLASIUM_KNIFE, "末影铁刀");
        translationBuilder.add(Knives.TERMINITE_KNIFE, "终末合金刀");
        translationBuilder.add(Knives.AETERNIUM_KNIFE, "太古合金刀");
        translationBuilder.add(Knives.AMBER_KNIFE, "琥珀刀");
        translationBuilder.add(Tools.LUMECORN_CUDGEL, "流明玉米棒槌");
        translationBuilder.add(Foods.COOKED_END_FISH_SLICE,"熟末地鱼片");
        translationBuilder.add(Foods.END_FISH_SLICE,"生末地鱼片");
        translationBuilder.add(Foods.END_FISH_ROLL,"末地鱼寿司");
        translationBuilder.add(Foods.CAVE_PUMPKIN_PIE_SLICE,"末地南瓜派切片");
        translationBuilder.add(Foods.BLOSSOM_BERRY_POPSICLE,"绽花浆果冰棍");
        translationBuilder.add(Foods.SHADOW_BERRY_POPSICLE,"黯影浆果冰棍");
        translationBuilder.add(Foods.END_FISH_WRAP,"末地鱼卷饼");
        translationBuilder.add(Foods.END_FISH_SANDWICH,"末地鱼三明治");
        translationBuilder.add(Foods.GELATINE_SAUCE,"水母凝胶酱");
        translationBuilder.add(Foods.GLOW_BERRY_JELLY,"发光浆果冻");
        translationBuilder.add(Foods.COOKED_POLYPORE,"熟树舌");
        translationBuilder.add(Foods.NEON_CACTUS_SLICE,"霓虹仙人掌片");
        translationBuilder.add(Foods.COOKED_NEON_CACTUS_SLICE,"熟霓虹仙人掌片");
        translationBuilder.add(Foods.AMARANITA_MUSHROOM_RICE,"龙血鹅膏蘑菇盖饭");
        translationBuilder.add(WildCrops.WILD_ALOE_VERA,"末地芦荟");
        translationBuilder.add(Foods.ALOE_VERA_JELLY,"末地芦荟果冻");
        translationBuilder.add(Foods.ALOE_VERA_LEAF,"末地芦荟叶");
        translationBuilder.add(Foods.BLOSSOM_BERRY_JUICE,"绽花浆果饮");
        translationBuilder.add(Foods.SHADOW_BERRY_JUICE,"黯影浆果饮");
        translationBuilder.add(Foods.MELON_JELLY,"西瓜果冻");
        translationBuilder.add(Foods.APPLE_JELLY,"苹果冻");
        translationBuilder.add(Foods.MILK_JELLY,"牛奶果冻");
        translationBuilder.add(Foods.SHADOW_WALKER_MEAT_RAW,"生影肉");
        translationBuilder.add(Foods.SHADOW_WALKER_MEAT_COOKED,"熟影肉");
        translationBuilder.add(Foods.ENDSHADE_BARBECUE_STICK,"末黯肉串");
        translationBuilder.add(Foods.COOKED_SMALL_JELLYSHROOM,"熟小型果冻菌");
        translationBuilder.add(Foods.SHADOW_WALKER_SANDWICH,"影肉三明治");

    }
}
