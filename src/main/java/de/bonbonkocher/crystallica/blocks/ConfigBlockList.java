package de.bonbonkocher.crystallica.blocks;

import net.minecraft.block.material.Material;
import de.bonbonkocher.crystallica.Crystallica;

public class ConfigBlockList
{
	public ConfigBlockList()
	{
		//Material, unlocalizedName, hardness, resistance, lightLevel, tool, havestLevel[0=Holz,Gold,1=Stone,2=Eisen,3=Diamant]
		Crystallica.rubin = new CrystallicaDefaultBlock(Material.iron, "Rubin", 1.0F, 1.0F, 0.25F, "pickaxe", 2);
		Crystallica.saphir = new CrystallicaDefaultBlock(Material.iron, "Saphir", 1.0F, 1.0F, 0.1F, "pickaxe", 2);
		Crystallica.topas = new CrystallicaDefaultBlock(Material.iron, "Topas", 1.0F, 1.0F, 0.5F, "pickaxe", 2);
		Crystallica.aquamarin = new CrystallicaDefaultBlock(Material.iron, "Aquamarin", 1.0F, 1.0F, 0.3F, "pickaxe", 2);
		Crystallica.beryll = new CrystallicaDefaultBlock(Material.iron, "Beryll", 1.0F, 1.0F, 0.8F, "pickaxe", 2);
		Crystallica.mythril = new CrystallicaDefaultBlock(Material.iron, "Mythril", 1.0F, 1.0F, 0.25F, "pickaxe", 2);
		Crystallica.pyrit = new CrystallicaDefaultBlock(Material.iron, "Pyrit", 1.0F, 1.0F, 0.8F, "pickaxe", 2);
		//Hoelle
		Crystallica.amethyst = new CrystallicaDefaultBlock(Material.iron, "Amethyst", 1.0F, 1.0F, 0.1F, "pickaxe", 2);
		Crystallica.malachit = new CrystallicaDefaultBlock(Material.iron, "Malachit", 1.0F, 1.0F, 0.25F, "pickaxe", 2);
	}
}
