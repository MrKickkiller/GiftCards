package items;

import blocks.GiftCardB;
import giftcardinformation.*;
import init.ContentInit;
import net.minecraft.block.BlockContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import reference.Names;

/**
 * Created by MrKickkiller on 27/07/2015.
 */
public class GiftCardI extends GiftCardItem {

    private String name;

    private GiftCard giftCard;

    public GiftCardI(String name) {
        this(new GiftCard(),name);
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

        BlockContainer blockContainer = (BlockContainer) ContentInit.giftCardBlock;
        GiftCard giftCard = (GiftCard) blockContainer.createTileEntity(world, 0);

        NBTTagCompound tags = item.getTagCompound();
        System.out.println(tags);

        if (tags != null) {
            giftCard.setSender(new Sender(
                    AbstractPlayer.resolvePlayerFromString(world, tags.getString("sender"))));
            giftCard.setReceiver(new Receiver(AbstractPlayer.resolvePlayerFromString(world, tags.getString("receiver"))));
            giftCard.setMessage(new Message(tags.getString("message")+ "Test"));
        }else {
            item.setTagCompound(new NBTTagCompound());
            item.getTagCompound().setString("sender","No-one");
        }

        ((GiftCardB) blockContainer).setGiftCard(giftCard);
        world.setBlock(posx, posy + 1, posz, blockContainer);
        System.out.println("Removing");
        player.inventory.consumeInventoryItem(player.inventory.getCurrentItem().getItem());
        return true;
    }

    @Override
    public void onCreated(ItemStack itemStack, World world, EntityPlayer player) {
        System.out.println("created");
        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
        nbtTagCompound.setString("sender", "");
        nbtTagCompound.setString("message", "Hi There");
        nbtTagCompound.setString("receiver", "");
    }

    public void setGiftCard(GiftCard giftCard) {
        this.giftCard = giftCard;
    }



}

