package giftcardinformation;

import net.minecraft.world.World;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class Sender extends AbstractPlayer {

    public Sender(String player,World world) {
        super(player,world);
        this.canEditMessage = true;
    }



}
