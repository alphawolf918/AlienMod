package alienMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import alienMod.creativetabs.ModTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockVirinium extends Block {
	public BlockVirinium(int par1) {
		super(par1, Material.iron);
		this.setCreativeTab(ModTabs.mfTab);
		this.setUnlocalizedName("viriniumblock");
		this.setHardness(5F);
		this.setResistance(10.0F);
		this.setLightValue(0.6F);
		this.setStepSound(Block.soundMetalFootstep);
		this.setLightOpacity(0);
	}
	
	@Override
	public void onEntityWalking(World par1World, int par2, int par3, int par4,
			Entity par5Entity) {
		par1World.spawnParticle("smoke", par5Entity.posX, par5Entity.posY + 0.5D, par5Entity.posZ, 0.0D, 0.0D, 0.0D);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("starbeings:viriblock");
	}
}