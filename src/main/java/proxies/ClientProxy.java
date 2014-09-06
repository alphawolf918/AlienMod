package alienMod.proxies;

import net.minecraftforge.common.MinecraftForge;
import alienMod.managers.SoundManager;
import alienMod.mobs.entities.EntityAlien;
import alienMod.mobs.entities.EntityMootant;
import alienMod.mobs.models.ModelAlien;
import alienMod.mobs.models.ModelMootant;
import alienMod.mobs.renderers.RenderAlien;
import alienMod.mobs.renderers.RenderMootant;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void initRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(
				EntityAlien.class, new RenderAlien(
						new ModelAlien(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(
				EntityMootant.class, new RenderMootant(
						new ModelMootant(), 0.5F));
	}
	
	@Override
	public void initSounds() {
		MinecraftForge.EVENT_BUS.register(new SoundManager());
	}
}