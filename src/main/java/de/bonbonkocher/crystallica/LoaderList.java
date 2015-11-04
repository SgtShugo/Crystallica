package de.bonbonkocher.crystallica;

import de.bonbonkocher.crystallica.blocks.ConfigBlockList;
import de.bonbonkocher.crystallica.blocks.RegisterBlockList;
import de.bonbonkocher.crystallica.blocks.CrystallicaDefaultBlock;
import de.bonbonkocher.crystallica.items.ConfigItemList;
import de.bonbonkocher.crystallica.items.RegisterItemList;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class LoaderList
{
	public LoaderList()
	{
		//Blocks
		new ConfigBlockList();
		new RegisterBlockList();
		//Items
		new ConfigItemList();
		new RegisterItemList();
	}
}
