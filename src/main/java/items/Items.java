package alienMod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import alienMod.blocks.Blocks;
import alienMod.creativetabs.ModTabs;
import alienMod.lib.Ids;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	public static Item ufoSchem = new UFOSchem(Ids.ufoSchemID);
	public static Item ingotViri = new ViriIngot(Ids.viriIngotID);
	public static Item viriRaw = new RawViri(Ids.rawViriID);
	public static Item alienEssence = new AlienEssence(Ids.alienEssenceID);
	public static Item alienStone = new AlienStone(Ids.alienStoneID);
	public static Item rawAlienBeef = new AlienBeefRaw(Ids.alienBeefRawID);
	public static Item cookedAlienBeef = new AlienBeefCooked(
			Ids.alienBeefCookedID);
	public static Item bucketSpaceMilk = new ItemBucket(Ids.bucketSpaceMilkID,
			Blocks.BlockSpaceMilk.blockID).setCreativeTab(ModTabs.mfTab)
			.setUnlocalizedName("spacemilkbucket").setContainerItem(
					Item.bucketEmpty)
			.setTextureName("starbeings:spacemilkbucket");
	
	public static void init() {
		addNames(ufoSchem, "UFO Schematic [Creative Only]");
		addNames(ingotViri, "Virinium Ingot");
		addNames(viriRaw, "Raw Virinium");
		addNames(alienEssence, "Alien Essence");
		addNames(alienStone, "Alien Stone");
		addNames(rawAlienBeef, "Raw Alien Beef");
		addNames(cookedAlienBeef, "Cooked Alien Beef");
		addNames(bucketSpaceMilk, "Bucket of Space Milk");
	}
	
	public static void addNames(Item item, String name) {
		LanguageRegistry.addName(item, name);
	}
}