package de.bonbonkocher.crystallica.blocks.erz;

import java.util.Random;

import de.bonbonkocher.crystallica.Crystallica;
import de.bonbonkocher.crystallica.blocks.CrystallicaDefaultBlock;
import de.bonbonkocher.crystallica.items.RegisterItemList;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockErzPyrit extends CrystallicaDefaultBlock {

	public BlockErzPyrit(Material material, String unlocalizedName, float hardness, float resistance, float lightLevel,
			String tool, int harvestLevel, int dropzahl) {
		super(material, unlocalizedName, hardness, resistance, lightLevel, tool, harvestLevel, dropzahl);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getItemDropped(IBlockState blockstate, Random random, int fortune) {
		return RegisterItemList.ItemKristallePyrit;
	}

}
