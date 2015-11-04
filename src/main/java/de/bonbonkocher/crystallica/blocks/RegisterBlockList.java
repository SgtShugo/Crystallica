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
	}
}
