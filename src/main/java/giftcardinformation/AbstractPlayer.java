package giftcardinformation;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import utils.INBTSavable;

import java.util.UUID;

/**
 * Created by MrKickkiller on 28/07/2015.
 */
public abstract class AbstractPlayer implements INBTSavable {
    private UUID player;
    protected boolean canEditMessage;

    public void set(String player, World world) {
        if (player != null) {
            EntityPlayer entityPlayer = AbstractPlayer.resolvePlayerFromString(world,player);
            if (entityPlayer != null){
                this.player = entityPlayer.getPersistentID();
            }
        }
    }

    public static EntityPlayer resolvePlayerFromString(World world,String playerName){
        return world.getPlayerEntityByName(playerName);
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
