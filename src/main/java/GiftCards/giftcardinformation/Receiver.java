package GiftCards.giftcardinformation;

import net.minecraft.world.World;

/**
 * Created by Mathieu on 28/07/2015.
 * Player that receives the giftcard.
 * Will have special abilities concerning a GiftCard.
 *
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
