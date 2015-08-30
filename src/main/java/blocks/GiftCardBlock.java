package blocks;

import giftcardinformation.GiftCardTileEntity;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import reference.References;

import java.util.List;

/**
 * Created by Mathieu on 28/07/2015.
 */
public class GiftCardBlock extends BlockContainer {

    protected GiftCardBlock() {
        super(Material.ground);
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

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new GiftCardTileEntity();
    }



}
