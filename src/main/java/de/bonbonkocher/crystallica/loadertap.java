package de.bonbonkocher.crystallica;

import de.bonbonkocher.crystallica.blocks.RegisterBlockList;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class loadertap
{
	public loadertap()
	{
		Crystallica.crystallicataps = new CreativeTabs("crystallicataps")
		{
			@Override
			public Item getTabIconItem() 
			{
				return Item.getItemFromBlock(RegisterBlockList.BlockErzRubin);
			}
		};
	}
}
