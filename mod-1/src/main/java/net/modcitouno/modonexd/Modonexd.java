package net.modcitouno.modonexd;

import net.fabricmc.api.ModInitializer;
import net.modcitouno.modonexd.item.moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Modonexd implements ModInitializer {

	public static final String MOD_ID = "modonexd";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		moditems.registerModItems();

	}
}
