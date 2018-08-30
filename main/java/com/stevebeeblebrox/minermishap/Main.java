package com.stevebeeblebrox.minermishap;

import com.stevebeeblebrox.minermishap.potion.PotionMishap;
import com.stevebeeblebrox.minermishap.proxy.CommonProxy;
import com.stevebeeblebrox.minermishap.util.Reference;

import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod(modid = Reference.MOD_ID, name =  Reference.NAME, version = Reference.VERSION)
public class Main
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final Potion MISHAP_POTION = new PotionMishap();
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		ForgeRegistries.POTIONS.register(MISHAP_POTION);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
}
