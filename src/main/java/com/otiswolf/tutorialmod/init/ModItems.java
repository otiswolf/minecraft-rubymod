package com.otiswolf.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.otiswolf.tutorialmod.items.ItemBase;
import com.otiswolf.tutorialmod.items.tools.ToolAxe;
import com.otiswolf.tutorialmod.items.tools.ToolFireStaff;
import com.otiswolf.tutorialmod.items.tools.ToolHoe;
import com.otiswolf.tutorialmod.items.tools.ToolPickaxe;
import com.otiswolf.tutorialmod.items.tools.ToolPickaxeAxe;
import com.otiswolf.tutorialmod.items.tools.ToolSpade;
import com.otiswolf.tutorialmod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

/*
 * Add new Items here
 * 
 * also be sure to:
 * 
 * --add item to en_us.lang in resources.assets.tm.lang
 * 
 * --add new json file to resources.assets.tm.models.item
 * 
 * --add new png file to resources.assets.tm.textures.items
 * 
 */
public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	//MATERIALS                                                                  name, harvestLevel, maxUses, efficiency, damage, enchantability
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 250, 8.0f, 3.0f, 10);
	
	//ITEMS
	public static final Item RUBY = new ItemBase("ruby");

	//TOOLS                                                                material of tool
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXEAXE = new ToolPickaxeAxe("ruby_pickaxeaxe", MATERIAL_RUBY);
	public static final Item RUBY_FIRESTAFF = new ToolFireStaff("ruby_firestaff");
}
