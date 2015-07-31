package giftcardinformation;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class Message {

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
}
