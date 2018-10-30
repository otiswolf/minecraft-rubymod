package com.otiswolf.tutorialmod.items.tools;

import com.otiswolf.tutorialmod.items.ItemBase;
import com.otiswolf.tutorialmod.util.IHasModel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ToolFireStaff extends ItemBase implements IHasModel{

	public ToolFireStaff(String name) {
		super(name);
		
	}
	
	//Used when right clicking the item in the air
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		//get the item being held
		ItemStack item = playerIn.getHeldItem(handIn);
		
		//get vector of where player is looking
		Vec3d aim = playerIn.getLookVec();
		
		//get item to be fired
		EntityLargeFireball fireball = new EntityLargeFireball(worldIn, playerIn, 1, 1, 1);
		
		//declare what happens to the entity
		//set position of fireball
		fireball.setPosition(playerIn.posX + aim.x * 1.5D, playerIn.posY + aim.y * 1.5D, playerIn.posZ + aim.z * 1.5D);
		//set acceleration of fireball
		fireball.accelerationX = aim.x + 0.1;
		fireball.accelerationY = aim.y + 0.1;
		fireball.accelerationZ = aim.z + 0.1;
		
		//spawn entity in the world
		worldIn.spawnEntity(fireball);
		
		//damage the staff after usage
		item.damageItem(1, playerIn);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}

}
