package giftcardinformation;

import net.minecraft.tileentity.TileEntity;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class GiftCard extends TileEntity {

    private Message message;

    private Sender sender;
    private Receiver receiver;

    public GiftCard() {

    }

    public Message getMessage() {
        if (message == null){
            return new Message("");
        }
        return message;
    }

    public void setMessage(Message message) {
        if (message != null && message.getLength() > 0) {
            this.message = message;
        }
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        if (sender != null) {
            this.sender = sender;
        }
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        if (receiver != null) {
            this.receiver = receiver;
        }
    }

    public boolean hasNulls(){
        return message == null || sender == null || receiver == null;
    }


//    @Override
//    public String toString() {
//        return "{"+ sender.getPlayer() + ";" +  message.getMessage() + receiver.getPlayer() + "}";
//    }
}
