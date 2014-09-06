package alienMod.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import alienMod.mobs.entities.EntityAlien;
import alienMod.mobs.entities.EntityMootant;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Mobs {
	
	private static int startEntityId = 300;
	
	public static void init() {
		// Gray Alien
		EntityRegistry
				.registerGlobalEntityID(EntityAlien.class, "grayalien", 100);
		LanguageRegistry.instance().addStringLocalization(
				"entity.grayalien.name", "Gray Alien");
		registerEntityEgg(EntityAlien.class, 0xffffff, 0x000000);
		
		// Alien Cow
		EntityRegistry.registerGlobalEntityID(EntityMootant.class, "aliencow",
				2);
		LanguageRegistry.instance().addStringLocalization(
				"entity.aliencow.name", "Mootant");
		registerEntityEgg(EntityMootant.class, 0x00ff00, 0x008b00);
	}
	
	public static void registerEntityEgg(Class<? extends Entity> entity,
			int primaryColor, int secondaryColor) {
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor,
				secondaryColor));
	}
	
	public static int getUniqueEntityId() {
		do {
			startEntityId++;
		} while (EntityList.getStringFromID(startEntityId) != null);
		return startEntityId;
	}
}