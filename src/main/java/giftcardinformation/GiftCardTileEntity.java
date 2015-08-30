package giftcardinformation;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class GiftCardTileEntity extends TileEntity {

    private GiftCard card;

    public GiftCardTileEntity() {

    }

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
	}

	@Override
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
	}

	//    @Override
//    public String toString() {
//        return "{"+ sender.getPlayer() + ";" +  message.getMessage() + receiver.getPlayer() + "}";
//    }
}
