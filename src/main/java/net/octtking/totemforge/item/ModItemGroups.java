package net.octtking.totemforge.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.octtking.totemforge.Octtkingstotemforge;
import net.octtking.totemforge.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TOTEM_FORGE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Octtkingstotemforge.MOD_ID, "end_stone_slag_chunk"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.totemforge"))
                    .icon(() -> new ItemStack(Items.TOTEM_OF_UNDYING)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SLAGCHUNK);
                        //entries.add(ModItems.SLAGBUCKET);
                        entries.add(ModBlocks.END_STONE_SLAG_BLOCK);
                        entries.add(ModItems.ISITEMNAME);

                        // carafes
                        entries.add(ModItems.WHITE_CARAFE);
                        entries.add(ModItems.LIGHT_GRAY_CARAFE);
                        entries.add(ModItems.GRAY_CARAFE);
                        entries.add(ModItems.BLACK_CARAFE);
                        entries.add(ModItems.BROWN_CARAFE);
                        entries.add(ModItems.RED_CARAFE);
                        entries.add(ModItems.ORANGE_CARAFE);
                        entries.add(ModItems.YELLOW_CARAFE);
                        entries.add(ModItems.LIME_CARAFE);
                        entries.add(ModItems.GREEN_CARAFE);
                        //entries.add(ModItems.CYAN_CARAFE);
                        entries.add(ModItems.LIGHT_BLUE_CARAFE);
                        entries.add(ModItems.BLUE_CARAFE);
                        //entries.add(ModItems.PURPLE_CARAFE);
                        //entries.add(ModItems.MAGENTA_CARAFE);
                        //entries.add(ModItems.PINK_CARAFE);

                        // filled carafes
                        entries.add(ModItems.FILLED_WHITE_CARAFE);
                        entries.add(ModItems.FILLED_LIGHT_GRAY_CARAFE);
                        entries.add(ModItems.FILLED_GRAY_CARAFE);
                        entries.add(ModItems.FILLED_BLACK_CARAFE);
                        entries.add(ModItems.FILLED_BROWN_CARAFE);
                        entries.add(ModItems.FILLED_RED_CARAFE);
                        entries.add(ModItems.FILLED_ORANGE_CARAFE);
                        entries.add(ModItems.FILLED_YELLOW_CARAFE);
                        entries.add(ModItems.FILLED_LIME_CARAFE);
                        entries.add(ModItems.FILLED_GREEN_CARAFE);
                        //entries.add(ModItems.FILLED_CYAN_CARAFE);
                        entries.add(ModItems.FILLED_LIGHT_BLUE_CARAFE);
                        entries.add(ModItems.FILLED_BLUE_CARAFE);
                        //entries.add(ModItems.FILLED_PURPLE_CARAFE);
                        //entries.add(ModItems.FILLED_MAGENTA_CARAFE);
                        //entries.add(ModItems.FILLED_PINK_CARAFE);
                    }).build());

    public static void registerItemGroups() {
        Octtkingstotemforge.LOGGER.info("Registering Item Groups for " +Octtkingstotemforge.MOD_ID);
    }
}
