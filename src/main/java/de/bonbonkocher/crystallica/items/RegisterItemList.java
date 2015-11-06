package de.bonbonkocher.crystallica.items;

import de.bonbonkocher.crystallica.Crystallica;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterItemList
{
	public RegisterItemList()
	{
		GameRegistry.registerItem(Crystallica.ItemKristalleRubin, Crystallica.ItemKristalleRubin.getUnlocalizedName().substring(5));
		Crystallica.ItemKristalleRubin.registerTextures();
		GameRegistry.registerItem(Crystallica.ItemKristalleSaphir, Crystallica.ItemKristalleSaphir.getUnlocalizedName().substring(5));
		Crystallica.ItemKristalleSaphir.registerTextures();
		GameRegistry.registerItem(Crystallica.ItemKristalleTopas, Crystallica.ItemKristalleTopas.getUnlocalizedName().substring(5));
		Crystallica.ItemKristalleTopas.registerTextures();
		GameRegistry.registerItem(Crystallica.ItemKristalleAmethyst, Crystallica.ItemKristalleAmethyst.getUnlocalizedName().substring(5));
		Crystallica.ItemKristalleAmethyst.registerTextures();
		GameRegistry.registerItem(Crystallica.ItemKristalleAquamarin, Crystallica.ItemKristalleAquamarin.getUnlocalizedName().substring(5));
		Crystallica.ItemKristalleAquamarin.registerTextures();
		GameRegistry.registerItem(Crystallica.ItemKristalleBeryll, Crystallica.ItemKristalleBeryll.getUnlocalizedName().substring(5));
		Crystallica.ItemKristalleBeryll.registerTextures();
		GameRegistry.registerItem(Crystallica.ItemKristalleMalachit, Crystallica.ItemKristalleMalachit.getUnlocalizedName().substring(5));
		Crystallica.ItemKristalleMalachit.registerTextures();
		GameRegistry.registerItem(Crystallica.ItemKristalleMythril, Crystallica.ItemKristalleMythril.getUnlocalizedName().substring(5));
		Crystallica.ItemKristalleMythril.registerTextures();
		GameRegistry.registerItem(Crystallica.ItemKristallePyrit, Crystallica.ItemKristallePyrit.getUnlocalizedName().substring(5));
		Crystallica.ItemKristallePyrit.registerTextures();
	}
}
