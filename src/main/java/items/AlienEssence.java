package alienMod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import alienMod.creativetabs.ModTabs;
import alienMod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/*
 * Alien Essence
 */

public class AlienEssence extends Item {
	public AlienEssence(int id) {
		super(id);
		this.setCreativeTab(ModTabs.mfTab);
		this.setUnlocalizedName("alienessence");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "alienessence");
	}
}