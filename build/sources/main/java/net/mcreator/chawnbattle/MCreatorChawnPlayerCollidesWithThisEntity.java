package net.mcreator.chawnbattle;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import java.util.HashMap;

@Elementschawnbattle.ModElement.Tag
public class MCreatorChawnPlayerCollidesWithThisEntity extends Elementschawnbattle.ModElement {
	public MCreatorChawnPlayerCollidesWithThisEntity(Elementschawnbattle instance) {
		super(instance, 1);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("MUHAHAHAH"));
		}
	}
}
