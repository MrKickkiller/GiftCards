package init;

import blocks.GiftCardB;
import cpw.mods.fml.common.registry.GameRegistry;
import items.GiftCardI;
import reference.Names;
import reference.References;

/**
 * Created by MrKickkiller on 27/07/2015.
 */
public class ContentInit {

    public static GiftCardI giftCardItem;
    public static GiftCardB giftCardBlock;

    public void instantiateItems(){
        giftCardItem = new GiftCardI(References.GIFTCARD_NAME);
        giftCardBlock = new GiftCardB(References.GIFTCARD_NAME);
    }

    public void registerItems(){
        GameRegistry.registerItem(giftCardItem, Names.Items.GIFT_CARD);
        GameRegistry.registerBlock(giftCardBlock, Names.Blocks.GIFT_CARD);
    }

    public void init(){
        instantiateItems();
        registerItems();
    }




}
