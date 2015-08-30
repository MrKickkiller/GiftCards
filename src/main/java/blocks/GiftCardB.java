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

    private GiftCardTileEntity giftCardTileEntity;

    public GiftCardB(String name) {
        this(new GiftCardTileEntity(),name);
    }

    public GiftCardB(GiftCardTileEntity giftCardTileEntity,String name){
        super();
        this.giftCardTileEntity = giftCardTileEntity;
        this.setBlockName(Names.Blocks.GIFT_CARD);
        this.setBlockTextureName(Names.Blocks.GIFT_CARD);
        this.setCreativeTab(creative.GiftCardsCreativeTab.GiftCards);
        this.name = name;
    }


    public void setGiftCardTileEntity(GiftCardTileEntity giftCardTileEntity) {
        this.giftCardTileEntity = giftCardTileEntity;
    }


    /*@Override
    public void onBlockHarvested(World world, int x, int y, int z, int meta, EntityPlayer player) {
        ItemStack card = new ItemStack(ContentInit.giftCardItem);

        EntityItem dropCard = new EntityItem(world,x,y,z,card);


        System.out.println("HasNulls " + giftCardTileEntity.hasNulls());
        System.out.println("giftCard = " + giftCardTileEntity);
        if (giftCardTileEntity != null && dropCard.getEntityData() != null && !giftCardTileEntity.hasNulls()) {
            dropCard.getEntityData().setString("sender", giftCardTileEntity.getSender().toString());
            dropCard.getEntityData().setString("message", giftCardTileEntity.getMessage().getMessage());
            dropCard.getEntityData().setString("receiver", giftCardTileEntity.getReceiver().toString());
        }
        else {
            dropCard.getEntityData().setString("sender","Test");
            dropCard.getEntityData().setString("message","Hi There");
            dropCard.getEntityData().setString("receiver","Testing");
        }
        System.out.println("getEntityData : " + dropCard.getEntityData());

        world.spawnEntityInWorld(dropCard);
        world.setBlockToAir(x, y, z);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack item) {
        System.out.println("OnBlockPlacedBy");
        if (giftCardTileEntity == null) {
            giftCardTileEntity = new GiftCardTileEntity();
        }
        giftCardTileEntity.setSender(new Sender(item.getTagCompound().getString("sender"), world));
        giftCardTileEntity.setReceiver(new Receiver(item.getTagCompound().getString("receiver"),world));
        giftCardTileEntity.setMessage(new Message(item.getTagCompound().getString("message")));
    }

    public GiftCardTileEntity getGiftCardTileEntity() {
        return giftCardTileEntity;
    }*/
}
