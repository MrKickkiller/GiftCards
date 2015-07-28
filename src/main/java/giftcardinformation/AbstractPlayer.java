package giftcardinformation;

import java.util.UUID;

/**
 * Created by MrKickkiller on 28/07/2015.
 */
abstract class AbstractPlayer {
    private UUID player;

    protected boolean canEditMessage;

    public AbstractPlayer(UUID player) {
        if (player != null) {
            this.player = player;
        }
    }
}
