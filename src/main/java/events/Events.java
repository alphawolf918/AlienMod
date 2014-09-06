package alienMod.events;

import net.minecraftforge.common.MinecraftForge;

public class Events {
	public static void init() {
		MinecraftForge.EVENT_BUS.register(new SBEvents());
	}
}