package de.bonbonkocher.crystallica;


import com.sun.security.auth.login.ConfigFile;

import de.bonbonkocher.crystallica.proxies.CrystallicaCommonProxy;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid="Crystallica.MODID", name="Crystallica.NAME", version="Crystallica.VERSION")

public class Crystallica
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "00.00.0.0001";
    public static final String NAME = "Crystallica";
    
	@Instance
	public static Crystallica instance;
	
	@SidedProxy(clientSide="de.bonbonkocher.crystallica.proxies.CrystallicaClientProxy", serverSide="de.bonbonkocher.crystallica.proxies.CrystallicaCommonProxy")
	public static CrystallicaCommonProxy proxy;

	/**
	 * Config ersteller
	 */
	//#############################################
	//Shaped = Geformt
	public static boolean Horse_Armor = true;
	//#############################################
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//config erstellen oder berarbeiten
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		Horse_Armor = config.get("Shaped", "Horse_Armor", true).getBoolean(true);
		
		config.save();
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
