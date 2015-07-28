package blocks;

import giftcardinformation.GiftCard;
import init.ContentInit;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import reference.Names;

import java.util.Random;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class GiftCardB extends GiftCardBlock {

    private String name;

    private GiftCard giftCard;

    public GiftCardB(String name) {
        super(Material.ground);
        this.setBlockName(Names.Blocks.GIFT_CARD);
        this.setBlockTextureName(Names.Blocks.GIFT_CARD);
        this.setCreativeTab(creative.GiftCardsCreativeTab.GiftCards);
        this.name = name;
        this.giftCard = new GiftCard();
    }

    public GiftCardB(GiftCard giftCard,String name){
        super(Material.ground);
        this.giftCard = giftCard;
        this.setBlockName(Names.Blocks.GIFT_CARD);
        this.setBlockTextureName(Names.Blocks.GIFT_CARD);
        this.setCreativeTab(creative.GiftCardsCreativeTab.GiftCards);
        this.name = name;

    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        ContentInit.giftCardItem.setGiftCard(this.giftCard);
        return ContentInit.giftCardItem;
    }

    public void setGiftCard(GiftCard giftCard) {
        this.giftCard = giftCard;
    }
}
