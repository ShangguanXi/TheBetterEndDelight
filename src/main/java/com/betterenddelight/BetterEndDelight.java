package com.betterenddelight;

import com.betterenddelight.registers.BlockRegister;
import com.betterenddelight.registers.ItemGroupRegister;
import com.betterenddelight.registers.ItemRegister;
import com.betterenddelight.registers.TagRegister;
import net.fabricmc.api.ModInitializer;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.util.Identifier;

public class BetterEndDelight implements ModInitializer {
	public static final String MOD_ID = "betterenddelight";

	public static final Identifier ROOT = new Identifier(MOD_ID, "root");

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static @NotNull Identifier makeId(String name) {
		return ROOT.withPath(name);
	}
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ItemGroupRegister.initialize();
		BlockRegister.initialize();
		ItemRegister.initialize();
		TagRegister.initialize();
		TagRegister.initialize();
		LOGGER.info("Hello Fabric world!");
	}
}