package de.bonbonkocher.crystallica;


import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.sun.security.auth.login.ConfigFile;

import de.bonbonkocher.crystallica.blocks.CrystallicaDefaultBlock;
import de.bonbonkocher.crystallica.proxies.CrystallicaCommonProxy;



@Mod(modid=Crystallica.MODID, name=Crystallica.NAME, version=Crystallica.VERSION)

public class Crystallica
{
    public static final String MODID = "crystallica";
    public static final String NAME = "Crystallica";
    public static final String VERSION = "00.00.01-1.8.0";
    
	@Instance
	public static Crystallica instance = new Crystallica();
	
	@SidedProxy
	(
			clientSide="de.bonbonkocher.crystallica.proxies.CrystallicaClientProxy", 
			serverSide="de.bonbonkocher.crystallica.proxies.CrystallicaCommonProxy"
	)
	public static CrystallicaCommonProxy proxy;

	/**
	 * Config ersteller
	 */
	//#############################################
	//Shaped = Geformt
	//public static boolean Horse_Armor = true;
	//#############################################

	/**
	 * Blocks erstellen
	 */
	public static CrystallicaDefaultBlock rubin;
	public static CrystallicaDefaultBlock saphir;
	public static CrystallicaDefaultBlock topas;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//config erstellen oder berarbeiten
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
        //Horse_Armor = config.get("Shaped", "Horse_Armor", true).getBoolean(true);
		
		config.save();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		new LoaderList();
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
