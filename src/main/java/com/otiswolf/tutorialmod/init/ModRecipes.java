package com.otiswolf.tutorialmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/*
 * Adds smelting recipes to the game
 * 
 * Crafting recipes are in resources.assets.tm.recipes
 */
public class ModRecipes {
	
	public static void init() {
		
		//adds smelting recipe: input, output (object and count) and exp gained
		GameRegistry.addSmelting(ModItems.RUBY, new ItemStack(ModBlocks.RUBY_BLOCK, 1), 1.5F);
		GameRegistry.addSmelting(ModBlocks.RUBY_BLOCK, new ItemStack(Blocks.DIAMOND_BLOCK, 2), 1.5F);
	}

}
