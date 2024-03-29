package alienMod.blocks.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSpaceMilk extends BlockFluidClassic {
	
	public BlockSpaceMilk(int id, Fluid fluid) {
		super(id, fluid, Material.water);
		this.setCreativeTab((CreativeTabs) null);
		this.setUnlocalizedName("spacemilkblock");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("starbeings:spacemilk");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return this.blockIcon;
	}
	
	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z)
	{
		return 0x668b22;
	}
}