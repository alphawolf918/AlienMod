package alienMod.mobs.renderers;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import alienMod.mobs.entities.EntityMootant;
import alienMod.mobs.models.ModelMootant;

public class RenderMootant extends RenderLiving {
	public ModelMootant model;
	
	public RenderMootant(ModelMootant modelMootant, float par2) {
		super(modelMootant, par2);
		model = (ModelMootant) mainModel;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("starbeings:textures/entity/aliencow.png");
	}
	
	public void renderTutorial(EntityMootant entity, double par2, double par4,
			double par6, float par8, float par9) {
		super.doRenderLiving(entity, par2, par4, par6, par8, par9);
	}
	
	@Override
	public void doRenderLiving(EntityLiving par1EntityLiving, double par2,
			double par4, double par6, float par8, float par9) {
		renderTutorial((EntityMootant) par1EntityLiving, par2, par4, par6,
				par8,
				par9);
	}
	
	@Override
	public void doRender(Entity par1Entity, double par2, double par4,
			double par6, float par8, float par9) {
		renderTutorial((EntityMootant) par1Entity, par2, par4, par6, par8,
				par9);
	}
}