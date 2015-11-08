package de.bonbonkocher.crystallica.world;

import java.util.Random;

import de.bonbonkocher.crystallica.Crystallica;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class CrystallicaGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimensionId())
		{
			case -1:
				gen_1(world, random, chunkX*16, chunkZ*16);
				break;
			case 0:
				gen0(world, random, chunkX*16, chunkZ*16);
				break;
			case 1:
				gen1(world, random, chunkX*16, chunkZ*16);
				break;
		}
	}
	
	private void gen_1(World world, Random random, int chunkX, int chunkZ)
	{
		for(int i = 0; i < 30; i++)
		{
			int posX = chunkX + random.nextInt(16);
			int posY = random.nextInt(64);
			int posZ = chunkZ + random.nextInt(16);
			new WorldGenMinable(Crystallica.BlockErzAmethyst.getDefaultState(), 5).generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
	
	private void gen0(World world, Random random, int chunkX, int chunkZ)
	{
		for(int i = 0; i < 30; i++)
		{
			int posX = chunkX + random.nextInt(16);
			int posY = random.nextInt(64);
			int posZ = chunkZ + random.nextInt(16);
			new WorldGenMinable(Crystallica.BlockErzMalachit.getDefaultState(), 10, BlockHelper.forBlock(Blocks.netherrack)).generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
	
	private void gen1(World world, Random random, int chunkX, int chunkZ)
	{
		for(int i = 0; i < 30; i++)
		{
			
		}
		
	}
}
