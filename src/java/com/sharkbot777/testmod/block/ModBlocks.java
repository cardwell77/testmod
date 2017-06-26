package com.sharkbot777.testmod.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.gradle.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

    public static Block testBlock;

    public static final void init()  {
        GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorialBlock", Material.iron), "tutorialBlock");

    }
}