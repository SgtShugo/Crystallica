package de.bonbonkocher.crystallica;

import de.bonbonkocher.crystallica.blocks.ConfigBlockList;
import de.bonbonkocher.crystallica.blocks.RegisterBlockList;
import de.bonbonkocher.crystallica.items.ConfigItemList;
import de.bonbonkocher.crystallica.items.RegisterItemList;
import de.bonbonkocher.crystallica.world.RegisterWorldList;

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
		//Welt
		new RegisterWorldList();
	}
}
