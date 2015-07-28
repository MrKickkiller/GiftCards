package giftcardinformation;

import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class Sender extends AbstractPlayer {

    public Sender(EntityPlayer player) {
        super(player.getPersistentID());
        this.canEditMessage = true;
    }
}
