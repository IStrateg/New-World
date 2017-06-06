package ru.strateg.newworld;

import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Alex on 06.06.2017.
 */
public class Config {
    public static Configuration config;

    // Block hardness
    public static float hardnessOfStone;
    public static float hardnessOfIronOre;


    public static void register(FMLPreInitializationEvent event) {
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        hardnessOfStone = config.getFloat("hardnesOfStone","hardness", 100.0f, 100.0f, 500.0f,
                        I18n.format("config.hardnessOfStone"), "config.hardnessOfStone.name");

        hardnessOfIronOre = config.getFloat("hardnesOfIronOre","hardness", 1000.0f, 1000.0f, 5000.0f,
                I18n.format("config.hardnessOfIronOre"), "config.hardnessOfIronOre.name");



        config.save();
    }
}
