package alienMod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import alienMod.creativetabs.ModTabs;
import alienMod.items.Items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockViriOre extends Block {
	public BlockViriOre(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(ModTabs.mfTab);
		this.setUnlocalizedName("viriniumore");
		this.setHardness(5F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundStoneFootstep);
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z,
			int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 25);
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return Items.viriRaw.itemID;
	}
	
	@Override
	public int quantityDropped(Random par1Rand) {
		return par1Rand.nextInt(2);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("starbeings:viriore");
	}
}