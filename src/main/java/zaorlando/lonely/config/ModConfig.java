package zaorlando.lonely.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import zaorlando.lonely.Lonely;

@Config(name = Lonely.MOD_ID)
public class ModConfig implements ConfigData
{
    @ConfigEntry.Gui.Excluded
    public static ModConfig INSTANCE = init();

    public static ModConfig init()
    {
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }
    
    @ConfigEntry.Gui.CollapsibleObject
    public StructureGenConfig Structures = new StructureGenConfig();

    public static class StructureGenConfig 
    {
        public boolean allowVillage         = true;
        public boolean allowDesertTemple    = true;
        public boolean allowIgloo           = true;
        public boolean allowJungleTemple    = true;
        public boolean allowWitchHut        = true;
        public boolean allowPillagerOutpost = true;
        public boolean allowStronghold      = true;
        public boolean allowOceanMonument   = true;
        public boolean allowEndCity         = true;
        public boolean allowWoodlandMansion = true;
        public boolean allowBuriedTreasure  = true;
        public boolean allowMineshaft       = true;
        public boolean allowRuinedPortal    = true;
        public boolean allowShipwreck       = true;
        public boolean allowOceanRuin       = true;
        public boolean allowBastionRemnant  = true;
        public boolean allowNetherFortress  = true;
        public boolean allowNetherFossil    = true;
        // Not Technically Structures, Disabled Via Mixin.
        public boolean allowDungeon         = true;
        public boolean allowDesertWell      = true;
        public boolean allowFossil          = true;
        public boolean allowAmethystGeode   = true;
    }

    // These settings are for toggling added features that 
    // allow minecraft to be completed with structures disabled.

    
}
