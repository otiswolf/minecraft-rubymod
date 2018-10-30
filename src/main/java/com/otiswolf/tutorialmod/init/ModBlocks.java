package com.otiswolf.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.otiswolf.tutorialmod.blocks.BlockBase;
import com.otiswolf.tutorialmod.blocks.RubyBlock;
import com.otiswolf.tutorialmod.blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/*
 * Add new Blocks here
 * 
 * also be sure to:
 * 
 * --add block to en_us.lang in resources.assets.tm.lang
 * 
 * --add new json files to resources.assets.tm.models.item/block
 *   -- also add json file to resources.assets.tm.blockstates
 * 
 * --add new png file to resources.assets.tm.textures.blocks
 * 
 */
public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	//blocks 
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
}
