package de.bonbonkocher.crystallica.blocks;

import net.minecraft.block.material.Material;
import de.bonbonkocher.crystallica.Crystallica;

public class ConfigBlockList
{
	public ConfigBlockList()
	{
		Crystallica.rubin = new CrystallicaDefaultBlock(Material.ground, "Rubin", 1.0F, 1.0F, 0.3F, "pickaxe", 1);
		Crystallica.saphir = new CrystallicaDefaultBlock(Material.ground, "Saphir", 1.0F, 1.0F, 0.3F, "pickaxe", 1);
		Crystallica.topas = new CrystallicaDefaultBlock(Material.ground, "Topas", 1.0F, 1.0F, 0.3F, "pickaxe", 1);
	}
}
