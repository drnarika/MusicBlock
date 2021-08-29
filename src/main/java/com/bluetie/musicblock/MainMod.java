package com.bluetie.musicblock;

import com.bluetie.musicblock.block.half.BlockHalfIronMusicBlock;
import com.bluetie.musicblock.block.BlockRegistry;
import com.bluetie.musicblock.item.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = "musicblock", name = "MusicBlock", version = "1.0.0", useMetadata = true,acceptedMinecraftVersions = "1.12.2",acceptableRemoteVersions = "1.12.2")
public enum MainMod {
        INSTANCE;

        @Mod.InstanceFactory
        public static MainMod getInstance() {
            return INSTANCE;
        }

    public static final CreativeTabs MUSIC_BLOCK = new CreativeTabs("music_block") {
            @Override
        @SideOnly(Side.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(BlockHalfIronMusicBlock.GetItemBlock());
        }
    };

        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event) {
            //注册
            ItemRegistry.IRegistry();
            BlockRegistry.BRegistry();
        }

}