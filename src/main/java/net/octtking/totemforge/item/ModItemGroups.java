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
                        entries.add(ModItems.SLAGBUCKET);
                        entries.add(ModBlocks.END_STONE_SLAG_BLOCK);
                        entries.add(ModItems.ISITEMNAME);



                    }).build());

    public static void registerItemGroups() {
        Octtkingstotemforge.LOGGER.info("Registering Item Groups for " +Octtkingstotemforge.MOD_ID);
    }
}
