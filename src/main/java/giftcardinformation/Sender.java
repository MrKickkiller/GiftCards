package giftcardinformation;

import net.minecraft.world.World;

/**
 * Created by MrKickkiller on 28/07/2015.
 * Player that sends the giftcard.
 * Can edit all fields of a GiftCard
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
