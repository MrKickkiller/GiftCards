package giftcardinformation;

import net.minecraft.world.World;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class Sender extends AbstractPlayer {

	public Sender() {
		this.canEditMessage = true;
	}

	@Override
	public void set(String player, World world) {
		super.set(player, world);
	}

	@Override
	protected String getSubtagName() {
		return "senderTag";
	}


}
