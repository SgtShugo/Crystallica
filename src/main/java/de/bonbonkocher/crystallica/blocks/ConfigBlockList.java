package de.bonbonkocher.crystallica.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import de.bonbonkocher.crystallica.Crystallica;

public class ConfigBlockList
{
	public ConfigBlockList()
	{
		//Material, unlocalizedName, hardness, resistance, lightLevel, tool, havestLevel[0=Holz,Gold,1=Stone,2=Eisen,3=Diamant]
		Crystallica.BlockErzAmethyst = new CrystallicaDefaultBlock(Material.iron, "BlockErzAmethyst", 1.0F, 1.0F, 0.1F, "pickaxe", 2, Crystallica.ItemKristalleAmethyst, 1, 1, 1);
		Crystallica.BlockErzAquamarin = new CrystallicaDefaultBlock(Material.iron, "BlockErzAquamarin", 1.0F, 1.0F, 0.3F, "pickaxe", 2, Crystallica.ItemKristalleAquamarin, 1, 1, 1);
		Crystallica.BlockErzBeryll = new CrystallicaDefaultBlock(Material.iron, "BlockErzBeryll", 1.0F, 1.0F, 0.8F, "pickaxe", 2, Crystallica.ItemKristalleBeryll, 1, 1, 1);
		Crystallica.BlockErzMalachit = new CrystallicaDefaultBlock(Material.iron, "BlockErzMalachit", 1.0F, 1.0F, 0.25F, "pickaxe", 2, Crystallica.ItemKristalleMalachit, 1, 1, 1);
		Crystallica.BlockErzMythril = new CrystallicaDefaultBlock(Material.iron, "BlockErzMythril", 1.0F, 1.0F, 0.25F, "pickaxe", 2, Crystallica.ItemKristalleMythril, 1, 1, 1);
		Crystallica.BlockErzPyrit = new CrystallicaDefaultBlock(Material.iron, "BlockErzPyrit", 1.0F, 1.0F, 0.8F, "pickaxe", 2, Crystallica.ItemKristallePyrit, 1, 1, 1);
		Crystallica.BlockErzRubin = new CrystallicaDefaultBlock(Material.iron, "BlockErzRubin", 1.0F, 1.0F, 0.25F, "pickaxe", 2, Crystallica.ItemKristalleRubin, 1, 1, 5);
		Crystallica.BlockErzSaphir = new CrystallicaDefaultBlock(Material.iron, "BlockErzSaphir", 1.0F, 1.0F, 0.1F, "pickaxe", 2, Crystallica.ItemKristalleSaphir, 1, 1, 1);
		Crystallica.BlockErzTopas = new CrystallicaDefaultBlock(Material.iron, "BlockErzTopas", 1.0F, 1.0F, 0.5F, "pickaxe", 2, Crystallica.ItemKristalleTopas, 1, 1, 1);
	}
}
