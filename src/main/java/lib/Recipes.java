package alienMod.lib;

import net.minecraft.item.ItemStack;
import alienMod.blocks.Blocks;
import alienMod.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void init() {
		CraftingRecipes.init();
		SmeltingRecipes.init();
	}
	
	static class CraftingRecipes {
		public static void init() {
			GameRegistry.addRecipe(new ItemStack(Blocks.viriBlock,
					1), new Object[] {
					"CCC", "CCC", "CCC", 'C', Items.ingotViri
			});
		}
	}
	
	static class SmeltingRecipes {
		public static void init() {
			int input = Items.viriRaw.itemID;
			ItemStack output = new ItemStack(Items.ingotViri, 1);
			float xp = 0.5F;
			GameRegistry.addSmelting(input, output, xp);
		}
	}
}