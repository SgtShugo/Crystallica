package de.bonbonkocher.crystallica.proxies;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CrystallicaClientProxy extends CrystallicaCommonProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent e)
	{
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e)
	{
		super.init(e);

		//ItemRenderRegister.registerItemRenderer();
		//BlockRenderRegister.registerBlockRenderer();
	}

	@Override
	public void postInit(FMLPostInitializationEvent e)
	{
		super.postInit(e);
	}
}
