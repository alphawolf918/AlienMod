package alienMod.blocks.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import alienMod.lib.Ids;

public class FluidSpaceMilk extends Fluid {
	
	public FluidSpaceMilk(String fluidName) {
		super(fluidName);
		this.setDensity(80);
		this.setViscosity(1500);
		this.setBlockID(Ids.blockSpaceMilkID);
		this.setLuminosity(20);
		this.setUnlocalizedName("spacemilk");
		this.setGaseous(true);
		this.setTemperature(300);
		FluidRegistry.registerFluid(this);
	}
}