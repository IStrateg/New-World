package ru.strateg.newworld.common;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.strateg.newworld.Config;

/**
 * Created by Alex on 06.06.2017.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event)
    {
        Config.register(event);
    }

    public void init(FMLInitializationEvent event)
    {}

    public void postInit(FMLPostInitializationEvent event)
    {}

}
