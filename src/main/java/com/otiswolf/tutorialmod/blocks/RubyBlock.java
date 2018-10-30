package com.otiswolf.tutorialmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

//Set custom attributes for a specific block 
public class RubyBlock extends BlockBase{

	public RubyBlock(String name, Material material) {
		super(name, material);
		
		//sets sound block makes as player runs over it
		setSoundType(SoundType.METAL);
		
		//sets how long block takes to break
		setHardness(5.0f);
		
		//sets blocks resistance to explosives
		setResistance(15.0f);
		
		//sets tool used to harvest + harvest (material) level
		setHarvestLevel("pickaxe", 2);
		
		//sets how much light is emitted by the block
		setLightLevel(1.0f);
		
		//sets how much light can pass through block
		//setLightOpacity(1);
		
		//makes block unbreakable;
		//setBlockUnbreakable();
	}

}
