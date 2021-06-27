package zaorlando.lonely.util;

import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import zaorlando.lonely.config.ModConfig;
import zaorlando.lonely.Lonely;

public class StructureDisabler
{
	public static void DisableStructuresFromConfig()
	{
		if(!ModConfig.INSTANCE.Structures.allowVillage)
		{
			DisableStructure(StructureFeature.VILLAGE);
		}
		if(!ModConfig.INSTANCE.Structures.allowDesertTemple)
		{
			DisableStructure(StructureFeature.DESERT_PYRAMID);
		}
		if(!ModConfig.INSTANCE.Structures.allowIgloo)
		{
			DisableStructure(StructureFeature.IGLOO);
		}
		if(!ModConfig.INSTANCE.Structures.allowJungleTemple)
		{
			DisableStructure(StructureFeature.JUNGLE_PYRAMID);
		}
		if(!ModConfig.INSTANCE.Structures.allowWitchHut)
		{
			DisableStructure(StructureFeature.SWAMP_HUT);
		}
		if(!ModConfig.INSTANCE.Structures.allowPillagerOutpost)
		{
			DisableStructure(StructureFeature.PILLAGER_OUTPOST);
		}
		if(!ModConfig.INSTANCE.Structures.allowStronghold)
		{
			DisableStructure(StructureFeature.STRONGHOLD);
		}
		if(!ModConfig.INSTANCE.Structures.allowOceanMonument)
		{
			DisableStructure(StructureFeature.MONUMENT);
		}
		if(!ModConfig.INSTANCE.Structures.allowEndCity)
		{
			DisableStructure(StructureFeature.END_CITY);
		}
		if(!ModConfig.INSTANCE.Structures.allowWoodlandMansion)
		{
			DisableStructure(StructureFeature.MANSION);
		}
		if(!ModConfig.INSTANCE.Structures.allowBuriedTreasure)
		{
			DisableStructure(StructureFeature.BURIED_TREASURE);
		}
		if(!ModConfig.INSTANCE.Structures.allowMineshaft)
		{
			DisableStructure(StructureFeature.MINESHAFT);
		}
		if(!ModConfig.INSTANCE.Structures.allowRuinedPortal)
		{
			DisableStructure(StructureFeature.RUINED_PORTAL);
		}
		if(!ModConfig.INSTANCE.Structures.allowShipwreck)
		{
			DisableStructure(StructureFeature.SHIPWRECK);
		}
		if(!ModConfig.INSTANCE.Structures.allowOceanRuin)
		{
			DisableStructure(StructureFeature.OCEAN_RUIN);
		}
		if(!ModConfig.INSTANCE.Structures.allowBastionRemnant)
		{
			DisableStructure(StructureFeature.BASTION_REMNANT);
		}
		if(!ModConfig.INSTANCE.Structures.allowNetherFortress)
		{
			DisableStructure(StructureFeature.FORTRESS);
		}
		if(!ModConfig.INSTANCE.Structures.allowNetherFossil)
		{
			DisableStructure(StructureFeature.NETHER_FOSSIL);
		}
	}

	public static <C extends FeatureConfig> void DisableStructure(StructureFeature<C> structure)
	{
        Lonely.LOGGER.debug("Disabling structure '" + structure.getName() + "'.");
		ChunkGeneratorSettings.getInstance().getStructuresConfig().getStructures().remove(structure);
	}
}
