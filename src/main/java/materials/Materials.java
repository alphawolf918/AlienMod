package alienMod.materials;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class Materials {
	
	public static Material spaceMilk;
	
	public static void init() {
		spaceMilk = (new MaterialSpaceMilk(
				MapColor.waterColor));
	}
}