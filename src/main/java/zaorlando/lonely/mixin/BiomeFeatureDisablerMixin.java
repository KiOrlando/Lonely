package zaorlando.lonely.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import zaorlando.lonely.config.ModConfig;

@Mixin(DefaultBiomeFeatures.class)
public class BiomeFeatureDisablerMixin 
{
    @Inject(method = "addDungeons", at = @At("INVOKE"))
    private static void lonely_addDungeons(GenerationSettings.Builder builder, CallbackInfo ci)
    {
        if(!ModConfig.INSTANCE.Structures.allowDungeon)
        {
            return;
        }
    }

    @Inject(method = "addDesertFeatures", at = @At("INVOKE"))
    private static void lonely_addDesertFeatures(GenerationSettings.Builder builder, CallbackInfo ci)
    {
        if(!ModConfig.INSTANCE.Structures.allowDesertWell)
        {
            return;
        }
    }

    @Inject(method = "addFossils", at = @At("INVOKE"))
    private static void lonely_allowFossils(GenerationSettings.Builder builder, CallbackInfo ci)
    {
        if(!ModConfig.INSTANCE.Structures.allowFossil)
        {
            return;
        }
    }

    @Inject(method = "addAmethystGeodes", at = @At("INVOKE"))
    private static void lonely_addAmethystGeodes(GenerationSettings.Builder builder, CallbackInfo ci)
    {
        if(!ModConfig.INSTANCE.Structures.allowAmethystGeode)
        {
            return;
        }
    }
}
