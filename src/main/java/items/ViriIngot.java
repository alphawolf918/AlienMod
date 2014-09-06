package alienMod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import alienMod.creativetabs.ModTabs;
import alienMod.lib.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ViriIngot extends Item {
	public ViriIngot(int par1) {
		super(par1);
		this.setCreativeTab(ModTabs.mfTab);
		this.setUnlocalizedName("ingotviri");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "viriingot");
	}
}