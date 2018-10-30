package com.otiswolf.tutorialmod.items.tools;

import com.otiswolf.tutorialmod.Main;
import com.otiswolf.tutorialmod.init.ModItems;
import com.otiswolf.tutorialmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{
	
	
	public ToolSword(String name, ToolMaterial material) {
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
	


}
