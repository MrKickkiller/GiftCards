package GiftCards.giftcardinformation;

import GiftCards.utils.INBTSavable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.UUID;

/**
 * Created by MrKickkiller on 28/07/2015.
 * Upper class that represents any Player.
 */
public abstract class AbstractPlayer implements INBTSavable {
    protected boolean canEditMessage;
	private UUID player;

	/*
	* Get the player from a simple string.
	* Will be used to identify the player you wanna send something to.
	 */
	public static EntityPlayer resolvePlayerFromString(World world, String playerName) {
		return world.getPlayerEntityByName(playerName);
	}

    public void set(String player, World world) {
        if (player != null) {
            EntityPlayer entityPlayer = AbstractPlayer.resolvePlayerFromString(world,player);
            if (entityPlayer != null){
                this.player = entityPlayer.getPersistentID();
            }
        }
    }

    public UUID getPlayer() {
        return player;
    }

	@Override
	public void writeToNBT(NBTTagCompound tag) {
		if (player == null)
			return;
		NBTTagCompound subtag = new NBTTagCompound();
		subtag.setLong("UUID-most", player.getMostSignificantBits());
		subtag.setLong("UUID-least", player.getLeastSignificantBits());
		subtag.setBoolean("canEdit", canEditMessage);
		tag.setTag(getSubtagName(), subtag);

	}

	@Override
	public void loadFromNBT(NBTTagCompound tag) {
		if (tag.hasKey(getSubtagName())) {
			NBTTagCompound subtag = tag.getCompoundTag(getSubtagName());
			player = new UUID(subtag.getLong("UUID-most"), subtag.getLong("UUID-least"));
			canEditMessage = subtag.getBoolean("canEdit");
		}
	}

	protected abstract String getSubtagName();
}
