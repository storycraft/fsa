package sh.pancake.fsa;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod implements ModInitializer {
	public static final String Id = "fsa-world";
	public static final Logger LOGGER = LoggerFactory.getLogger(Id);

	@Override
	public void onInitialize() {
		LOGGER.info("mod initialized");
	}
}