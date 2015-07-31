package blocks;

import giftcardinformation.*;
import init.ContentInit;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import reference.Names;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class GiftCardB extends GiftCardBlock {

    private String name;

    private GiftCard giftCard;

    public GiftCardB(String name) {
        this(new GiftCard(),name);
    }

    public GiftCardB(GiftCard giftCard,String name){
        super(Material.ground);
        this.giftCard = giftCard;
        this.setBlockName(Names.Blocks.GIFT_CARD);
        this.setBlockTextureName(Names.Blocks.GIFT_CARD);
        this.setCreativeTab(creative.GiftCardsCreativeTab.GiftCards);
        this.name = name;
    }


    public void setGiftCard(GiftCard giftCard) {
        this.giftCard = giftCard;
    }


    @Override
    public void onBlockHarvested(World world, int x, int y, int z, int p_149681_5_, EntityPlayer player) {
        ItemStack card = new ItemStack(ContentInit.giftCardItem);

        EntityItem dropCard = new EntityItem(world,x,y,z,card);


        System.out.println("Filled in " + giftCard.hasNulls());
        System.out.println("giftCard = " + giftCard);
        if (giftCard != null && dropCard.getEntityData() != null && !giftCard.hasNulls()) {
            dropCard.getEntityData().setString("sender", giftCard.getSender().toString());
            dropCard.getEntityData().setString("message", giftCard.getMessage().getMessage());
            dropCard.getEntityData().setString("receiver", giftCard.getReceiver().toString());
        }
        else {
            dropCard.getEntityData().setString("sender","Test");
            dropCard.getEntityData().setString("message","Hi There");
            dropCard.getEntityData().setString("receiver","Testing");
        }
        System.out.println(dropCard.getEntityData());

        world.spawnEntityInWorld(dropCard);
        world.setBlockToAir(x, y, z);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack item) {
        System.out.println("OnBlockPlacedBy");
        if (giftCard == null) {
            giftCard = new GiftCard();
        }
        giftCard.setSender(new Sender(AbstractPlayer.resolvePlayerFromString(world, item.getTagCompound().getString("sender"))));
        giftCard.setReceiver(new Receiver(AbstractPlayer.resolvePlayerFromString(world, item.getTagCompound().getString("receiver"))));
        giftCard.setMessage(new Message(item.getTagCompound().getString("message")));
    }
}
