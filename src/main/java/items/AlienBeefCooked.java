package alienMod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import alienMod.creativetabs.ModTabs;
import alienMod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/*
 * Alien Beef (Cooked)
 */

public class AlienBeefCooked extends ItemFood {
	public AlienBeefCooked(int id) {
		super(id, 4, 4, false);
		this.setCreativeTab(ModTabs.mfTab);
		this.setUnlocalizedName("cookedalienbeef");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "alienbeefcooked");
	}
}