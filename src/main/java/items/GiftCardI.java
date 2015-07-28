package items;

import giftcardinformation.GiftCard;
import init.ContentInit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import reference.Names;

/**
 * Created by MrKickkiller on 27/07/2015.
 */
public class GiftCardI extends GiftCardItem {

    private String name;

    private GiftCard giftCard;

    public GiftCardI(String name) {
        super();
        this.setUnlocalizedName(Names.Items.GIFT_CARD);
        this.setCreativeTab(creative.GiftCardsCreativeTab.GiftCards);
        this.name = name;
        this.setMaxStackSize(1);
        this.giftCard = new GiftCard();
    }

    public GiftCardI (GiftCard giftCard, String name){
        super();
        this.setUnlocalizedName(Names.Items.GIFT_CARD);
        this.setCreativeTab(creative.GiftCardsCreativeTab.GiftCards);
        this.name = name;
        this.setMaxStackSize(1);
        this.giftCard = giftCard;
    }

    public boolean onItemUse(ItemStack item, EntityPlayer player, World world,
                             // which block was in the target when clicked
                             int posx, int posy, int posz,
                             // where on the target block was clicked (0.0-1.0)
                             int side, float blockx, float blocky, float blockz) {
        if (world.isRemote) {
            // can't do anything here as we don't own the world (client side)
            return false;
        }
        // server side - here we can change the block

        ContentInit.giftCardBlock.setGiftCard(this.giftCard);
        world.setBlock(posx, posy + 1, posz, ContentInit.giftCardBlock);
        System.out.println("Removing");
        player.inventory.consumeInventoryItem(player.inventory.getCurrentItem().getItem());
        return true;
    }

    public void setGiftCard(GiftCard giftCard) {
        this.giftCard = giftCard;
    }
}

