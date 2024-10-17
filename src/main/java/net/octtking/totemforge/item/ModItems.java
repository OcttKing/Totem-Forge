package net.octtking.totemforge.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.octtking.totemforge.Octtkingstotemforge;
import net.octtking.totemforge.item.custom.IsItemClassItem;

public class ModItems {
    public static final Item ISITEMNAME = registerItem("isitemname",
            new IsItemClassItem(new FabricItemSettings().maxDamage(1)));
    public static final Item SLAGCHUNK = registerItem("end_stone_slag_chunk", new Item(new FabricItemSettings()));
    public static final Item SLAGBUCKET = registerItem("end_stone_slag_bucket", new Item(new FabricItemSettings()));

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
