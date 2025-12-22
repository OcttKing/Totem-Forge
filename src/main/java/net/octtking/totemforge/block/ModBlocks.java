package net.octtking.totemforge.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.octtking.totemforge.Octtkingstotemforge;

public class ModBlocks {
    //What to Register
    public static final Block END_STONE_SLAG_BLOCK = registerBlock("end_stone_slag_block",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)));
    public static final Block RAW_VOIDIUM = registerBlock("raw_voidium",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.HONEY)));




    //register as physical block
    private static Block registerBlock(String name,Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Octtkingstotemforge.MOD_ID, name), block);
    }
    //register as item
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Octtkingstotemforge.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    //confirm finalization
    public static void registermodblocks() {
        Octtkingstotemforge.LOGGER.info("Register ModBlocks for" + Octtkingstotemforge.MOD_ID);
    }
}
