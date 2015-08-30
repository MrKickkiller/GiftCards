package init;

import blocks.GiftCardB;
import cpw.mods.fml.common.registry.GameRegistry;
import giftcardinformation.GiftCardTileEntity;
import items.GiftCardItemBlock;
import reference.Names;
import reference.References;

/**
 * Created by MrKickkiller on 27/07/2015.
 */
public class ContentInit {

    public static GiftCardItemBlock giftCardItem;
    public static GiftCardB giftCardBlock;

    public void instantiateItems(){
        giftCardItem = new GiftCardItemBlock(References.GIFTCARD_NAME);
        giftCardBlock = new GiftCardB(References.GIFTCARD_NAME);
    }

    public void registerItems(){
        GameRegistry.registerItem(giftCardItem, Names.Items.GIFT_CARD);
        GameRegistry.registerBlock(giftCardBlock, Names.Blocks.GIFT_CARD);
        GameRegistry.registerTileEntity(GiftCardTileEntity.class, Names.TileEntities.GIFT_CARDTE);
    }

    public void init(){
        instantiateItems();
        registerItems();
    }




}
