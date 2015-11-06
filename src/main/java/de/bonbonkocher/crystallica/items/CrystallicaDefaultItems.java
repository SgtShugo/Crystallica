package de.bonbonkocher.crystallica.items;

import de.bonbonkocher.crystallica.Crystallica;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CrystallicaDefaultItems extends Item
{
	public CrystallicaDefaultItems(String unlocalizedName)
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(Crystallica.crystallicataps);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World worldIn, EntityPlayer player)
	{
		player.setFire(3);
		
		return itemStack;
	}
	
	public void registerTextures()
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0, new ModelResourceLocation(Crystallica.MODID + ":" + this.getUnlocalizedName().substring(5), "inventory"));
	}
}
