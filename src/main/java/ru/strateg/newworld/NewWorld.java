package ru.strateg.newworld;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.strateg.newworld.common.CommonProxy;

/**
 * Created by Alex on 06.06.2017.
 */
@Mod(modid = NewWorld.MODID, version = NewWorld.VERSION)
public class NewWorld
{
    public static final String MODID = "newworld";
    public static final String VERSION = "1.0";

    @Mod.Instance(MODID)
    public static NewWorld newWorld;

    @SidedProxy(clientSide = "ru.strateg.newworld.client.ClientProxy",
                serverSide = "ru.strateg.newworld.common.CommonProxy")
    public static CommonProxy proxy;




    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

}
