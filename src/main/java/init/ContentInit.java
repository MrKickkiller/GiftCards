package init;

import blocks.GiftCardBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import giftcardinformation.TileEntityGiftCard;
import reference.Names;

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
