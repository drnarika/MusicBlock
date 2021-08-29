package com.bluetie.musicblock.block;

import com.bluetie.musicblock.block.half.BlockHalfGoldMusicBlock;
import com.bluetie.musicblock.block.half.BlockHalfIronMusicBlock;
import com.bluetie.musicblock.block.half.BlockHalfStoneMusicBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "musicblock")
public class BlockRegistry {
    public static String modid="musicblock";

    public static void BRegistry() {
        BlockHalfStoneMusicBlock.SetItemBlock();
        BlockHalfIronMusicBlock.SetItemBlock();
        BlockHalfGoldMusicBlock.SetItemBlock();
    }

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockHalfStoneMusicBlock.GetBlock(),
                BlockHalfIronMusicBlock.GetBlock(),
                BlockHalfGoldMusicBlock.GetBlock()
        );
    }

    @SubscribeEvent
    public static void registerItemBlock(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                BlockHalfStoneMusicBlock.GetItemBlock(),
                BlockHalfIronMusicBlock.GetItemBlock(),
                BlockHalfGoldMusicBlock.GetItemBlock()
        );
    }
}

