package com.otiswolf.tutorialmod.blocks;

import java.util.Random;

import com.otiswolf.tutorialmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase{
	
	public RubyOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
	}
	
	//change type of item dropped when broken
	//(Ruby instead of ruby ore)
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.RUBY; //Use ITEMS.xxx to drop vanilla item
	}
	
	//set number of items to be dropped when broken
	@Override
	public int quantityDropped(Random rand) {
		int max = 4;
		int min = 1;
		return rand.nextInt(max) + min;
	}

}
