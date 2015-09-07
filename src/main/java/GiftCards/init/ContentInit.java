package GiftCards.init;

import GiftCards.blocks.GiftCardBlock;
import GiftCards.giftcardinformation.TileEntityGiftCard;
import GiftCards.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by MrKickkiller on 27/07/2015.
 * Initialise all content in the mod.
 */
public class ContentInit {

    public static GiftCardBlock giftCardBlock;

    public void instantiateItems(){
        giftCardBlock = new GiftCardBlock();
    }

    public void registerItems(){
        GameRegistry.registerBlock(giftCardBlock, Names.Blocks.GIFT_CARD).setBlockName(Names.Blocks.GIFT_CARD);
        GameRegistry.registerTileEntity(TileEntityGiftCard.class, Names.TileEntities.GIFT_CARDTE);
    }

    public void init(){
        instantiateItems();
        registerItems();
    }




}
