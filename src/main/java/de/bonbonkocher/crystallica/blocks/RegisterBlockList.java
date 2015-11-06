package de.bonbonkocher.crystallica.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;
import de.bonbonkocher.crystallica.Crystallica;

public class RegisterBlockList
{
	public RegisterBlockList()
	{
		GameRegistry.registerBlock(Crystallica.BlockErzAmethyst, Crystallica.BlockErzAmethyst.getUnlocalizedName().substring(5));
		Crystallica.BlockErzAmethyst.registerTexture();
		GameRegistry.registerBlock(Crystallica.BlockErzAquamarin, Crystallica.BlockErzAquamarin.getUnlocalizedName().substring(5));
		Crystallica.BlockErzAquamarin.registerTexture();
		GameRegistry.registerBlock(Crystallica.BlockErzBeryll, Crystallica.BlockErzBeryll.getUnlocalizedName().substring(5));
		Crystallica.BlockErzBeryll.registerTexture();
		GameRegistry.registerBlock(Crystallica.BlockErzMalachit, Crystallica.BlockErzMalachit.getUnlocalizedName().substring(5));
		Crystallica.BlockErzMalachit.registerTexture();
		GameRegistry.registerBlock(Crystallica.BlockErzMythril, Crystallica.BlockErzMythril.getUnlocalizedName().substring(5));
		Crystallica.BlockErzMythril.registerTexture();
		GameRegistry.registerBlock(Crystallica.BlockErzPyrit, Crystallica.BlockErzPyrit.getUnlocalizedName().substring(5));
		Crystallica.BlockErzPyrit.registerTexture();
		GameRegistry.registerBlock(Crystallica.BlockErzRubin, Crystallica.BlockErzRubin.getUnlocalizedName().substring(5));
		Crystallica.BlockErzRubin.registerTexture();
		GameRegistry.registerBlock(Crystallica.BlockErzSaphir, Crystallica.BlockErzSaphir.getUnlocalizedName().substring(5));
		Crystallica.BlockErzSaphir.registerTexture();
		GameRegistry.registerBlock(Crystallica.BlockErzTopas, Crystallica.BlockErzTopas.getUnlocalizedName().substring(5));
		Crystallica.BlockErzTopas.registerTexture();
	}
}
