package GiftCards.gui.guihandler;

import GiftCards.container.ContainerGiftCard;
import GiftCards.giftcardinformation.TileEntityGiftCard;
import GiftCards.gui.GuiGiftCard;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Mathieu on 7/09/2015.
 */
public class GiftCardGuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TileEntityGiftCard) {
            return new GuiGiftCard(new ContainerGiftCard(tileEntity));
        }
        return null;
    }
}
