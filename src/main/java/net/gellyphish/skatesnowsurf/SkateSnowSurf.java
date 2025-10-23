package net.gellyphish.skatesnowsurf;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.gellyphish.skatesnowsurf.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkateSnowSurf implements ModInitializer {
	public static final String MOD_ID = "skatesnowsurf";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		FuelRegistry.INSTANCE.add(ModItems.WOODEN_BOARD, 200);
	}
}