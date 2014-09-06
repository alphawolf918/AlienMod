package alienMod.proxies;

import alienMod.AlienMod;

public class Proxies {
	public static void init() {
		AlienMod.proxy.initRenderers();
		AlienMod.proxy.initSounds();
	}
}