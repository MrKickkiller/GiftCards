package giftcardinformation;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class GiftCard {

    private Message message;

    private Sender sender;
    private Receiver receiver;

    public GiftCard() {

    }

    public Message getMessage() {
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
}
