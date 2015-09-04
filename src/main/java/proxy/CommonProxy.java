package proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import init.ContentInit;

/**
 * Created by MrKickkiller on 30/08/2015.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
        // Init all content in the mod.
        new ContentInit().init();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
