package giftcardinformation;

import net.minecraft.world.World;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class Receiver extends AbstractPlayer {

    public Receiver(String player,World world) {
        super(player,world);
        this.canEditMessage = false;
    }
}
