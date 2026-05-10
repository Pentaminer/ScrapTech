package com.pentaminer.scraptech;

import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.AbstractBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScrapTech implements ModInitializer {

    public static final String MOD_ID = "scraptech";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final ItemGroup SCRAPTECH_GROUP = FabricItemGroupBuilder.build(
        new Identifier(MOD_ID, "scraptech"),
        () -> new ItemStack(Items.REDSTONE) // иконка вкладки
    );

    // =========================
    // ITEM
    // =========================
    public static final Item ROUGH_FABRIC = Registry.register(
            Registry.ITEM,
            new Identifier(MOD_ID, "rough_fabric"),
            new Item(new Item.Settings().group(SCRAPTECH_GROUP))
    );

    // =========================
    // BLOCK
    // =========================
    public static final Block ROUGH_FABRIC_BLOCK = Registry.register(
            Registry.BLOCK,
            new Identifier(MOD_ID, "rough_fabric_block"),
            new Block(AbstractBlock.Settings.of(Material.WOOL).strength(0.2f))
    );

    public static final Item ROUGH_FABRIC_BLOCK_ITEM = Registry.register(
            Registry.ITEM,
            new Identifier(MOD_ID, "rough_fabric_block"),
            new BlockItem(ROUGH_FABRIC_BLOCK, new Item.Settings().group(SCRAPTECH_GROUP))
    );

    // =========================
    // INIT
    // =========================
    @Override
    public void onInitialize() {
        LOGGER.info("ScrapTech initialized");
    }
}
