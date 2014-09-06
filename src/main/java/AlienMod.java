package alienMod;

import alienMod.blocks.Blocks;
import alienMod.creativetabs.ModTabs;
import alienMod.events.Events;
import alienMod.items.Items;
import alienMod.lib.ModInfo;
import alienMod.lib.Recipes;
import alienMod.managers.Managers;
import alienMod.materials.Materials;
import alienMod.mobs.Mobs;
import alienMod.proxies.CommonProxy;
import alienMod.proxies.Proxies;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = { ModInfo.CHANNEL }, clientSideRequired = true,
		serverSideRequired = true)
public class AlienMod {
	
	@SidedProxy(clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy",
			serverSide = ModInfo.PROXY_LOCATION
					+ ".CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModTabs.init();
		Materials.init();
		Blocks.init();
		Items.init();
		Mobs.init();
		Proxies.init();
		Managers.init();
		Recipes.init();
		Events.init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}