package com.pentaminer.scraptech;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScrapTech implements ModInitializer {

    public static final String MOD_ID = "scraptech";
    public static Item ROUGH_FABRIC;
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ROUGH_FABRIC = Registry.register(
            Registry.ITEM,
            new Identifier(MOD_ID, "rough_fabric"),
            new Item(new Item.Settings().group(ItemGroup.MISC))
        );

        LOGGER.info("Hello Fabric world!");
    }
}
