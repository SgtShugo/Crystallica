package de.bonbonkocher.crystallica.rezepte;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import de.bonbonkocher.crystallica.Crystallica;

public class ShapelessRezept
{
	public ShapelessRezept()
	{
	GameRegistry.addShapelessRecipe(new ItemStack(Crystallica.holzkohleblock, 1), new Object[] {new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1), new ItemStack(Items.coal, 1, 1)});
	}
}
