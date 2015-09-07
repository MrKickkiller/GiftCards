package GiftCards.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

/**
 * Created by Mathieu on 7/09/2015.
 */
public class GuiGiftCard extends GuiContainer {
    public static final int GUI_ID = 20;

    public GuiGiftCard(Container container) {
        super(container);
    }


    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        this.drawDefaultBackground();
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y) {

        super.drawGuiContainerForegroundLayer(x, y);
    }
}
