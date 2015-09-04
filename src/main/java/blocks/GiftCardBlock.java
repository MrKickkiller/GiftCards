package blocks;

import creative.GiftCardsCreativeTab;
import giftcardinformation.TileEntityGiftCard;
import init.ContentInit;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import reference.References;

/**
 * Created by MrKickkiller on 28/07/2015.
 * Class that represents the GiftCard block and that holds the TileEntity that stores the data.
 */
public class GiftCardBlock extends BlockContainer {

    public GiftCardBlock() {
        super(Material.ground);
		setCreativeTab(GiftCardsCreativeTab.GiftCards);
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
        return new TileEntityGiftCard();
    }

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack stack) {
		if (stack.stackTagCompound == null)
			return;
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		if (tileEntity instanceof TileEntityGiftCard) {
			TileEntityGiftCard entity = (TileEntityGiftCard) tileEntity;
			entity.loadCardFromNBT(stack.stackTagCompound);
		}
	}

	@Override
	public void onBlockHarvested(World world, int x, int y, int z, int meta, EntityPlayer player) {
		ItemStack stack = new ItemStack(ContentInit.giftCardBlock);
		stack.stackTagCompound = new NBTTagCompound();
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		if (tileEntity instanceof TileEntityGiftCard) {
			((TileEntityGiftCard) tileEntity).saveCardToNBT(stack.stackTagCompound);
		}
		EntityItem dropCard = new EntityItem(world, x, y, z, stack);
		world.spawnEntityInWorld(dropCard);
		world.setBlockToAir(x, y, z);
	}


    //This will tell minecraft not to render any side of our cube.
    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return false;
    }

    //And this tell it that you can see through this block, and neighbor blocks should be rendered.
    public boolean isOpaqueCube()
    {
        return false;
    }

}
