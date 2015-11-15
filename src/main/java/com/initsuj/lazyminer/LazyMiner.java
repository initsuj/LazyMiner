package com.initsuj.lazyminer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = BuildConfig.MODID, version = BuildConfig.VERSION, name = BuildConfig.NAME)
public class LazyMiner {
    //public static final String NAME = "Lazy Miner";
    // public static final String MODID = "lazyminer";
    //public static final String VERSION = "1.0";

    @Mod.Instance(BuildConfig.MODID)
    public static LazyMiner instance;

    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLInitializationEvent event) {

    }
}
