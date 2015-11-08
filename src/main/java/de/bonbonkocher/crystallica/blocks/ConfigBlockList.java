package de.bonbonkocher.crystallica.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import de.bonbonkocher.crystallica.Crystallica;
import de.bonbonkocher.crystallica.blocks.erz.BlockErzAmethyst;
import de.bonbonkocher.crystallica.blocks.erz.BlockErzAquamarin;
import de.bonbonkocher.crystallica.blocks.erz.BlockErzBeryll;
import de.bonbonkocher.crystallica.blocks.erz.BlockErzMalachit;
import de.bonbonkocher.crystallica.blocks.erz.BlockErzMythril;
import de.bonbonkocher.crystallica.blocks.erz.BlockErzPyrit;
import de.bonbonkocher.crystallica.blocks.erz.BlockErzRubin;
import de.bonbonkocher.crystallica.blocks.erz.BlockErzSaphir;
import de.bonbonkocher.crystallica.blocks.erz.BlockErzTopas;

public class ConfigBlockList
{
	public ConfigBlockList()
	{
		//Material, unlocalizedName, hardness, resistance, lightLevel, tool, havestLevel[0=Holz,Gold,1=Stone,2=Eisen,3=Diamant]
		Crystallica.BlockErzAmethyst = new BlockErzAmethyst(Material.iron, "BlockErzAmethyst", 1.0F, 1.0F, 0.1F, "pickaxe", 2, 1);
		Crystallica.BlockErzAquamarin = new BlockErzAquamarin(Material.iron, "BlockErzAquamarin", 1.0F, 1.0F, 0.3F, "pickaxe", 2, 1);
		Crystallica.BlockErzBeryll = new BlockErzBeryll(Material.iron, "BlockErzBeryll", 1.0F, 1.0F, 0.8F, "pickaxe", 2, 1);
		Crystallica.BlockErzMalachit = new BlockErzMalachit(Material.iron, "BlockErzMalachit", 1.0F, 1.0F, 0.25F, "pickaxe", 2, 1);
		Crystallica.BlockErzMythril = new BlockErzMythril(Material.iron, "BlockErzMythril", 1.0F, 1.0F, 0.25F, "pickaxe", 2, 1);
		Crystallica.BlockErzPyrit = new BlockErzPyrit(Material.iron, "BlockErzPyrit", 1.0F, 1.0F, 0.8F, "pickaxe", 2, 1);
		Crystallica.BlockErzRubin = new BlockErzRubin(Material.iron, "BlockErzRubin", 1.0F, 1.0F, 0.25F, "pickaxe", 2, 1);
		Crystallica.BlockErzSaphir = new BlockErzSaphir(Material.iron, "BlockErzSaphir", 1.0F, 1.0F, 0.1F, "pickaxe", 2, 1);
		Crystallica.BlockErzTopas = new BlockErzTopas(Material.iron, "BlockErzTopas", 1.0F, 1.0F, 0.5F, "pickaxe", 2, 1);
	}
}
