package giftcardinformation;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class TileEntityGiftCard extends TileEntity {
	private GiftCard card = new GiftCard();


	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		card.loadFromNBT(tag);
	}

	@Override
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		card.writeToNBT(tag);
	}

	public void loadCardFromNBT(NBTTagCompound tag) {
		card.loadFromNBT(tag);
	}

	public void saveCardToNBT(NBTTagCompound tag) {
		card.writeToNBT(tag);
	}

	/*@Override
	public String toString() {
		return "{"+ sender.getPlayer() + ";" +  message.getMessage() + receiver.getPlayer() + "}";
	}*/
}
