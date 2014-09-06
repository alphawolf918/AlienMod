package alienMod.blocks;

import net.minecraft.block.StepSound;

public class SoundStep extends StepSound
{
	public final String stepSoundName;
	public final float stepSoundVolume;
	public final float stepSoundPitch;
	
	public SoundStep(String par1Str, float par2, float par3)
	{
		super(par1Str, par2, par3);
		this.stepSoundName = par1Str;
		this.stepSoundVolume = par2;
		this.stepSoundPitch = par3;
	}
	
	@Override
	public float getVolume()
	{
		return this.stepSoundVolume;
	}
	
	@Override
	public float getPitch()
	{
		return this.stepSoundPitch;
	}
	
	/**
	 * Used when a block breaks, EXA: Player break, Shep eating grass, etc..
	 */
	@Override
	public String getBreakSound()
	{
		return "starbeings:dig." + this.stepSoundName;
	}
	
	/**
	 * Used when a entity walks over, or otherwise interacts with the block.
	 */
	@Override
	public String getStepSound()
	{
		return "starbeings:step." + this.stepSoundName;
	}
	
	/**
	 * Used when a player places a block.
	 */
	@Override
	public String getPlaceSound()
	{
		return this.getBreakSound();
	}
}
