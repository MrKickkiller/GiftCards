import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import proxy.CommonProxy;
import reference.References;

@Mod(modid = GiftCards.MODID, version = GiftCards.VERSION)
public class GiftCards
{
    public static final String MODID = References.MOD_ID;
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "proxy.ClientProxy",serverSide = "proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

}
