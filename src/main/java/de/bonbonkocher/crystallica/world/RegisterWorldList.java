package de.bonbonkocher.crystallica.world;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterWorldList
{
	public RegisterWorldList()
	{
		GameRegistry.registerWorldGenerator(new CrystallicaGenerator(), 1);
	}
}
