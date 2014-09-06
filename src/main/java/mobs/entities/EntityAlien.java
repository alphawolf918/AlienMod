package alienMod.mobs.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingData;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityAlien extends EntityMob {
	
	/** Random offset used in floating behaviour */
	private final float heightOffset = 0.5F;
	
	/** ticks until heightOffset is randomized */
	private int heightOffsetUpdateTime;
	
	public EntityAlien(World par1World) {
		super(par1World);
		this.setHealth(20F);
		this.setAIMoveSpeed(0.7F);
		this.setSize(0.5F, 0.9F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIBreakDoor(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this,
				EntityPlayer.class, this.getAIMoveSpeed(), false));
		this.tasks.addTask(3, new EntityAIWatchClosest(this,
				EntityPlayer.class, 8.0F));
		this.tasks.addTask(4, new EntityAIWander(this, this.getAIMoveSpeed()));
		this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, this
				.getAIMoveSpeed(), false));
		this.tasks.addTask(6, new EntityAIMoveIndoors(this));
		this.tasks.addTask(7, new EntityAIRestrictOpenDoor(this));
		this.tasks.addTask(8, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(9, new EntityAIMoveTowardsRestriction(this, 0.8D));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this,
				EntityPlayer.class, 0, true));
		this.getNavigator().setAvoidsWater(true);
		this.getNavigator().setBreakDoors(true);
		this.scoreValue = 70;
		this.experienceValue = 80;
		this.stepHeight = 1F;
		this.addRandomArmor();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender(float par1)
	{
		return 15728890;
	}
	
	/**
	 * Gets how bright this entity is.
	 */
	@Override
	public float getBrightness(float par1)
	{
		return 4.0F;
	}
	
	/**
	 * Takes in the distance the entity has fallen this tick and whether its on
	 * the ground to update the fall distance and deal fall damage if landing on
	 * the ground. Args: distanceFallenThisTick, onGround
	 */
	@Override
	protected void updateFallState(double par1, boolean par3) {
	}
	
	/**
	 * Return whether this entity should NOT trigger a pressure plate or a
	 * tripwire.
	 */
	@Override
	public boolean doesEntityNotTriggerPressurePlate()
	{
		return true;
	}
	
	/**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they
	 * walk on. used for spiders and wolves to prevent them from trampling crops
	 */
	@Override
	protected boolean canTriggerWalking()
	{
		return false;
	}
	
	/**
	 * Called when the mob is falling. Calculates and applies fall damage.
	 */
	@Override
	protected void fall(float par1) {
	}
	
	@Override
	public boolean canBePushed()
	{
		return false;
	}
	
	@Override
	public boolean canPickUpLoot() {
		return true;
	}
	
	@Override
	public boolean isChild() {
		return true;
	}
	
	@Override
	protected String getLivingSound() {
		return "starbeings:mob.alien.say";
	}
	
	@Override
	protected String getHurtSound() {
		return "starbeings:mob.alien.hurt";
	}
	
	@Override
	protected float getSoundVolume() {
		return 0.2F;
	}
	
	@Override
	protected String getDeathSound() {
		return null;
	}
	
	@Override
	protected void playStepSound(int par1, int par2, int par3, int par4) {
		this.worldObj.playSoundAtEntity(this, "mob.zombie.step", 0.15F, 1.0F);
	}
	
	@Override
	protected boolean isAIEnabled() {
		return true;
	}
	
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}
	
	public int getAttackStrength(Entity par1Entity) {
		return 10;
	}
	
	/**
	 * Makes entity wear random armor based on difficulty
	 */
	@Override
	protected void addRandomArmor()
	{
		super.addRandomArmor();
		
		if (this.rand.nextFloat() < (this.worldObj.difficultySetting == 3 ? 0.05F
				: 0.01F))
		{
			int i = this.rand.nextInt(3);
			
			if (i == 0)
			{
				this.setCurrentItemOrArmor(0, new ItemStack(Item.swordIron));
			}
			else
			{
				this.setCurrentItemOrArmor(0, new ItemStack(Item.pickaxeIron));
			}
		}
	}
	
	@Override
	public EntityLivingData onSpawnWithEgg(EntityLivingData par1EntityLivingData) {
		super.onSpawnWithEgg(par1EntityLivingData);
		this.addRandomArmor();
		this.enchantEquipment();
		return par1EntityLivingData;
	}
	
	@Override
	public int getTotalArmorValue()
	{
		int i = super.getTotalArmorValue() + 2;
		if (i > 20)
		{
			i = 20;
		}
		return i;
	}
}