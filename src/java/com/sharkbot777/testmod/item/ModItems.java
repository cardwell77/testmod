package com.sharkbot777.testmod.item;

public final class ModItems {

    public static Item testitem;

    public static final void init() {
        testitem = new Item().setUnlocalizedName("testitem").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":testitem");
        GameRegistry.registerItem(testitem, "testitem");
    }


}
