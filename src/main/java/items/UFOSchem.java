package alienMod.items;

import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import alienMod.creativetabs.ModTabs;
import alienMod.lib.ModInfo;
import alienMod.structures.WorldGenUFO;
import alienMod.structures.WorldGenUFO2;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/*
 * Alien Stone
 */

public class UFOSchem extends Item {
	public UFOSchem(int id) {
		super(id);
		this.setCreativeTab(ModTabs.mfTab);
		this.setUnlocalizedName("ufoschematic");
	}
	
	@Override
	public boolean onItemUse(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, World par3World, int par4, int par5,
			int par6, int par7, float par8, float par9, float par10) {
		int direction = MathHelper
				.floor_double(par2EntityPlayer.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
		int randInt = (new Random()).nextInt(10);
		WorldGenerator ufoGen = (randInt <= 5) ? new WorldGenUFO()
				: new WorldGenUFO2();
		if (!par3World.isRemote) {
			int genX = (int) par2EntityPlayer.posX;
			int genY = (int) par2EntityPlayer.posY + 20;
			int genZ = (int) par2EntityPlayer.posZ;
			Random rand = new Random();
			(ufoGen).generate(par3World, rand, genX, genY, genZ);
			return true;
		}
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "ufoschematic");
	}
}