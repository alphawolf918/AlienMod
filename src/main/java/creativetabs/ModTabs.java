package alienMod.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModTabs {
	public static CreativeTabs mfTab = new SBTab(
			CreativeTabs.getNextID(),
			"starbeings");
	
	public static void init() {
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup." + "starbeings", "en_US", "Star Beings");
	}
}