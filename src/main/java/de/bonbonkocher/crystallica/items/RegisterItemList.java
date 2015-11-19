package de.bonbonkocher.crystallica.items;

import de.bonbonkocher.crystallica.Crystallica;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterItemList
{
	//Kristalle
	public static CrystallicaDefaultItems ItemKristalleRubin;
	public static CrystallicaDefaultItems ItemKristalleSaphir;
	public static CrystallicaDefaultItems ItemKristalleTopas;
	public static CrystallicaDefaultItems ItemKristalleAmethyst;
	public static CrystallicaDefaultItems ItemKristalleAquamarin;
	public static CrystallicaDefaultItems ItemKristalleBeryll;
	public static CrystallicaDefaultItems ItemKristalleMalachit;
	public static CrystallicaDefaultItems ItemKristalleMythril;
	public static CrystallicaDefaultItems ItemKristallePyrit;
	
	public RegisterItemList()
	{
		GameRegistry.registerItem(ItemKristalleRubin, ItemKristalleRubin.getUnlocalizedName().substring(5));
		ItemKristalleRubin.registerTextures();
		GameRegistry.registerItem(ItemKristalleSaphir, ItemKristalleSaphir.getUnlocalizedName().substring(5));
		ItemKristalleSaphir.registerTextures();
		GameRegistry.registerItem(ItemKristalleTopas, ItemKristalleTopas.getUnlocalizedName().substring(5));
		ItemKristalleTopas.registerTextures();
		GameRegistry.registerItem(ItemKristalleAmethyst, ItemKristalleAmethyst.getUnlocalizedName().substring(5));
		ItemKristalleAmethyst.registerTextures();
		GameRegistry.registerItem(ItemKristalleAquamarin, ItemKristalleAquamarin.getUnlocalizedName().substring(5));
		ItemKristalleAquamarin.registerTextures();
		GameRegistry.registerItem(ItemKristalleBeryll, ItemKristalleBeryll.getUnlocalizedName().substring(5));
		ItemKristalleBeryll.registerTextures();
		GameRegistry.registerItem(ItemKristalleMalachit, ItemKristalleMalachit.getUnlocalizedName().substring(5));
		ItemKristalleMalachit.registerTextures();
		GameRegistry.registerItem(ItemKristalleMythril, ItemKristalleMythril.getUnlocalizedName().substring(5));
		ItemKristalleMythril.registerTextures();
		GameRegistry.registerItem(ItemKristallePyrit, ItemKristallePyrit.getUnlocalizedName().substring(5));
		ItemKristallePyrit.registerTextures();
	}
}
