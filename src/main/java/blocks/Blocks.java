package alienMod.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.oredict.OreDictionary;
import alienMod.blocks.fluids.BlockSpaceMilk;
import alienMod.blocks.fluids.FluidSpaceMilk;
import alienMod.lib.Ids;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
	public static Fluid spaceMilk = new FluidSpaceMilk("SpaceMilk");
	public static Block BlockSpaceMilk = new BlockSpaceMilk(
			Ids.blockSpaceMilkID, spaceMilk);
	
	public static final Block viriBlock = new BlockVirinium(Ids.blockViriID);
	public static final Block viriOre = new BlockViriOre(Ids.blockViriOreID);
	
	public static void init() {
		addNames(viriBlock, "Virinium Block");
		addNames(viriOre, "Virinium Ore");
		
		OreDictionary.registerOre("Virinium Ore", viriOre);
	}
	
	public static void addNames(Block block, String name) {
		GameRegistry.registerBlock(block, name);
		LanguageRegistry.addName(block, name);
	}
}