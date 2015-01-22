package de.bonbonkocher.crystallica;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.bonbonkocher.crystallica.proxis.CommonProxy;

@Mod(modid = Crystallica.MODID, name = Crystallica.NAME, version = Crystallica.VERSION)
public class Crystallica {
	public static final String MODID = "crystallica";
	public static final String NAME = "Crystallica";
	public static final String VERSION = "1.7.10 0.0.0.1";

	@SidedProxy(clientSide = "de.crystallica.proxies.ClientProxy", serverSide = "de.crystallica.proxies.CommonProxy")
	public static CommonProxy proxy;
	

	//Blocks
    public static Block holzkohleblock;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
