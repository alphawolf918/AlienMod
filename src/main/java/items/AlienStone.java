package alienMod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import alienMod.creativetabs.ModTabs;
import alienMod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/*
 * Alien Stone
 */

public class AlienStone extends Item {
	public AlienStone(int id) {
		super(id);
		this.setCreativeTab(ModTabs.mfTab);
		this.setUnlocalizedName("alienstone");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "alienstone");
	}
}