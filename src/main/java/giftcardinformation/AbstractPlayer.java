package giftcardinformation;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.UUID;

/**
 * Created by MrKickkiller on 28/07/2015.
 */
public abstract class AbstractPlayer {
    private UUID player;

    protected boolean canEditMessage;

    public AbstractPlayer(UUID player) {
        if (player != null) {
            this.player = player;
        }
    }

    public static EntityPlayer resolvePlayerFromString(World world,String playerName){
        return world.getPlayerEntityByName(playerName);
    }
}
