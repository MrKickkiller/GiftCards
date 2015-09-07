package GiftCards.proxy;

import GiftCards.GiftCards;
import GiftCards.gui.guihandler.GiftCardGuiHandler;
import GiftCards.init.ContentInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

/**
 * Created by MrKickkiller on 30/08/2015.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
        // Init all content in the mod.
        new ContentInit().init();
        NetworkRegistry.INSTANCE.registerGuiHandler(GiftCards.instance, new GiftCardGuiHandler());
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
