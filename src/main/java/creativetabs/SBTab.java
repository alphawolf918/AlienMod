package alienMod.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import alienMod.items.Items;

public class SBTab extends CreativeTabs {
	
	public SBTab(int par1, String par2Str) {
		super(par1, par2Str);
	}
	
	@Override
	public int getTabIconItemIndex() {
		return Items.ufoSchem.itemID;
	}
}