package me.thepocketmob.hunter.custom;

import net.minecraft.client.Minecraft;

public class MakePlayerChat {
	
	public Minecraft mc = Minecraft.getMinecraft();
	// By HazedCrystals (ThePocketMob) - Creator Of Hunter Client
	// No credits required, but credits are appreciated.
	// This is my first released script, so it isnt really that good.
	// Message = The message they should say,
	// Times = how many times they should say it.
	
	public void MakePlayerTalk(String message, int times) {
		int i;
        for (i = 0; i < times; i++)
            mc.thePlayer.sendChatMessage(message);
	}
}

