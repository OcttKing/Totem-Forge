package net.octtking.totemforge;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Octtkingstotemforge implements ModInitializer {
	public static final String MOD_ID = "octtkingstotemforge";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}

//Change