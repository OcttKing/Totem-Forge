package net.octtking.totemforge.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
//import net.minecraft.item.Filled_Carafes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.octtking.totemforge.Octtkingstotemforge;
import net.octtking.totemforge.item.custom.*;

public class ModItems {
    public static final Item ISITEMNAME = registerItem("isitemname",
            new IsItemClassItem(new FabricItemSettings().maxDamage(1)));
    public static final Item SLAGCHUNK = registerItem("end_stone_slag_chunk", new Item(new FabricItemSettings()));
        //carafes
    public static final Item WHITE_CARAFE = registerItem("white_carafe", new WhiteCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_WHITE_CARAFE = registerItem("filled_white_carafe", new FilledWhiteCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item LIGHT_GRAY_CARAFE = registerItem("light_gray_carafe", new LightGrayCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_LIGHT_GRAY_CARAFE = registerItem("filled_light_gray_carafe", new FilledLightGrayCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item GRAY_CARAFE = registerItem("gray_carafe", new GrayCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_GRAY_CARAFE = registerItem("filled_gray_carafe", new FilledGrayCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item BLACK_CARAFE = registerItem("black_carafe", new BlackCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_BLACK_CARAFE = registerItem("filled_black_carafe", new FilledBlackCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item BROWN_CARAFE = registerItem("brown_carafe", new BrownCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_BROWN_CARAFE = registerItem("filled_brown_carafe", new FilledBrownCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item RED_CARAFE = registerItem("red_carafe", new RedCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_RED_CARAFE = registerItem("filled_red_carafe", new FilledRedCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item ORANGE_CARAFE = registerItem("orange_carafe", new OrangeCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_ORANGE_CARAFE = registerItem("filled_orange_carafe", new FilledOrangeCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item YELLOW_CARAFE = registerItem("yellow_carafe", new YellowCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_YELLOW_CARAFE = registerItem("filled_yellow_carafe", new FilledYellowCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item LIME_CARAFE = registerItem("lime_carafe", new LimeCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_LIME_CARAFE = registerItem("filled_lime_carafe", new FilledLimeCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item GREEN_CARAFE = registerItem("green_carafe", new GreenCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_GREEN_CARAFE = registerItem("filled_green_carafe", new FilledGreenCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item CYAN_CARAFE = registerItem("cyan_carafe", new CyanCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_CYAN_CARAFE = registerItem("filled_cyan_carafe", new FilledCyanCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item LIGHT_BLUE_CARAFE = registerItem("light_blue_carafe", new LightBlueCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_LIGHT_BLUE_CARAFE = registerItem("filled_light_blue_carafe", new FilledLightBlueCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item BLUE_CARAFE = registerItem("blue_carafe", new BlueCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_BLUE_CARAFE = registerItem("filled_blue_carafe", new FilledBlueCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item PURPLE_CARAFE = registerItem("purple_carafe", new PurpleCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_PURPLE_CARAFE = registerItem("filled_purple_carafe", new FilledPurpleCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item MAGENTA_CARAFE = registerItem("magenta_carafe", new MagentaCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_MAGENTA_CARAFE = registerItem("filled_magenta_carafe", new FilledMagentaCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));

    public static final Item PINK_CARAFE = registerItem("pink_carafe", new PinkCarafeItem(new FabricItemSettings().food(Consumable.EMPTY_CARAFE).maxCount(1)));
    public static final Item FILLED_PINK_CARAFE = registerItem("filled_pink_carafe", new FilledPinkCarafeItem(new FabricItemSettings().food(Consumable.FILLED_CARAFE).maxCount(1)));
        //end of carafes
    //public static final Item SLAGBUCKET = registerItem("end_stone_slag_bucket", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
      //  entries.add(ISITEMNAME);
     //   entries.add(SLAGCHUNK);
      //  entries.add(SLAGBUCKET)
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Octtkingstotemforge.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Octtkingstotemforge.LOGGER.info("Registering Mod Items for " + Octtkingstotemforge.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
