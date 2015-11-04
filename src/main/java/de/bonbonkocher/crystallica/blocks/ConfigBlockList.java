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
	}
}
