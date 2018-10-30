package com.otiswolf.tutorialmod.items;

import com.otiswolf.tutorialmod.Main;
import com.otiswolf.tutorialmod.init.ModItems;
import com.otiswolf.tutorialmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	//represents all base items to be modded
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS); //sets the creative mode tab the item will appear under
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	

}
