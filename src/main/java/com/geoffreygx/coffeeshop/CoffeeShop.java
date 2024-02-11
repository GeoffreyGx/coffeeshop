/*
	SEE https://geoffreygx.mit-license.org/
*/

package com.geoffreygx.coffeeshop;

import com.geoffreygx.coffeeshop.block.ModBlocks;
import com.geoffreygx.coffeeshop.item.ModItemGroups;
import com.geoffreygx.coffeeshop.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeShop implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "coffeeshop";
    public static final Logger LOGGER = LoggerFactory.getLogger("coffeeshop");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("CoffeeShop v.0.1 by GeoffreyGx");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}