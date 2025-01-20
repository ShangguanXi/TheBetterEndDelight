package com.betterenddelight;

import com.betterenddelight.registers.blocks.WildCrops;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BetterEndDelightClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(
				RenderLayer.getCutout(),
				WildCrops.WILD_ALOE_VERA
		);
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
	}
}