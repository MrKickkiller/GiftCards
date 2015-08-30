package utils;

import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by AEnterprise
 */
public interface INBTSavable {

	void writeToNBT(NBTTagCompound tag);

	void loadFromNBT(NBTTagCompound tag);
}
