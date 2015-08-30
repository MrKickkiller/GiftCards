package giftcardinformation;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import utils.INBTSavable;

import java.util.UUID;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class Receiver extends AbstractPlayer {

	public Receiver() {
		this.canEditMessage = false;
	}

	@Override
	public void set(String player, World world) {
		super.set(player, world);
	}

	@Override
	protected String getSubtagName() {
		return "receiverTag";
	}
}
