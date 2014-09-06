package alienMod.materials;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.MaterialLiquid;

public class MaterialSpaceMilk extends MaterialLiquid {
	
	public MaterialSpaceMilk(MapColor par1MapColor) {
		super(par1MapColor);
		this.setNoPushMobility();
	}
	
	@Override
	public boolean isLiquid() {
		return true;
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}
}