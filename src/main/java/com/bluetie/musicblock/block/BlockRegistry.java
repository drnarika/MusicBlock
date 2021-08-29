package com.bluetie.musicblock.block;

import com.bluetie.musicblock.block.half.BlockHalfIronMusicBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "musicblock")
public class BlockRegistry {
    public static String modid="musicblock";
    public static void BRegistry() {
        BlockHalfIronMusicBlock.SetItemBlock();
    }

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(BlockHalfIronMusicBlock.GetBlock());
    }

    @SubscribeEvent
    public static void registerItemBlock(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(
                BlockHalfIronMusicBlock.GetItemBlock()
        );
    }
}

