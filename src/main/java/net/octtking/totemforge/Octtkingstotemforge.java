package net.octtking.totemforge;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.octtking.totemforge.block.ModBlocks;
import net.octtking.totemforge.entity.damage.ModDamageSources;
import net.octtking.totemforge.item.ModItemGroups;
import net.octtking.totemforge.item.ModItems;
import net.octtking.totemforge.registry.DamageTypeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Octtkingstotemforge implements ModInitializer {
	public static final String MOD_ID = "octtkingstotemforge";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		DamageTypeRegistry.register();

		ModItems.registerModItems();

		ModBlocks.registermodblocks();
	}
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}