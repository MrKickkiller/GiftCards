package giftcardinformation;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import utils.INBTSavable;

import java.util.UUID;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class Receiver extends AbstractPlayer {

	public Receiver(String player,World world) {
		super(player,world);
		this.canEditMessage = false;
	}

	@Override
	protected String getSubtagName() {
		return "receiverTag";
	}
}
