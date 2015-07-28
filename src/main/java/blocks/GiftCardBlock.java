package blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import reference.References;

/**
 * Created by Mathieu on 28/07/2015.
 */
abstract class GiftCardBlock extends Block {

    protected GiftCardBlock(Material p_i45394_1_) {
        super(p_i45394_1_);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("block.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }


    public String getUnlocalizedName(ItemStack itemStack)
    {

        return String.format("block.%s%s", References.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


}
