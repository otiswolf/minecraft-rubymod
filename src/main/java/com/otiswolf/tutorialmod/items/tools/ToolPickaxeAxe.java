package com.otiswolf.tutorialmod.items.tools;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.otiswolf.tutorialmod.Main;
import com.otiswolf.tutorialmod.init.ModItems;
import com.otiswolf.tutorialmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

/*
 * Custom multi tool: combination of pickaxe and axe
 * 
 * should extend one of the base items (the one that breaks the most blocks)
 * e.g. ItemPickaxe
 * 
 */

public class ToolPickaxeAxe extends ItemPickaxe implements IHasModel{
	
	//variable tells class what other blocks can be broken (taken from ItemAxe class)
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);


	public ToolPickaxeAxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS); //sets the creative mode tab the item will appear under
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	/*
	 * The following three methods must be overwritten for mulittools
	 */
	
	//return immutable set of the tools you are combining
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("pickaxe", "axe");
	}
	
	//checks if EFFECTIVE_ON contains the block or if extended tool can harvest the block
	@Override 
	public boolean canHarvestBlock(IBlockState block) {
		return EFFECTIVE_ON.contains(block.getBlock()) ? true : super.canHarvestBlock(block);
	}
	
	//checks if EFFECTIVE_ON contains the block 
	//since other item is axe, must check if material is wood, plants, or vines
	@Override
	public float getDestroySpeed(ItemStack stack, IBlockState state) {
		Material material = state.getMaterial();
		if (material == Material.WOOD && material == Material.PLANTS && material == Material.VINE) {
			return this.efficiency;
		}
		return EFFECTIVE_ON.contains(state.getBlock()) ? this.efficiency : super.getDestroySpeed(stack, state);
	}
	
	
}
