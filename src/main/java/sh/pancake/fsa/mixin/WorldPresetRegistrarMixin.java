package sh.pancake.fsa.mixin;

import java.util.List;
import java.util.Optional;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import net.fabricmc.fabric.impl.biome.modification.BuiltInRegistryKeys;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.gen.WorldPreset;
import net.minecraft.world.gen.WorldPresets;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.FlatChunkGenerator;
import net.minecraft.world.gen.chunk.FlatChunkGeneratorConfig;
import sh.pancake.fsa.Mod;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(value = WorldPresets.Registrar.class, priority = 9999)
public abstract class WorldPresetRegistrarMixin {
        private static final RegistryKey<WorldPreset> TEST = RegistryKey.of(RegistryKeys.WORLD_PRESET,
                        Identifier.of(Mod.Id, "test"));

        @Shadow
        protected abstract void register(RegistryKey<WorldPreset> key, DimensionOptions dimensionOptions);

        @Shadow
        protected abstract DimensionOptions createOverworldOptions(ChunkGenerator chunkGenerator);

        @Inject(method = "bootstrap()V", at = @At("TAIL"), require = 1)
        public void bootstrap() {
                System.out.println("test added.");
                this.register(TEST, this.createOverworldOptions(new FlatChunkGenerator(new FlatChunkGeneratorConfig(
                                Optional.empty(),
                                BuiltInRegistryKeys.biomeRegistryWrapper().getOrThrow(BiomeKeys.BADLANDS),
                                List.of()))));
        }
}