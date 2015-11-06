package de.bonbonkocher.crystallica;


import net.minecraft.creativetab.CreativeTabs;
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
import de.bonbonkocher.crystallica.items.CrystallicaDefaultItems;
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
	 * Taps erstellen
	 */
	public static CreativeTabs crystallicataps;
	/**
	 * Blocks erstellen
	 */
	//Erze
	public static CrystallicaDefaultBlock BlockErzAmethyst;
	public static CrystallicaDefaultBlock BlockErzAquamarin;
	public static CrystallicaDefaultBlock BlockErzBeryll;
	public static CrystallicaDefaultBlock BlockErzMalachit;
	public static CrystallicaDefaultBlock BlockErzMythril;
	public static CrystallicaDefaultBlock BlockErzPyrit;
	public static CrystallicaDefaultBlock BlockErzRubin;
	public static CrystallicaDefaultBlock BlockErzSaphir;
	public static CrystallicaDefaultBlock BlockErzTopas;
	/**
	 * items erstellen
	 */
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
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//config erstellen oder berarbeiten
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
        //Horse_Armor = config.get("Shaped", "Horse_Armor", true).getBoolean(true);
		config.save();
		
		new loadertap();
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
