package com.exceldxdy.agrigeoquim;

import com.exceldxdy.agrigeoquim.bloques.RegBloques;
import com.exceldxdy.agrigeoquim.items.Grupos;
import com.exceldxdy.agrigeoquim.items.RegItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Agrigeoquim implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "agq";
	public static final Logger LOGGER = LoggerFactory.getLogger("agq");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		Grupos.registrarGrupos();
		RegBloques.registrarBloquesMod();
		RegItems.registrarItemsMod();
	}
}