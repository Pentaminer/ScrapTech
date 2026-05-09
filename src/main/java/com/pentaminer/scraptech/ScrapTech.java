package com.pentaminer.scraptech;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScrapTech implements ModInitializer {
	public static final String MOD_ID = "scraptech";
	public static final Item ROUGH_FABRIC = Registry.register(
        Registry.ITEM,
        new Identifier("scraptech", "rough_fabric"),
        new Item(new Item.Settings().group(ItemGroup.MISC))
    );
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}
