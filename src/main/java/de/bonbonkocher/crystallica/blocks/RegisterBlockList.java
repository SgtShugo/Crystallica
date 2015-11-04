package de.bonbonkocher.crystallica.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;
import de.bonbonkocher.crystallica.Crystallica;

public class RegisterBlockList
{
	public RegisterBlockList()
	{
		GameRegistry.registerBlock(Crystallica.rubin, "Rubin");
		Crystallica.rubin.registerTexture();
		GameRegistry.registerBlock(Crystallica.saphir, "Saphir");
		Crystallica.saphir.registerTexture();
		GameRegistry.registerBlock(Crystallica.topas, "Topas");
		Crystallica.topas.registerTexture();
		GameRegistry.registerBlock(Crystallica.amethyst, "Amethyst");
		Crystallica.amethyst.registerTexture();
		GameRegistry.registerBlock(Crystallica.aquamarin, "Aquamarin");
		Crystallica.aquamarin.registerTexture();
		GameRegistry.registerBlock(Crystallica.beryll, "Beryll");
		Crystallica.beryll.registerTexture();
		GameRegistry.registerBlock(Crystallica.malachit, "Malachit");
		Crystallica.malachit.registerTexture();
		GameRegistry.registerBlock(Crystallica.mythril, "Mythril");
		Crystallica.mythril.registerTexture();
		GameRegistry.registerBlock(Crystallica.pyrit, "Pyrit");
		Crystallica.pyrit.registerTexture();
	}
}
