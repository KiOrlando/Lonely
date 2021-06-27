package zaorlando.lonely;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.Biome;
import zaorlando.lonely.util.StructureDisabler;

public class Lonely implements ModInitializer 
{
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "lonely";

	@Override
	public void onInitialize()
	{
		// Allow Guardians to spawn in ocean biomes.
		// BiomeModifications.addSpawn(BiomeSelectors.categories(Biome.Category.OCEAN), SpawnGroup.MONSTER, EntityType.GUARDIAN, 2, 1, 3);
		// LOGGER.info("Guardians can now spawn in ocean biomes.");

		// Disable structures as defined in the config file.
		StructureDisabler.DisableStructuresFromConfig();
	}
}