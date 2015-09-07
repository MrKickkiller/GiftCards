package GiftCards.container;

import GiftCards.giftcardinformation.TileEntityGiftCard;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by MrKickkiller on 7/09/2015.
 */
public class ContainerGiftCard extends Container {
    protected TileEntityGiftCard tileEntity;

    public ContainerGiftCard(TileEntity tileEntity) {
        this.tileEntity = (TileEntityGiftCard) tileEntity;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}
