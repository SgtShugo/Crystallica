package de.bonbonkocher.crystallica.world;

import java.util.Random;

import de.bonbonkocher.crystallica.blocks.RegisterBlockList;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.biome.BiomeGenHell;
import net.minecraft.world.biome.BiomeGenHills;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;


public class CrystallicaGenerator implements IWorldGenerator
{
	private WorldGenerator Amethyst;
	private WorldGenerator Aquamarin;
	private WorldGenerator Beryll;
	private WorldGenerator Malachit;
	private WorldGenerator Mythril;
	private WorldGenerator Pyrit;
	private WorldGenerator Rubin;
	private WorldGenerator Saphir;
	private WorldGenerator Topas;

	
	public CrystallicaGenerator()
	{
		this.Amethyst = new CrystallicaWorldGenMinable(RegisterBlockList.BlockErzAmethyst.getDefaultState(), BlockHelper.forBlock(Blocks.netherrack));
		this.Aquamarin = new CrystallicaWorldGenMinable(RegisterBlockList.BlockErzAquamarin.getDefaultState());
		this.Beryll = new CrystallicaWorldGenMinable(RegisterBlockList.BlockErzBeryll.getDefaultState());
		this.Malachit = new CrystallicaWorldGenMinable(RegisterBlockList.BlockErzMalachit.getDefaultState());
		this.Mythril = new CrystallicaWorldGenMinable(RegisterBlockList.BlockErzMythril.getDefaultState());
		this.Pyrit = new CrystallicaWorldGenMinable(RegisterBlockList.BlockErzPyrit.getDefaultState());
		this.Rubin = new CrystallicaWorldGenMinable(RegisterBlockList.BlockErzMalachit.getDefaultState());
		this.Saphir = new CrystallicaWorldGenMinable(RegisterBlockList.BlockErzSaphir.getDefaultState());
		this.Topas = new CrystallicaWorldGenMinable(RegisterBlockList.BlockErzTopas.getDefaultState());
	}
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{		
		switch(world.provider.getDimensionId())
		{
			//NetherWorld
			case -1:
				this.addOreSpawn(this.Amethyst, world, random, chunkX, chunkZ, 5, 1, 200);
				break;
				
			//OverWorld
			case 0:
				this.addOreSpawn(this.Aquamarin, world, random, chunkX, chunkZ, 8, 45, 50);
				this.addOreSpawn(this.Beryll, world, random, chunkX, chunkZ, 8, 40, 45);
				this.addOreSpawn(this.Malachit, world, random, chunkX, chunkZ, 8, 35, 40);
				this.addOreSpawn(this.Mythril, world, random, chunkX, chunkZ, 8, 30, 35);
				this.addOreSpawn(this.Pyrit, world, random, chunkX, chunkZ, 8, 25, 30);
				//world.getHeightValue(RandPosX, RandPosZ);
				//if(world.getBiomeGenForCoords(new BlockPos(chunkX, y,chunkZ)) instanceof BiomeGenDesert)
				//{
				this.addOreBiom(world, random, chunkX, chunkZ, chunkY, BiomeGenDesert)
				{
					this.addOreSpawn(this.Rubin, world, random, chunkX, chunkZ, 8, 20, 25);
				}
				this.addOreSpawn(this.Saphir, world, random, chunkX, chunkZ, 8, 15, 20);
				this.addOreSpawn(this.Topas, world, random, chunkX, chunkZ, 8, 10, 15);
				break;
				
			//EndWorld
			case 1:
				break;
		}
	}
	
	public static void addOreBiom(World world, Random random, int chunkX, int chunkZ, int chunkY, String biomgen)
	{
		if(biomgen == i)
		{
			if(biomgen.toString() == world.set)
			{
				return;
			}
			else
			if(world.getBiomeGenForCoords(new BlockPos(chunkX, chunkY,chunkZ)) instanceof BiomeGenHell)
			{
				
			}
		}
	}

	public static void addOreSpawn(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chancesToSpawn, int minHeight, int maxHeight)
	{
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++)
		{
			int posX = chunkX * 16 + random.nextInt(16);
			int posY = minHeight + random.nextInt(heightDiff);
			int posZ = chunkZ * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
}
