package alienMod.events;

import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import alienMod.blocks.Blocks;
import alienMod.items.Items;

public class SBEvents {
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void FillBucket(FillBucketEvent event) {
		ItemStack result = attemptFill(event.world, event.target);
		if (result != null) {
			event.result = result;
			event.setResult(Result.ALLOW);
		}
	}
	
	private ItemStack attemptFill(World world, MovingObjectPosition p)
	{
		int id = world.getBlockId(p.blockX, p.blockY, p.blockZ);
		
		if (id == Blocks.BlockSpaceMilk.blockID)
		{
			if (world.getBlockMetadata(p.blockX, p.blockY, p.blockZ) == 0) // Check
																			// that
																			// it
																			// is
																			// a
																			// source
																			// block
			{
				world.setBlock(p.blockX, p.blockY, p.blockZ, 0); // Remove the
																	// fluid
																	// block
				
				return new ItemStack(Items.bucketSpaceMilk); // Return the
																// filled bucket
																// item here.
			}
		}
		return null;
	}
}