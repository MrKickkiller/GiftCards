package GiftCards.giftcardinformation;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by MrKickkiller on 28/07/2015.
 * The TileEntity that stores the data from a GiftCard.
 * Used for carrying over data from block to item form.
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

}
