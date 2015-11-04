package de.bonbonkocher.crystallica.blocks;

import de.bonbonkocher.crystallica.Crystallica;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class CrystallicaDefaultBlock extends Block
{
	public CrystallicaDefaultBlock(Material material, String unlocalizedName, float hardness, float resistance, float lightLevel, String tool, int harvestLevel)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(lightLevel);
		this.setHarvestLevel(tool, harvestLevel);
		this.setCreativeTab(Crystallica.crystallicataps);
	}
	
	public void registerTexture()
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(this), 0, new ModelResourceLocation(Crystallica.MODID + ":" + this.getUnlocalizedName().substring(5)));
	}
}
