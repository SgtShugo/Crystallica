package de.bonbonkocher.crystallica.blocks;

import java.util.ArrayList;
import java.util.Random;

import de.bonbonkocher.crystallica.Crystallica;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.IBlockAccess;


public class CrystallicaDefaultBlock extends Block
{	
	public Item drop;
	public int meta;
	public int least_quantity;
	public int most_quantity;
	
	public CrystallicaDefaultBlock(Material material, String unlocalizedName, float hardness, float resistance, 
			float lightLevel, String tool, int harvestLevel, Item itemdrop, int dropzahl, 
			int least_quantity, int most_quantity, IBlockState state, Random rand, int fortune) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(lightLevel);
		this.setHarvestLevel(tool, harvestLevel);
		this.setCreativeTab(Crystallica.crystallicataps);
		this.drop = itemdrop;
		this.meta = dropzahl;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
		this.getItemDropped(state, rand, fortune);
	}

	//Texture
	public void registerTexture()
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(this), 0, new ModelResourceLocation(Crystallica.MODID + ":" + this.getUnlocalizedName().substring(5)));
	}

    public int quantityDropped(Random random)
    {
        return meta;
    }
    
    /*public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return drop;
    }*/
}