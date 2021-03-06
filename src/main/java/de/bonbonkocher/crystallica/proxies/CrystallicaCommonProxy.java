package de.bonbonkocher.crystallica.proxies;

import de.bonbonkocher.crystallica.Crystallica;
import de.bonbonkocher.crystallica.world.CrystallicaGenerator;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CrystallicaCommonProxy extends Crystallica
{
	public void preInit(FMLPreInitializationEvent e)
	{
		
	}

	public void init(FMLInitializationEvent e)
	{
		GameRegistry.registerWorldGenerator(new CrystallicaGenerator(), 0);
	}

	public void postInit(FMLPostInitializationEvent e)
	{

	}
}
