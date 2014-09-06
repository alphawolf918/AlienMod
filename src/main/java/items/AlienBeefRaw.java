package alienMod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import alienMod.creativetabs.ModTabs;
import alienMod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/*
 * Alien Beef (Raw)
 */

public class AlienBeefRaw extends ItemFood {
	public AlienBeefRaw(int id) {
		super(id, 2, 1, false);
		this.setCreativeTab(ModTabs.mfTab);
		this.setUnlocalizedName("alienbeefraw");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "alienbeefraw");
	}
}