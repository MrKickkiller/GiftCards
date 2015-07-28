import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import init.ContentInit;
import reference.References;

@Mod(modid = GiftCards.MODID, version = GiftCards.VERSION)
public class GiftCards
{
    public static final String MODID = References.MOD_ID;
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        new ContentInit().init();
    }
}
