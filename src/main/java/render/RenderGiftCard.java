package render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

/**
 * Created by MrKickkiller on 30/08/2015.
 *
 * The custom renderer for a GiftCard block.
 * Model: models/GiftCard.obj
 * UVMap/Texture: models/GiftCardUV.png
 */
public class RenderGiftCard extends TileEntitySpecialRenderer {
    private IModelCustom giftCard;
    private ResourceLocation giftCardTexture;


    public RenderGiftCard() {
        ResourceLocation location = new ResourceLocation("giftcards","models/GiftCard.obj");
        giftCard = AdvancedModelLoader.loadModel(location);
        giftCardTexture = new ResourceLocation("giftcards","models/GiftCardUV.png");
    }

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
        GL11.glTranslated(x, y, z);
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);  // save the settings
        GL11.glDisable(GL11.GL_CULL_FACE);

        bindTexture(giftCardTexture);
        giftCard.renderAll();

        GL11.glPopMatrix();
        GL11.glPopAttrib(); // restore the settings
    }
}
