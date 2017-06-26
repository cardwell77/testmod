package com.sharkbot777.testmod;

import com.sharkbot777.testmod.ModBlocks;
import com.sharkbot777.testmod.ModItems;
import com.sharkbot777.testmod.block.ModBlocks;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        ModItems.init();
        ModBlocks.init();

    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
