package com.speedstersreborn;

import com.speedstersreborn.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SpeedsterHeroesReborn.MODID, name = SpeedsterHeroesReborn.NAME, version = SpeedsterHeroesReborn.VERSION)
public class SpeedsterHeroesReborn
{
    @Mod.Instance
    public static SpeedsterHeroesReborn instance;

    @SidedProxy(clientSide = "com.speedstersreborn.proxy.ClientProxy", serverSide = "com.speedstersreborn.proxy.CommonProxy")
    public static IProxy proxy;

    public static final String MODID = "shr";
    public static final String NAME = "Speedsters Heroes Reborn";
    public static final String VERSION = "0.0.1";


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
