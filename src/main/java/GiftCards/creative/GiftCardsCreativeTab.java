package GiftCards.creative;

import GiftCards.init.ContentInit;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


/**
 * Created by MrKickkiller on 27/07/2015.
 *
 */
public class GiftCardsCreativeTab {

    public static CreativeTabs GiftCards = new CreativeTabs("GiftCards") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            Item iconItem = new ItemStack(ContentInit.giftCardBlock).getItem();
            if (iconItem != null){
                return iconItem;
            }else
            {
                Block iconItemSecond = ContentInit.giftCardBlock;
                if (iconItemSecond != null){
                    return Item.getItemFromBlock(iconItemSecond);
                }else {
                    return null;
                }
            }
        }


        @Override
        public String getTranslatedTabLabel() {
            return "GiftCards";
        }
    };
}
