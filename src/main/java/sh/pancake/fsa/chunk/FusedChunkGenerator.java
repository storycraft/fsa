package sh.pancake.fsa.chunk;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.mojang.serialization.MapCodec;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkRegion;
import net.minecraft.world.HeightLimitView;
import net.minecraft.world.Heightmap.Type;
import net.minecraft.world.biome.source.BiomeAccess;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.Blender;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.VerticalBlockSample;
import net.minecraft.world.gen.noise.NoiseConfig;

public class FusedChunkGenerator extends ChunkGenerator {
    public FusedChunkGenerator(BiomeSource biomeSource) {
        super(biomeSource);
    }

    public static final MapCodec<FusedChunkGenerator> CODEC = null;

    @Override
    protected MapCodec<? extends ChunkGenerator> getCodec() {
        return CODEC;
    }

    @Override
    public void carve(ChunkRegion chunkRegion, long seed, NoiseConfig noiseConfig, BiomeAccess biomeAccess,
            StructureAccessor structureAccessor, Chunk chunk) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'carve'");
    }

    @Override
    public void buildSurface(ChunkRegion region, StructureAccessor structures, NoiseConfig noiseConfig, Chunk chunk) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildSurface'");
    }

    @Override
    public void populateEntities(ChunkRegion region) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'populateEntities'");
    }

    @Override
    public int getWorldHeight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWorldHeight'");
    }

    @Override
    public CompletableFuture<Chunk> populateNoise(Blender blender, NoiseConfig noiseConfig,
            StructureAccessor structureAccessor, Chunk chunk) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'populateNoise'");
    }

    @Override
    public int getSeaLevel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSeaLevel'");
    }

    @Override
    public int getMinimumY() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMinimumY'");
    }

    @Override
    public int getHeight(int x, int z, Type heightmap, HeightLimitView world, NoiseConfig noiseConfig) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHeight'");
    }

    @Override
    public VerticalBlockSample getColumnSample(int x, int z, HeightLimitView world, NoiseConfig noiseConfig) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getColumnSample'");
    }

    @Override
    public void appendDebugHudText(List<String> text, NoiseConfig noiseConfig, BlockPos pos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'appendDebugHudText'");
    }
}
