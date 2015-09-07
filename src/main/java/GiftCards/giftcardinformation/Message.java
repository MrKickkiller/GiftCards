package GiftCards.giftcardinformation;

import GiftCards.utils.INBTSavable;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by MrKickkiller on 28/07/2015.
 * The message in a GiftCard.
 */
public class Message implements INBTSavable {

    private String message;

    public Message(String message) {
        this.message = message;
    }

    public boolean editMessage(String newMessage){
        if (newMessage != null && newMessage.length() > 0 ){
            message = newMessage;
            return true;
        }
        return false;
    }

    public String getMessage() {
        return message;
    }

    public int getLength(){
        return message.length();
    }

	@Override
	public void writeToNBT(NBTTagCompound tag) {
		NBTTagCompound subtag = new NBTTagCompound();
		subtag.setString("message", message);
		tag.setTag("messageTag", subtag);
	}

	@Override
	public void loadFromNBT(NBTTagCompound tag) {
		if (tag.hasKey("messageTag")) {
			NBTTagCompound subtag = tag.getCompoundTag("messageTag");
			message = subtag.getString("message");
		}
	}
}
