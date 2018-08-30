package com.stevebeeblebrox.minermishap.potion;

import com.stevebeeblebrox.minermishap.Main;
import com.stevebeeblebrox.minermishap.util.Reference;

import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class MishapEvents
{
	@SubscribeEvent
	public static void onplace(BlockEvent.BreakEvent event)
		{
		if(event.getPlayer().isPotionActive(Main.MISHAP_POTION) && !event.getPlayer().isCreative())
			event.setCanceled(true);
		}
}
