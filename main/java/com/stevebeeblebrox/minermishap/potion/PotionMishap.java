package com.stevebeeblebrox.minermishap.potion;

import com.stevebeeblebrox.minermishap.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionMishap extends Potion
{
	public PotionMishap()
	{
		super(false, 1280);
		setPotionName("effect.mishap");
		setIconIndex(0, 0);
		setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + "mishap"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/mishap.png"));
		return true;
	} 
}
