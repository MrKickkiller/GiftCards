package giftcardinformation;

import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class Receiver extends AbstractPlayer {

    public Receiver(EntityPlayer player) {
        super(player.getPersistentID());
        this.canEditMessage = false;
    }
}
