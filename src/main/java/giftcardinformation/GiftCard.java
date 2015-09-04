package giftcardinformation;

import net.minecraft.nbt.NBTTagCompound;
import utils.INBTSavable;

/**
 * Created by AEnterprise
 *
 */
public class GiftCard implements INBTSavable {
	public Message message = new Message("");
	public Sender sender = new Sender();
	public Receiver receiver = new Receiver();

	public void writeToNBT(NBTTagCompound tag) {
		NBTTagCompound subtag = new NBTTagCompound();
		message.writeToNBT(subtag);
		sender.writeToNBT(subtag);
		receiver.writeToNBT(subtag);
		tag.setTag("giftcardTag", subtag);
	}

	public void loadFromNBT(NBTTagCompound tag) {
		if (tag.hasKey("giftcardTag")) {
			NBTTagCompound subtag = tag.getCompoundTag("giftcardTag");
			message.loadFromNBT(subtag);
			sender.loadFromNBT(subtag);
			receiver.loadFromNBT(subtag);
		}
	}
}
