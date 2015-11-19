package de.bonbonkocher.crystallica.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;
import de.bonbonkocher.crystallica.Crystallica;

public class RegisterBlockList
{
	//Erze
	public static CrystallicaDefaultBlock BlockErzAmethyst;
	public static CrystallicaDefaultBlock BlockErzAquamarin;
	public static CrystallicaDefaultBlock BlockErzBeryll;
	public static CrystallicaDefaultBlock BlockErzMalachit;
	public static CrystallicaDefaultBlock BlockErzMythril;
	public static CrystallicaDefaultBlock BlockErzPyrit;
	public static CrystallicaDefaultBlock BlockErzRubin;
	public static CrystallicaDefaultBlock BlockErzSaphir;
	public static CrystallicaDefaultBlock BlockErzTopas;
	
	public RegisterBlockList()
	{
		GameRegistry.registerBlock(BlockErzAmethyst, BlockErzAmethyst.getUnlocalizedName().substring(5));
		BlockErzAmethyst.registerTexture();
		GameRegistry.registerBlock(BlockErzAquamarin, BlockErzAquamarin.getUnlocalizedName().substring(5));
		BlockErzAquamarin.registerTexture();
		GameRegistry.registerBlock(BlockErzBeryll, BlockErzBeryll.getUnlocalizedName().substring(5));
		BlockErzBeryll.registerTexture();
		GameRegistry.registerBlock(BlockErzMalachit, BlockErzMalachit.getUnlocalizedName().substring(5));
		BlockErzMalachit.registerTexture();
		GameRegistry.registerBlock(BlockErzMythril, BlockErzMythril.getUnlocalizedName().substring(5));
		BlockErzMythril.registerTexture();
		GameRegistry.registerBlock(BlockErzPyrit, BlockErzPyrit.getUnlocalizedName().substring(5));
		BlockErzPyrit.registerTexture();
		GameRegistry.registerBlock(BlockErzRubin, BlockErzRubin.getUnlocalizedName().substring(5));
		BlockErzRubin.registerTexture();
		GameRegistry.registerBlock(BlockErzSaphir, BlockErzSaphir.getUnlocalizedName().substring(5));
		BlockErzSaphir.registerTexture();
		GameRegistry.registerBlock(BlockErzTopas, BlockErzTopas.getUnlocalizedName().substring(5));
		BlockErzTopas.registerTexture();
	}
}
